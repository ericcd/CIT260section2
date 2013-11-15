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
              + "the only thing you know is that you shouldn't be here.\n"
              + "All you have with you is a backpack full of random items.\n"
              + "It's time to ESCAPE! \n"
              + "\n\t================HINT=================\n"
              + "\t  **Type h for the help menu**\n"
              + "\t      -You can see your items from the here\n"
              + "\t  **Type q to quit to the main menu**\n"
              + "\t=====================================\n";
    }
    
    public void newGame(){
        System.out.println(instructions);
    }
    
    public void theGame_1(){
        Obstacle challenge = new Obstacle();
        challenge.riddleOne();
    }
    
    public void theGame_2(){
        Obstacle challenge = new Obstacle();
        challenge.riddleTwo();
    }
    
    public void theGame_3(){
        Obstacle challenge = new Obstacle();
        challenge.riddleThree();
    }
    public void theGame_4(){
        Obstacle challenge = new Obstacle();
        challenge.riddleFourPartOne();
    }
    public void theGame_45(){
        Obstacle challenge = new Obstacle();
        challenge.riddleFourPartTwo();
    }
}