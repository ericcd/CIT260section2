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
    
    
    
    
    
    
    
    public String[] itemNamesArray = new String[10];
    
    
    public void forLoop(){
        //shows list, puts list in array
        System.out.println("What Item do you want to use?");
        for (int count = 0; count <= 9; count++) {
            String array;
            array = this.helpForLoop(count);
            this.itemNamesArray[count] = array;
            System.out.println(this.itemNamesArray[count]);
        }
        
        //copies
        int count = 10;
        String[] subs = new String[count];
        for (int i = 1; i < count; i++) {
            subs[i] = this.itemNamesArray[i];          
        }
        
        //sorts list here
        subs = this.sortList(subs);
        
        //display
        for (int x = 0; x < count; x++){
            System.out.println(subs[x]);
        }
    }
    
    public String helpForLoop(int count){
        String out = null;
        if (count == 0){
            out = "Wrench";                   
        }
        else if (count == 1){
            out = "Crowbar";
        }
        else if (count == 2){
            out = "Lightbulb";
        }
        else if (count == 3){
            out = "Tissue";
        }
        else if (count == 4){
            out = "Baseball Bat";
        }
        else if (count == 5){
            out = "Candy";
        }
        else if (count == 6){
            out = "Shoe";
        }
        else if (count == 7){
            out = "Toothbrush";
        }
        else if (count == 8){
            out = "Pencil";
        }
        else{
            out = "Soda";
        }
        return out;
    }
    
    public String[] sortList(String[] names) {
        String tmpName;
        boolean notDone = true;
        while(notDone) {
            
            notDone = false; // assume that you done
            for (int sub = 0; sub < names.length - 1; sub++) {
                int compareResult = names[sub].compareTo(names[sub+1]);
                if (compareResult > 0) {
                    // swap names
                    tmpName = names[sub];
                    names[sub] = names[sub+1];
                    names[sub+1] = tmpName;
                    notDone = true;
                } 
            }
        }

        return names;
    }
}
