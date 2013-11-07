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
public class Obstacle {
    String ObstacleName = "Locked Door";
    
    public void displayObstacleName(){
       System.out.println("Look out for the " + this.ObstacleName);
    }
    
    public void nextStep(){
        System.out.println("\nYou have completed the previous task. The door creaks open into a dark hallway.\n"
                + "You find yourself in another room, with another challenge.");
    }
    
     public String riddleOne() {
        String answer = null;
                
        boolean valid = false; // flag to indicate if valid character entered
        while (!valid) {
            // prompt for input
            System.out.println("\n\t Solve this riddle to leave the room: \n" 
                    + "What is two plus two, multiplied by two, equals...? ");
            
            // get input from user
            Scanner input = new Scanner(System.in);
            answer = input.nextLine();
           
            // no marker entered?
            if (answer == null  || answer.length() < 1) {
                continue;
            }
                       
            if (answer.equals("q")) { // Quit?
                MainMenuView main = new MainMenuView();
                main.displayMainMenu();
                return null;
            }
            
            if (answer.equals("h")){
                HelpMenuView help = new HelpMenuView();
                help.displayHelpMenu();
            }
            
        
            // Check to see if the marker is already in use
            if (!"6".equals(answer)) {
               System.out.println("\"You Shall Not Pass!!!\"");
               continue;
            }
            
            System.out.println("That Is correct.");         
            valid = true; // signal that a valid marker was entered
        }
        
        return answer;
    }
    
     public void findTheAverage(){
         int[] number = {1,2,3,4,5,6};
         int crusher = 0;
         for (int count = 0; count < 6; count++){
             crusher += number[count];    
         }
         crusher /= 7;
         System.out.println(crusher);
     }
}   

