package Model;

import java.util.concurrent.Semaphore;

public class Chef extends Thread {
    
    private final int type; // (entrees, main dishes, desserts) => (0,1,2)
    private final int time; //Time it takes for the chef to create a dish
    private boolean hired; //Boolean to manage if the chef is working
    private final Storage storage;
    
    //Semaphores
    Semaphore prodSem, excSem, waitressSem;

    public Chef(Storage storage, Semaphore prodSem, Semaphore excSem, Semaphore waitressSem, int time, int type) {
        this.type = type;
        this.time = time;
        this.hired = true;
        
        //Semaphores
        this.storage = storage;
        this.prodSem = prodSem;
        this.excSem = excSem;
        this.waitressSem = waitressSem;
    }

    @Override
    public void run() {
        while(this.hired){
            
            try {
                this.prodSem.acquire();
                
                //Producing a new dish
                Thread.sleep(this.time);
                
                this.excSem.acquire();
                    //Critic Section
                    switch(this.type) {
                        case 0:
                            this.storage.setFood(1, Kitchen.nextPosCE);
                            Kitchen.nextPosCE = ((Kitchen.nextPosCE + 1) % this.storage.getSize());
                            Kitchen.entreesCounter++;
                            break;
                        case 1:
                            this.storage.setFood(1, Kitchen.nextPosCM);
                            Kitchen.nextPosCM = ((Kitchen.nextPosCM + 1) % this.storage.getSize());
                            Kitchen.mainDishesCounter++;
                            break;
                        case 2:
                            this.storage.setFood(1, Kitchen.nextPosCD);
                            Kitchen.nextPosCD = ((Kitchen.nextPosCD + 1) % this.storage.getSize());
                            Kitchen.dessertsCounter++;
                            break;
                        default:
                            System.out.println("Ok, something weird is going on.");
                            break;
                    }
                this.excSem.release();
                this.waitressSem.release();

            } catch (InterruptedException e) {
                System.out.println("There was an error with a Chef!");
                System.out.println(e);
            }
            
        }
    }
    
    public void fire() {
        this.hired = false;
    }
    
}
