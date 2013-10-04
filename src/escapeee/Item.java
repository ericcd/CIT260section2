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
    String ItemName;
    boolean pickedup = false;
    
    public void displayName(){
       System.out.println("You have discovered the " + this.ItemName);
    }
    
    
}
