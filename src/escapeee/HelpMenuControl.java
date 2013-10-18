/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeee;

/**
 *
 * @author Eric
 */
public class HelpMenuControl {
    
    public void commandList(){
        System.out.println("\npickup -itemname- : This will put the item in your inventory.\n"
                + "move -forward/back/left/right- : This will move you in that direction.\n"
                + "use -item in inventory- -obstacle- : This will use an item you have on the ostacle.\n");
    }
    
    public void quitGame(){
        Escapeee newgame = new Escapeee();
    }
    
    public void gameCredits(){
        System.out.println("This game was created by:\n"
                + "Eric Dennis\n"
                + "The majestic Zach Hollingshead");
    }

    public void continueGame(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
