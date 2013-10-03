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
public class Escapeee {

    //Instance vairales
    String name;
    String instructions = "You objective is to escape in one piece.\n"
            + "You will be trapped inside a dark gloomy house but you are not alone.\n"
            + "You will be traveling from room to room, using only the things you find\n"
            + "within the house.\n"
            + "Good luck and don't get lost!";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Escapeee myGame = new Escapeee();    
        Player player1 = new Player();
        player1.setName("jacob");
        player1.displayName();
        myGame.getName();
        myGame.displayHelp();
        player1.displayScore();
    }
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name here: ");
        this.name = input.next();   
    }
    public void displayHelp(){
        System.out.println("\nWelcome " + this.name + " to Escape!" );
        System.out.println(this.instructions);
    }
}
