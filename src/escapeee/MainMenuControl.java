/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeee;

/**
 *
 * @author Eric
 */
public class MainMenuControl {
    
    public void startGame(){
        Game game = new Game();
    }
    
    public void commandList(){
         System.out.println("\npickup -itemname- : This will put the item in your inventory.\n"
                + "move -forward/back/left/right- : This will move you in that direction.\n"
                + "use -item in inventory- -obstacle- : This will use an item you have on the ostacle.\n");
    }
    
    public void quitGame(){
        
    }
}
