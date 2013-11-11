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
        this.instructions = "\nYou wake up to only find nothing but darkness.\n"
              + "Millions of questions are running through your mind,\n"
              + "the only thing you know is that you shouldn't be there.\n"
              + "All you have with you is a backpack full of items.\n"
              + "It's time to ESCAPE! \n"
              + "**Type h for help**\n"
              + "**Type q to quit to the menu**\n";
    }
    
    public void newGame(){
        System.out.println(instructions);
    }
    
    public void theGame(){
        Obstacle challenge = new Obstacle();
        challenge.riddleOne();
    }
    
    public void theGame_1(){
        Obstacle challenge = new Obstacle();
        challenge.riddleTwo();
    }
    
    public void theGame_2(){
        Obstacle challenge = new Obstacle();
        challenge.riddleThree();
    }
}