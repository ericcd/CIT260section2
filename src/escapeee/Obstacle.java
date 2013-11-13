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
        System.out.println("\nYou have completed the previous task. The door creaks open into a dark and spooky hallway.\n"
                + "You find yourself in another room, with another challenge.");
    }
    
     public String riddleOne() {
        String answer = null;
        boolean valid = false; // flag to indicate if valid character entered
        while (!valid) {
            // prompt for input
            System.out.println("????????????????????????????????????????????????????"
                    +"\n? You have woken up to find a note, written on the note is: ?\n"
                    + "? Solve this riddle to leave the room:                       ?\n"  
                    + "? What is two plus two multiplied by two? A trick question...?"
                    + "??????????????????????????????????????????????????????????????");
            
            // get input from user
            Scanner input = new Scanner(System.in);
            answer = input.nextLine();
           
            // no text entered?
            if (answer == null  || answer.length() < 1) {
                continue;
            }
            
            // Quit?
            if (answer.equals("q")) {
                MainMenuView main = new MainMenuView();
                main.displayMainMenu();
                return null;
            }
            
            //Help Menu?
            if (answer.equals("h")){
                HelpMenuView help = new HelpMenuView();
                help.displayHelpMenu();
            }
            
            // Displays message when done with menu
            if (answer.equals("h") || answer.equals("u") || answer.equals("q") || answer.equals("i")) {
                System.out.println("Back to figuring out your problem...");
                continue;
            }
                
            // Check to see if the answer is correct
            if (!answer.equals("6")) {
               System.out.println("\"You Shall Not Pass!!!\"");
               continue;
            }
            
            System.out.println("\nThat is correct.\n");         
            valid = true; // signal that a valid marker was entered
        }
        
        return answer;
    }
     
     public String riddleTwo() {
        String answer = null;
                
        boolean valid = false; // flag to indicate if valid character entered
        while (!valid) {
            // prompt for input
            System.out.println("\nYou have entered another room to find that it is pitch black.\n"
                    + "The lightswitch is not working...odd.\n"
                    + "You need to see in order to navigate through the room.\n" 
                    + "You hear hissing...is the room full of snakes? \n"
                    + "\tHow will you get around this?! Possibly using an item? Maybe that sparking lightbulb socket might be useful...\n");
            
            // get input from user
            Scanner input = new Scanner(System.in);
            answer = input.nextLine();
           
            // no text entered?
            if (answer == null  || answer.length() < 1) {
                continue;
            }
            
            // Quit?
            if (answer.equals("q")) {
                MainMenuView main = new MainMenuView();
                main.displayMainMenu();
                return null;
            }
            
            // Use the help menu
            if (answer.equals("h")){
                HelpMenuView help = new HelpMenuView();
                help.displayHelpMenu();
            }
            
            // Displays message when done with menu
            if (answer.equals("h") || answer.equals("u") || answer.equals("q") || answer.equals("i")) {
                System.out.println("Back to figuring out your problem...");
                continue;
            }
            
            // Check to see if the answer is correct
            if (!answer.equals("3")) {
               System.out.println("\"That item won't work, we need light in order to see!\"");
               continue;
            }
            
            System.out.println("\nFinally we can see, kill all the snakes!");         
            valid = true; // signal that a valid marker was entered
        }
        
        return answer;
    }
     
  public String riddleThree() {
        String answer = null;
                
        boolean valid = false; // flag to indicate if valid character entered
        while (!valid) {
            // prompt for input
            System.out.println("\n You have entered another room to find that it smells of gasoline. \n"
                    + "There might be a message written with the gas \n" 
                    + "should we ignite it? \n"
                    + "How will you ignite the message?"
                    + "**Type h for help**"
                    );
            
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
            
            // Displays message when done with menu
            if (answer.equals("h") || answer.equals("u") || answer.equals("q") || answer.equals("i")) {
                System.out.println("Back to figuring out your problem...");
                continue;
            }
            
            // Check to see if the amrker is already in use
            if (!"10".equals(answer)) {
               System.out.println("\"That item won't work, we need light in order to see!\"");
               continue;
            }
            
            System.out.println("The message reads, TRY TO GET OUT ALIVE!");         
            valid = true; // signal that a valid marker was entered
        }
        
        return answer;
    }
  
      public String riddleFour() {
        String answer = null;
                
        boolean valid = false; // flag to indicate if valid character entered
        while (!valid) {
            // prompt for input
            System.out.println("\nYou have woken up to find a note, written on the note is: \n"
                    + "\tSolve this riddle to leave the room: \n" 
                    + "\tWhat is two plus two, multiplied by two? A trick question...");
            
            // get input from user
            Scanner input = new Scanner(System.in);
            answer = input.nextLine();
           
            // no marker entered?
            if (answer == null  || answer.length() < 1) {
                continue;
            }
            
            // Quit?
            if (answer.equals("q")) {
                MainMenuView main = new MainMenuView();
                main.displayMainMenu();
                return null;
            }
            
            //Help Menu?
            if (answer.equals("h")){
                HelpMenuView help = new HelpMenuView();
                help.displayHelpMenu();
            }
            
        
            // Check to see if the answer is correct
            if (!answer.equals("6")) {
               System.out.println("\"You Shall Not Pass!!!\"");
               continue;
            }
            
            System.out.println("That is correct.\n");         
            valid = true; // signal that a valid marker was entered
        }
        
        return answer;
    }
    
            public String riddleFourPartTwo() {
        String answer = null;
                
        boolean valid = false; // flag to indicate if valid character entered
        while (!valid) {
            // prompt for input
            System.out.println("\n You have woken up to find a note, written on the note is \n"
                    + " Solve this riddle to leave the room: \n" 
                    + "What is two plus two, multiplied by two, equals...? ");
            
            // get input from user
            Scanner input = new Scanner(System.in);
            answer = input.nextLine();
           
            // no marker entered?
            if (answer == null  || answer.length() < 1) {
                continue;
            }
            
            // Quit?
            if (answer.equals("q")) {
                MainMenuView main = new MainMenuView();
                main.displayMainMenu();
                return null;
            }
            
            //Help Menu?
            if (answer.equals("h")){
                HelpMenuView help = new HelpMenuView();
                help.displayHelpMenu();
            }
            
        
            // Check to see if the answer is correct
            if (!answer.equals("6")) {
               System.out.println("\"You Shall Not Pass!!!\"");
               continue;
            }
            
            System.out.println("That is correct.\n");         
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

