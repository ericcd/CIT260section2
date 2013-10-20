/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeee;

import java.util.Scanner;

/**
 *
 * @author Zach
 */
public class MainMenuView {
    //private Game game;
    private MainMenuControl MainMenuControl = new MainMenuControl();
    private String command;
    
    private final static String[][] menuItems = {
        {"s", "Start"},
        {"c", "Command List"},
        {"q", "Quit"}
        
    };
    
    public final void displayMainMenu() {
        do{
            System.out.println("\n\t===============================================================");
            System.out.println("\tEnter the letter associated with one of the following commands:");

            for (int i = 0; i < MainMenuView.menuItems.length; i++) {
                System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
            }   
            System.out.println("\t===============================================================\n");
            Scanner inputMenu = new Scanner(System.in);
            this.command = inputMenu.next();
            
            switch (command) {
                case "s":
                    MainMenuControl.startGame();
                    break;
                case "c":
                    MainMenuControl.commandList();
                    break;
                case "q":
                    MainMenuControl.quitGame();
                    break;
            }
        }while (!"s".equals(this.command) || !"q".equals(this.command));
    }
}
