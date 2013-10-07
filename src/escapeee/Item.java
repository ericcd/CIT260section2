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
    
    public void displayItemName(){
       System.out.println("You have discovered the " + this.ItemName);
    }
    
    
}
