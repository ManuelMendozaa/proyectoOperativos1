package Model;

import java.util.concurrent.Semaphore;

public class Kitchen {

    private static int hoursInSeconds, workHours;
    private static int entreeChefsCounter, mainChefsCounter, dessertChefsCounter, ordersCounter;
    public static int entreesCounter, mainDishesCounter, dessertsCounter, waitressesCounter;
    
    //Employees
    private final Manager manager;
    private final Boss boss;
    private final Waitress[] waitress;
    private final Chef[] entreesChef, mainDishesChef, dessertsChef;
    private final Storage entreesStorage, mainDishesStorage, dessertsStorage;
    
    //Semaphores
    private final Semaphore sEntree, sMainDish, sDessert;
    private final Semaphore eEntree, eMainDish, eDessert;
    private final Semaphore nEntree, nMainDish, nDessert;
    private final Semaphore mutexOrders;
    
    private final Semaphore timeManagment;
    
    //Critic Section's Variables
    public static int nextPosCE, nextPosCM, nextPosCD, nextPosWE, nextPosWM, nextPosWD;
    public static int hoursLeft;
    
    public Kitchen(int workHours, int hoursInSeconds, int maxEntrees, int maxMainDishes, int maxDesserts, int initEntreeChefs, int maxEntreeChefs, int initMainChefs, int maxMainChefs, int initDessertChefs, int maxDessertChefs, int initWaitresses, int maxWaitresses) {
        
        //Entree's Semaphores
        this.sEntree = new Semaphore(maxEntrees);
        this.eEntree = new Semaphore(1);
        this.nEntree = new Semaphore(0);
        
        //Main Dishe's Semaphores
        this.sMainDish = new Semaphore(maxMainDishes);
        this.eMainDish = new Semaphore(1);
        this.nMainDish = new Semaphore(0);
        
        //Dessert's Semaphores
        this.sDessert = new Semaphore(maxDesserts);
        this.eDessert = new Semaphore(1);
        this.nDessert = new Semaphore(0);
        
        //Orders' Semaphore
        this.mutexOrders = new Semaphore(1);
        
        //Time Semaphore
        this.timeManagment = new Semaphore(1);
        
        //Basic variables
        Kitchen.workHours = workHours;
        Kitchen.hoursLeft = workHours;
        Kitchen.hoursInSeconds = hoursInSeconds;
        
        //Creating the storages.
        this.entreesStorage = new Storage(maxEntrees);
        this.mainDishesStorage = new Storage(maxMainDishes);
        this.dessertsStorage = new Storage(maxDesserts);
        
        //Hiring manager and boss
        this.manager = new Manager(this.timeManagment, this.mutexOrders, this.timeCalculus()*1/4, this.timeCalculus()*9/20);
        this.manager.start();
        this.boss = new Boss(this.timeManagment, this.timeCalculus()*1/16);
        this.boss.start();
        
        //Init counters for every chef's type
        Kitchen.entreeChefsCounter = 0;
        Kitchen.mainDishesCounter = 0;
        Kitchen.dessertChefsCounter = 0;
        Kitchen.waitressesCounter = 0;
        
        //Hiring chefs
        this.entreesChef = new Chef[maxEntreeChefs];
        for(int i = 0; i < initEntreeChefs; i++) {
            this.HireEntreeChef();
        }
        
        this.mainDishesChef = new Chef[maxMainChefs];
        for(int i = 0; i < initMainChefs; i++) {
            this.HireMainChef();
        }
        
        this.dessertsChef = new Chef[maxDessertChefs];
        for(int i = 0; i < initDessertChefs; i++) {
            this.HireDessertChef();
        }
        
        this.waitress = new Waitress[maxWaitresses];
        for(int i = 0; i < initWaitresses; i++) {
            this.HireWaitress();
        }
        
        //Init dishes' counters
        Kitchen.entreesCounter = 0;
        Kitchen.mainDishesCounter = 0;
        Kitchen.dessertsCounter = 0;
        Kitchen.ordersCounter = 0;
        
        //Init Critic Section variables
        Kitchen.nextPosWD = 0;
        Kitchen.nextPosWE = 0;
        Kitchen.nextPosWM = 0;
        Kitchen.nextPosCD = 0;
        Kitchen.nextPosCE = 0;
        Kitchen.nextPosCM = 0;
        
    }
    
    //Converting time to the Sleep()'s scale
    private int timeCalculus() {
        return (int)((Kitchen.hoursInSeconds)*1000);
    }
    
    public static void incrementOrders() {
        Kitchen.ordersCounter++;
    }
    
