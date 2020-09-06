package Controller;

import Model.Kitchen;
import View.ControlPanel;
import javax.swing.JFrame;

public class Controller {
    
    public Kitchen kitchen;
    private final ControlPanel controlPanel;
    private final Updater updater;
    
    public Controller(int workHours, int hoursInSeconds, int maxEntrees, int maxMainDishes, int maxDesserts, int initEntreeChefs, int maxEntreeChefs, int initMainChefs, int maxMainChefs, int initDessertChefs, int maxDessertChefs, int initWaitresses, int maxWaitresses) {
        this.controlPanel = new ControlPanel(this);
        
        this.kitchen = new Kitchen(workHours, hoursInSeconds, maxEntrees, maxMainDishes, maxDesserts, initEntreeChefs, maxEntreeChefs, initMainChefs, maxMainChefs, initDessertChefs, maxDessertChefs, initWaitresses, maxWaitresses);
        
        this.updater = new Updater(this.controlPanel,this.kitchen);
        this.updater.start();
        
        this.controlPanel.setVisible(true);
    }
    
    public void closePanel() {
        System.exit(0);
    }
    
    public void minimizePanel(JFrame jframe) {
        jframe.setState(jframe.ICONIFIED);
    }
    
}
