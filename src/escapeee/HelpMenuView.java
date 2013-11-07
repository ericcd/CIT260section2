/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeee;

import java.util.Scanner;

/**
 *
 * @author Eric
 */
public class HelpMenuView {
    
    //private Game game;
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    private String command;
    
    private final static String[][] menuItems = {
        {"i", "Item List"},
        {"-", "-"},
        {"g", "Game Credits"},
        {"u", "Continue"}
    };
    
    //public HelpMenuView() {
    //    this.helpMenuControl = new HelpMenuControl();
        
    //}

    
    
    /*public Object getInput(Object object) {
        this.game = (Game) object;

        this.game.setStatus(Game.CONTINUE);
        
        String gameStatus = this.game.getStatus();
        do {
     
            this.displayHelpMenu();
            
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "c":
                    helpMenuControl.commandList();
                    break;
                case "q":
                    helpMenuControl.quitGame();
                    break;
                case "g":
                    helpMenuControl.gameCredits();
                    break;
                case "u":
                    helpMenuControl.continueGame();
                    break;
                case "Q":
                    gameStatus = "QUIT";
                    break;
            }
        } while (!gameStatus.equals("QUIT"));

        return Game.PLAYING;
    }
    */


    public final void displayHelpMenu() {
        do{
            System.out.println("\n\t===============================================================");
            System.out.println("\tEnter the letter associated with one of the following commands:");

            for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
                System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
            }   
            System.out.println("\t===============================================================\n");
            Scanner inputMenu = new Scanner(System.in);
            this.command = inputMenu.next();
            
            switch (command) {
                case "i":
                    helpMenuControl.itemsList();
                    break;
                case "-":
                    //helpMenuControl.quitGame();
                    break;
                case "g":
                    helpMenuControl.gameCredits();
                    break;
                case "u":
                    //helpMenuControl.continueGame();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    break;
            }
        }while (!"u".equals(this.command) && !"q".equals(this.command));
    }
    
    /*private boolean validCommand(String command) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    protected final String getCommand() {

        Scanner inFile = TicTacToe.getInputFile();
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                /*new TicTacToeError().displayError System.out.println("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }
    
  */  
}
