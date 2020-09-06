package Controller;

import Model.Boss;
import Model.Kitchen;
import Model.Manager;
import View.ControlPanel;

public class Updater extends Thread{
    
    private final boolean upDating;
    private final ControlPanel controlPanel;
    private final Kitchen kitchen;
    
    public Updater(ControlPanel controlPanel, Kitchen kitchen) {
        this.controlPanel = controlPanel;
        this.kitchen = kitchen;
        this.upDating = true;
    }
    
    @Override
    public void run() {
        while(this.upDating) {
            this.controlPanel.entreesCounter.setText(String.valueOf(this.kitchen.getEntreesCounter()));
            this.controlPanel.mainDishesCounter.setText(String.valueOf(this.kitchen.getMainDishesCounter()));
            this.controlPanel.dessertsCounter.setText(String.valueOf(this.kitchen.getDessertsCounter()));
            this.controlPanel.ordersCounter.setText(String.valueOf(this.kitchen.getOrdersCounter()));
            this.controlPanel.bossState.setText(Boss.state());
            this.controlPanel.managerState.setText(Manager.state());
            this.controlPanel.entreeChefs.setText(String.valueOf(this.kitchen.getEntreeChefsCounter()));
            this.controlPanel.mainDishChefs.setText(String.valueOf(this.kitchen.getMainChefsCounter()));
            this.controlPanel.dessertChefs.setText(String.valueOf(this.kitchen.getDessertChefsCounter()));
            this.controlPanel.waitresses.setText(String.valueOf(this.kitchen.getWaitressesCounter()));
            this.controlPanel.hoursToGo.setText(String.valueOf(Kitchen.hoursLeft));
        }
    }
    
}
