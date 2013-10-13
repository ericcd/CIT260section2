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
    
    public long getTime(long startTime, long endTime){
        //long startTime = 10;
        
        //long endTime = 5;
        
        if (startTime > endTime){
            System.out.println("TIME ERROR");
            return -1;
        }
            
        long theTime = endTime - startTime;
        if (theTime < 0){
            System.out.println("NEGATIVE VALUE");
            return -1;
        }
        long timeToBeat = theTime * 1;
        
        System.out.println("You beat the game in " + theTime + "\nThe time to beat is " + timeToBeat);
        return timeToBeat;
    
    }
    
    public float getAgeInMonths(int ageInYears){
        if(ageInYears < 0 || ageInYears > 1000){
            System.out.println("Invalid Age - Too Old or Too Young");
            return -1;
        }
        float ageInWeeks = ageInYears / 52;
        float ageInMonths = ageInWeeks * 4;
        return ageInMonths; 
    }
}
