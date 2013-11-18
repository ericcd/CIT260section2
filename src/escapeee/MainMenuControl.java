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
        game.newGame();
        game.theGame_1();
        game.theGame_2();
        game.theGame_3();
        game.theGame_4();
        game.theGame_45();
    }
    
    public void explainGame(){
         System.out.println("\nThe goal is to escape from a house that you find yourself in. You have items to help you escape.\n"
                 + "Enter in the correct answers to move from room to room, but be careful, there is no turning back.\n"
                 + "There will be math problems and problems where you have to use your items.");
    }
}
