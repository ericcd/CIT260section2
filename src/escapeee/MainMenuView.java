/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeee;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Zach
 */
public class MainMenuView implements Serializable
{
    private MainMenuControl MainMenuControl = new MainMenuControl();
    private String command;
    
    private final static String[][] menuItems = {
        {"s", "Start"},
        {"e", "Explain Game"},
        {"q", "Quit"}
        
    };

    MainMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void esc(){
        System.out.println("eeeeeeeeeeeeee\n"
                +          "eeeeeeeeeeeeee\n"
                +          "eeeee\n"
                +          "eeeee\n"
                +          "eeeeeeeee\n"
                +          "eeeeeeeee          sssssssss     cccccccccc     aaaaaaaaa     ppppppppp     eeeeeeee\n"
                +          "eeeee              sss           ccc            aa     aa     pp     pp     ee    ee\n"
                +          "eeeee              sssssssss     ccc            aaaaaaaaa     pp     pp     eeeeeeee\n"
                +          "eeeeeeeeeeeeee           sss     ccc            aa     aa     pp     pp     ee\n"
                +          "eeeeeeeeeeeeee     sssssssss     cccccccccc     aa     aa     ppppppppp     eeeeeeee\n"
                +          "                                                              pp\n"
                +          "                                                              pp\n"
                +          "                                                              pp");
    }
    
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
                case "e":
                    MainMenuControl.explainGame();
                    break;
                case "q":
                    System.out.println("\nThanks for Playing!");
                    break;
            }
        }
        while (!"s".equals(this.command) && !"q".equals(this.command));
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public MainMenuView(String command) {
        this.command = command;
    }

    public MainMenuControl getMainMenuControl() {
        return MainMenuControl;
    }

    public void setMainMenuControl(MainMenuControl MainMenuControl) {
        this.MainMenuControl = MainMenuControl;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
