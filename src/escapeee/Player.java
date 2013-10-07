/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeee;

/**
 *
 * @author Eric
 */
public class Player {
    String name;
    double highscore = 0;
    
    public void setName(String theName){
        this.name = theName;
    }
    
    public void displayPlayerName(){
        System.out.println("My name is " + this.name);
    }
    
    public void displayScore(){
        System.out.println("Your score is " + this.highscore);
    }
}
