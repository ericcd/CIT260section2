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
    
   
    
    public String[] itemNamesArray = new String[10];
    
    
    public void itemList1(){
        //shows list, puts list in array
        System.out.println("What Item do you want to use?");
        System.out.println("To use an item, enter the number next to it when you are back to the problem.");
        for (int count = 0; count <= 9; count++) {
            String array;
            array = this.helpForLoop(count);
            this.itemNamesArray[count] = array;
            System.out.println((count + 1) + ". " + this.itemNamesArray[count]);
        }
        /*
        //copies
        int count = 10;
        String[] subs = new String[count];
        for (int i = 0; i < count; i++) {
            subs[i] = this.itemNamesArray[i];          
        }
        
        //sorts list here
        subs = this.sortList(subs);
        System.out.println("\n\n\nThis is the list sorted Alphabetically from asending order.\n");
        //display
        for (int x = 0; x < count; x++){
            System.out.println(subs[x]);
        }*/
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
            out = "Wood Plank";
        }
        else if (count == 4){
            out = "Baseball Bat";
        }
        else if (count == 5){
            out = "Paper clip";
        }
        else if (count == 6){
            out = "Battery";
        }
        else if (count == 7){
            out = "Chainsaw";
        }
        else if (count == 8){
            out = "Pencil";
        }
        //anything 9 and above
        else{
            out = "Lighter";
        }
        return out;
    }
    
    private String[] sortList(String[] names) {
        String tmpName;
        boolean notDone = true;
        while(notDone) {
            
            notDone = false; // assume that you done
            for (int sub = 0; sub < names.length - 1; sub++) {
                if (names[sub].compareToIgnoreCase(names[sub + 1]) > 0) {
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
