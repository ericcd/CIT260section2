/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeee;

/**
 *
 * @author Eric
 */
public class Game {
    String instructions;

    public Game() {
        this.instructions = "You objective is to escape in one piece.\n"
              + "You will be trapped inside a dark gloomy house but you are not alone.\n"
              + "You will be traveling from room to room, using only the things you find\n"
              + "within the house.\n"
              + "Good luck and don't get lost!\n"
              + "**Type h for help**";
    }
    
    public void newGame(){
        System.out.println(instructions);
    }
    
    public void theGame(){
        Obstacle challenge = new Obstacle();
        challenge.riddleOne();
    }
    
}