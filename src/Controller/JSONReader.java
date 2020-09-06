package Controller;

import java.awt.HeadlessException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReader {

    public JSONReader() {
        
        JSONParser reader = new JSONParser();
        
        try {
            
            Object obj = reader.parse(new FileReader("src\\data.json"));
            JSONObject json = (JSONObject) obj;
            
            int workHours = Integer.parseInt((String) json.get("workHours"));
            int hoursInSeconds = Integer.parseInt((String) json.get("hoursInSeconds"));
            int maxEntrees = Integer.parseInt((String) json.get("maxEntrees"));
            int maxMainDishes = Integer.parseInt((String) json.get("maxMainDishes"));
            int maxDesserts = Integer.parseInt((String) json.get("maxDesserts"));
            int initEntreeChefs = Integer.parseInt((String) json.get("initEntreeChefs"));
            int initMainChefs = Integer.parseInt((String) json.get("initMainChefs"));
            int initDessertChefs = Integer.parseInt((String) json.get("initDessertChefs"));
            int initWaitresses = Integer.parseInt((String) json.get("initWaitresses"));
            int maxEntreeChefs = Integer.parseInt((String) json.get("maxEntreeChefs"));
            int maxMainChefs = Integer.parseInt((String) json.get("maxMainChefs"));
            int maxDessertChefs = Integer.parseInt((String) json.get("maxDessertChefs"));
            int maxWaitresses = Integer.parseInt((String) json.get("maxWaitresses"));
            
            if((workHours <= 0) || (hoursInSeconds <= 0) || (maxEntrees <= 0) || (maxMainDishes <= 0) || (maxDesserts <= 0) || (initEntreeChefs <= 0) || (initMainChefs <= 0) || (initDessertChefs <= 0) || (initWaitresses <= 0) || (maxEntreeChefs <= 0) || (maxMainChefs <= 0) || (maxDessertChefs <= 0) || (maxWaitresses <= 0)) {
               JOptionPane.showMessageDialog(null, "There was an error while reading the data!");
               System.exit(0);
            } else {
               Controller controller = new Controller(workHours, hoursInSeconds, maxEntrees, maxMainDishes, maxDesserts, initEntreeChefs, maxEntreeChefs, initMainChefs, maxMainChefs, initDessertChefs, maxDessertChefs, initWaitresses, maxWaitresses);
            }
            
        } catch (HeadlessException | IOException | NumberFormatException | ParseException e) {
            System.out.println("Something went wrong while reading the file!");
            System.out.println(e);
        }
        
    }
    
}
