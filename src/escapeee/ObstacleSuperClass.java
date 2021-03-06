/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeee;

import EscapeeeMenuViews.MainMenuView;
import EscapeeeMenuViews.HelpMenuView;
import java.util.Scanner;

/**
 *
 * @author zachhollingshead
 */
public abstract class ObstacleSuperClass {
    
     public String riddleOne() {
        String answer = null;
        boolean valid = false; // flag to indicate if valid character entered
        while (!valid) {
            // prompt for input
            System.out.println("\t?????????????????? Obstacle 1 ???????????????????????\n"
                    +          "\tYou have woken up to find a note, written on the note is:\n"
                    +          "\tSolve this riddle to leave the room:\n"  
                    +          "\tWhat is two plus two multiplied by two? A trick question...\n"
                    +          "\t?????????????????????????????????????????????????????");
            
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
                System.out.println("\nBack to figuring out your problem...");
                continue;
            }
                
            // Check to see if the answer is correct
            if (!answer.equals("6")) {
               System.out.println("\n\"You Shall Not Pass!!!\"");
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
            System.out.println("\t?????????????????? Obstacle 2 ???????????????????????\n"
                    +          "\tYou have entered another room to find that it is pitch black.\n"
                    +          "\tThe lightswitch is not working...odd.\n"
                    +          "\tYou need to see in order to navigate through the room.\n" 
                    +          "\tYou hear hissing...is the room full of snakes? \n"
                    +          "\tHow will you get around this?! Possibly using an item?\n"
                    +          "\tMaybe that sparking lightbulb socket might be useful...\n"
                    +           "\t?????????????????????????????????????????????????????");
            
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
                System.out.println("\nBack to figuring out your problem...");
                continue;
            }
            
            // Check to see if the answer is correct
            if (!answer.equals("3")) {
               System.out.println("\n\"That item won't work, we need light in order to see!\"");
               continue;
            }
            
            System.out.println("\nThe lightbulb worked! Finally we can see! Kill all the snakes!");         
            valid = true; // signal that a valid marker was entered
        }
        
        return answer;
    }
     
  public String riddleThree() {
        String answer = null;
                
        boolean valid = false; // flag to indicate if valid character entered
        while (!valid) {
            // prompt for input
            System.out.println("\n\t?????????????????? Obstacle 3 ???????????????????????\n"
                    +          "\tYou have entered another room to find that it smells of gasoline. \n"
                    +          "\tThere might be a message written with the gas \n" 
                    +          "\tshould we ignite it? \n"
                    +          "\tHow will you ignite the message?\n"
                    +          "\t?????????????????????????????????????????????????????"
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
            
            // help menu
            if (answer.equals("h")){
                HelpMenuView help = new HelpMenuView();
                help.displayHelpMenu();
            }
            
            // Displays message when done with help menu
            if (answer.equals("h") || answer.equals("u") || answer.equals("q") || answer.equals("i")) {
                System.out.println("\nBack to figuring out your problem...");
                continue;
            }
            
            // Check to see if the answer is correct
            if (!"10".equals(answer)) {
               System.out.println("\n\"That item won't work, we need light in order to see!\"\n");
               continue;
            }
            
            System.out.println("\nThe message reads is just a number, 4...strange. The door was heat activated, it opens.\n");         
            valid = true; // signal that a valid marker was entered
        }
        
        return answer;
    }
    
     public String riddleFourPartOne() {
        String answer = null;
                
        boolean valid = false; // flag to indicate if valid character entered
        while (!valid) {
            // prompt for input
            System.out.println("\t?????????????????? Obstacle 4 ???????????????????????\n"
                    +          "\tAnother room. As you enter the door slams behind you.\n"
                    +          "\tStrange, you think, the room seems to be getting smaller.\n"
                    +          "\tIt is! The walls are closing in!!!\n" 
                    +          "\tYou run to the door to escape, but some one has nailed boards on it to prevent escape!\n"
                    +          "\tHow will you get around this?! Possibly using an item?\n"
                    +          "\tHopefully the backpack has another answer for you.\n"
                    +           "\t?????????????????????????????????????????????????????");
            
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
                System.out.println("\nBack to figuring out your problem...");
                continue;
            }
            
            if (answer.equals("7")) {
               System.out.println("\n\"This seems a bit excessive...find another item.\"\n");
               continue;
            }
            
            // Check to see if the answer is correct
            if (!answer.equals("2")) {
               System.out.println("\n\"Not this item, find another!\"\n");
               continue;
            }
            
            System.out.println("\n");         
            valid = true; // signal that a valid marker was entered
        }
        
        return answer;
    }
  
     public String riddleFourPartTwo() {
        String answer = null;
                
        boolean valid = false; // flag to indicate if valid character entered
        while (!valid) {
            // prompt for input
            System.out.println("\t?????????????????? Obstacle 4 ???????????????????????\n"
                    +          "\tYou got the boards off with the crowbar...\n"
                    +          "\tonly to discover the door is still locked!\n"
                    +          "\tThose walls are getting close, better hurry!!\n"
                    +           "\t?????????????????????????????????????????????????????");
            
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
                System.out.println("\nBack to figuring out your problem...");
                continue;
            }
            
            if (answer.equals("7")) {
               System.out.println("\n\"Stop with the chainsaw, you have a better item for this.\"\n");
               continue;
            }
            
            // Check to see if the answer is correct
            if (!answer.equals("5")) {
               System.out.println("\n\"Not this item, find another!\"\n");
               continue;
            }
            
            System.out.println("\nYou use the paper clip to pick the lock and escape just in time!\n");         
            valid = true; // signal that a valid marker was entered
        }
        
        return answer;
    }
     
     public abstract String executeObstacles(Game game);
}
