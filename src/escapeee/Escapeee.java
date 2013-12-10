/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeee;

//import java.util.Scanner;

import EscapeeeFrames.MainMenuForm;
import EscapeeeMenuViews.MainMenuView;


/**
 *
 * @author Eric
 */
public class Escapeee {
 
    /**
     * @param args the commands
     * line arguments
     */
    public static void main(String[] args) {
        MainMenuForm form = new MainMenuForm();
        form.setVisible(true);
        
        MainMenuView duts = new MainMenuView();
        duts.esc();
        duts.displayMainMenu();
        
    }
    
}
