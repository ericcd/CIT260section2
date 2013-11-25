/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EscapeeeMenuControls;

import escapeee.Item;

/**
 *
 * @author Eric
 */
public class HelpMenuControl {
    
    public void itemsList(){
        Item list = new Item();
        list.itemList1();    
    }
    
    public void gameCredits(){
        System.out.println("This game was created by:\n"
                + "Eric Dennis\n"
                + "The majestic Zach Hollingshead"
                + "Oh and Kris Reed the Canadian...eh?");
    }
    
}
