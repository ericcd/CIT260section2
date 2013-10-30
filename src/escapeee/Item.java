/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeee;

import java.util.Scanner;

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
    private int i;
    
    public void displayItemName(){
       System.out.println("You have discovered the " + this.ItemName);
    }
    
    public void itemList(){
       for (int i = 0; i < Item.listItems.length; i++) {
                System.out.println("\t   " + listItems[i][0] + "\t" + listItems[i][1]);
            }   
    }
    
    public void forLoop(){
        System.out.println("What Item do you want to use?");
        for (int count = 1; count <= 10; count++) {
            this.helpForLoop(count);
        }
    }
    
    public void helpForLoop(int count){
        if (count == 1){
            System.out.println(count + ". Wrench");
        }
        else if (count == 2){
            System.out.println(count + ". Crowbar");
        }
        else if (count == 3){
            System.out.println(count + ". Lightbulb");
        }
        else if (count == 4){
            System.out.println(count + ". Tissue");
        }
        else if (count == 5){
            System.out.println(count + ". Baseball Bat");
        }
        else if (count == 6){
            System.out.println(count + ". Candy");
        }
        else if (count == 7){
            System.out.println(count + ". Shoe");
        }
        else if (count == 8){
            System.out.println(count + ". Toothbrush");
        }
        else if (count == 9){
            System.out.println(count + ". Pencil");
        }
        else{
            System.out.println(count + ". Soda");
        }
    }
}
