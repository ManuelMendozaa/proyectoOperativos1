package Model;

import java.util.concurrent.Semaphore;

public class Boss extends Thread {

    private static boolean working;
    private final Semaphore timeManagement;
    private final int time;
    
    public Boss(Semaphore timeManagement, int time) {
        
        this.timeManagement = timeManagement;
        this.time = time;
        Boss.working = false;
        
    }

    @Override
    public void run() {
        while(true) {
            
            try {
                Thread.sleep(this.time*15);
                this.timeManagement.acquire();
                    //Critic Section
                    Boss.working = true;
                    Thread.sleep(this.time);
                        if(Kitchen.hoursLeft == 0) {
                            Kitchen.hoursLeft = Kitchen.getHoursToWork();
                        } else {
                            Kitchen.hoursLeft--;
                        }
                this.timeManagement.release();
                Boss.working = false;
                
            } catch(InterruptedException e) {
                System.out.println("Ups, something went wrong");
            }
            
        }
    }
    
    public static String state() {
        if(Boss.working) {
            return "Working";
        }
        return "Resting";
    }
    
}
