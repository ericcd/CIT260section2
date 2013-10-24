/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeee;

/**
 *
 * @author zachhollingshead
 */
public class Item {
    String ItemName = "Wrench";
    boolean pickedup = false;
    
     public final static String[][] listItems = {
        {"1", "Wrench"},
        {"2", "Tire Iron"},
        {"3", "Dollar Bill"},
        {"4", "Tooth Pick"}
    };
    
    public void displayItemName(){
       System.out.println("You have discovered the " + this.ItemName);
    }
    
    public void itemList(){
       for (int i = 0; i < Item.listItems.length; i++) {
                System.out.println("\t   " + listItems[i][0] + "\t" + listItems[i][1]);
            }   
    }
    
    
}
