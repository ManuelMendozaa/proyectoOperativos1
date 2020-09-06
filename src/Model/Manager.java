package Model;

import java.util.concurrent.Semaphore;

public class Manager extends Thread {

    private static boolean working;
    private final Semaphore timeManagement, mutexOrders;
    private final int minTime, maxTime;
    private int nextChecking;
    
    public Manager(Semaphore timeManagement, Semaphore mutexOrders, int minTime, int maxTime) {
        
        Manager.working = false;
        this.timeManagement = timeManagement;
        this.minTime = minTime;
        this.maxTime = maxTime;
        this.nextChecking = (minTime*20/9);
        this.mutexOrders = mutexOrders;
        
    }
    
    @Override
    public void run() {
        while(true) {
            try {
                
                Thread.sleep(nextChecking);
                Manager.working = true;
                this.timeManagement.acquire();
                    //Critic Section
                    Manager.working = true;
                    if(Kitchen.hoursLeft == 0) {
                        Thread.sleep(50);
                        Kitchen.hoursLeft = Kitchen.getHoursToWork();
                        this.mutexOrders.acquire();
                            Kitchen.resetOrders();
                        this.mutexOrders.release();
                    }
                this.timeManagement.release();
                this.nextChecking = this.minTime + (int)(Math.random()*(this.maxTime-this.minTime));
                Manager.working = false;
                
            } catch(InterruptedException e) {
                System.out.println("Ups, something went wrong");
            }
        }
    }
    
    public static String state() {
        if(Manager.working) {
            return "Working";
        }
        
        return "Sleeping";
    }
    
}