    public static void resetOrders() {
        Kitchen.ordersCounter = 0;
    }
    
    
    //Hire Methods
    public void HireEntreeChef(){
        
        if(!(Kitchen.entreeChefsCounter == this.entreesChef.length)) {
            for (int i = 0; i < this.entreesChef.length; i++) {
                if(this.entreesChef[i] == null) {
                    this.entreesChef[i] = new Chef(this.entreesStorage, this.sEntree, this.eEntree, this.nEntree, this.timeCalculus(), 0);
                    this.entreesChef[i].start();
                    Kitchen.entreeChefsCounter++;
                    System.out.println("Entree Chef hire!");
                    return;
                }
            }
        }
        
    }
    
    public void HireMainChef(){
        
        if(!(Kitchen.mainChefsCounter == this.mainDishesChef.length)) {
            for (int i = 0; i < this.mainDishesChef.length; i++) {
                if(this.mainDishesChef[i] == null) {
                    this.mainDishesChef[i] = new Chef(this.mainDishesStorage, this.sMainDish, this.eMainDish, this.nMainDish, this.timeCalculus()*2,  1);
                    this.mainDishesChef[i].start();
                    Kitchen.mainChefsCounter++;
                    System.out.println("Main Dish Chef hire!");
                    return;
                }
            }
        }
        
    }
    
    public void HireDessertChef(){
        
        if(!(Kitchen.dessertChefsCounter == this.dessertsChef.length)) {
            for (int i = 0; i < this.dessertsChef.length; i++) {
                if(this.dessertsChef[i] == null) {
                    this.dessertsChef[i] = new Chef(this.dessertsStorage, this.sDessert, this.eDessert, this.nDessert, this.timeCalculus()*3, 2);
                    this.dessertsChef[i].start();
                    Kitchen.dessertChefsCounter++;
                    System.out.println("New Dessert Chef hire!");
                    return;
                }
            }
        }
        
    }

    public void HireWaitress(){
        
        if(!(Kitchen.waitressesCounter == this.waitress.length)) {
            for (int i = 0; i < this.waitress.length; i++) {
                if(this.waitress[i] == null) {
                    this.waitress[i] = new Waitress(this.entreesStorage, this.mainDishesStorage, this.dessertsStorage, this.sEntree, this.sMainDish, this.sDessert, this.eEntree, this.eMainDish, this.eDessert, this.nEntree, this.nMainDish, this.nDessert, this.mutexOrders, this.timeCalculus()*3/20);
                    this.waitress[i].start();
                    Kitchen.waitressesCounter++;
                    System.out.println("New Waitress hire!");
                    return;
                }
            }
        }
        
    }
    
    
    //Fire Methods
    public void FireEntreeChef() {
        
        if(!(Kitchen.entreeChefsCounter == 0)) {
            for(int i = 0; i < this.entreesChef.length; i++) {
                if(this.entreesChef[i] != null) {
                    this.entreesChef[i].fire();
                    this.entreesChef[i] = null;
                    Kitchen.entreeChefsCounter--;
                    System.out.println("Entree Chef fire!");
                    return;
                }
            }
        }
        
    }
    
    public void FireMainChef() {
        
        if(!(Kitchen.mainChefsCounter == 0)) {
            for(int i = 0; i < this.mainDishesChef.length; i++) {
                if(this.mainDishesChef[i] != null) {
                    this.mainDishesChef[i].fire();
                    this.mainDishesChef[i] = null;
                    Kitchen.mainChefsCounter--;
                    System.out.println("Main Chef fire!");
                    return;
                }
            }
        }
        
    }
    
    public void FireDessertChef() {
        
        if(!(Kitchen.dessertChefsCounter == 0)) {
            for (int i = 0; i < this.dessertsChef.length; i++) {
                if(this.dessertsChef[i] != null) {
                    this.dessertsChef[i].fire();
                    this.dessertsChef[i] = null;
                    Kitchen.dessertChefsCounter--;
                    System.out.println("Dessert Chef fire!");
                    return;
                }
            }
        }
        
    }
    
    public void FireWaitress(){
        
        if(!(Kitchen.waitressesCounter == 0)) {
            for (int i = 0; i < this.waitress.length; i++) {
                if(this.waitress[i] != null) {
                    this.waitress[i].fire();
                    this.waitress[i] = null;
                    Kitchen.waitressesCounter--;
                    System.out.println("Waitress fire!");
                    return;
                }
            }
        }
        
    }
    
    
    //Getters
    public int getEntreesCounter() {
        return Kitchen.entreesCounter;
    }

    public int getEntreeChefsCounter() {
        return entreeChefsCounter;
    }

    public int getMainDishesCounter() {
        return mainDishesCounter;
    }
    
    public int getMainChefsCounter() {
        return mainChefsCounter;
    }

    public int getDessertChefsCounter() {
        return dessertChefsCounter;
    }

    public int getDessertsCounter() {
        return dessertsCounter;
    }
    
    public int getOrdersCounter() {
        return ordersCounter;
    }
    
    public int getWaitressesCounter() {
        return waitressesCounter;
    }
    
    public static int getHoursToWork() {
        return Kitchen.workHours;
    }
    
}
