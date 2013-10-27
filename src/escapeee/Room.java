/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeee;

/**
 *
 * @author Eric
 */
public class Room {
    String Description = "You are in a dark room and can barley see.";
    //Direction? Can't remember what that was for.
    
    public void whatIsHere(){
        System.out.println(this.Description);
    }
    
    
    
    public void whereAmI(){
         int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) {
             System.out.println("Room: " + item);
         }
    }

}
