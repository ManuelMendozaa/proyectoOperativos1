package Model;

import java.util.concurrent.Semaphore;

public class Waitress extends Thread{
    
    private boolean hired;
    private final Storage entrees, mainDishes, desserts;
    private final int time;
    private final Semaphore pEntreesSem, pMainDishesSem, pDessertsSem;
    private final Semaphore wEntreesSem, wMainDishesSem, wDessertsSem;
    private final Semaphore entreeExSem, mainDishesExSem, dessertsExSem;
    private final Semaphore mutexOrders;

    public Waitress(Storage entrees, Storage mainDishes, Storage desserts, Semaphore pEntreesSem, Semaphore pMainDishesSem, Semaphore pDessertsSem, Semaphore entreeExSem, Semaphore mainDishesExSem, Semaphore dessertsExSem, Semaphore wEntreesSem, Semaphore wMainDishesSem, Semaphore wDessertsSem, Semaphore mutexOrders, int time) {
        
        this.time = time;
        
        this.hired = true;

        //Storages
        this.entrees = entrees;
        this.mainDishes = mainDishes;
        this.desserts = desserts;
        
        //Semaphores
        this.pEntreesSem = pEntreesSem;
        this.pMainDishesSem = pMainDishesSem;
        this.pDessertsSem = pDessertsSem;
        
        this.entreeExSem = entreeExSem;
        this.mainDishesExSem = mainDishesExSem;
        this.dessertsExSem = dessertsExSem;
        
        this.wEntreesSem = wEntreesSem;
        this.wMainDishesSem = wMainDishesSem;
        this.wDessertsSem = wDessertsSem;
        
        this.mutexOrders = mutexOrders;
        
    }
    
    
    @Override
    public void run() {
        try {
            while(this.hired) {
                this.wEntreesSem.acquire(3);
                this.wMainDishesSem.acquire(2);
                this.wDessertsSem.acquire();
                    this.entreeExSem.acquire();
                        for (int i = 0; i < 3; i++) {
                            this.entrees.setFood(0, Kitchen.nextPosWE);
                            Kitchen.entreesCounter--;
                            Kitchen.nextPosWE = ((Kitchen.nextPosWE + 1) % this.entrees.getSize());
                        }
                    this.entreeExSem.release();

                    this.mainDishesExSem.acquire();
                        for (int i = 0; i < 2; i++) {
                            this.mainDishes.setFood(0, Kitchen.nextPosWM);
                            Kitchen.mainDishesCounter--;
                            Kitchen.nextPosWM = ((Kitchen.nextPosWM + 1) % this.mainDishes.getSize());
                        }
                    this.mainDishesExSem.release();

                    this.dessertsExSem.acquire();
                        this.desserts.setFood(0, Kitchen.nextPosWD);
                        Kitchen.dessertsCounter--;
                        Kitchen.nextPosWD = ((Kitchen.nextPosWD + 1) % this.desserts.getSize());
                    this.dessertsExSem.release();
                this.pEntreesSem.release(3);
                this.pMainDishesSem.release(2);
                this.pDessertsSem.release();

                this.mutexOrders.acquire();
                    Kitchen.incrementOrders();
                this.mutexOrders.release();
                
                Thread.sleep(this.time);
                
            }
            
        } catch (InterruptedException e) {
            System.out.println("Ups! Something went wrong.");
        }
    }
    
    public void fire() {
        this.hired = false;
    }
    
}
