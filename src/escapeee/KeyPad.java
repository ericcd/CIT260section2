/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeee;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author K-Reed
 */
public class KeyPad implements Serializable
{
    private int i;
    private String keypadin = "";
    private int num;
    private void keyPadGetIn(){
        for (i=0;i<5;i++){
            System.out.println(
 "\n\t\t\t  ____________________________"
+"\n\t\t\t |   _____________________   |"
+"\n\t\t\t |  |                     |  |"
+"\n\t\t\t |  | " + keypadin
+"\n\t\t\t |  |                     |  |"
+"\n\t\t\t |   ---------------------   |"
+"\n\t\t\t |   _____   _____   _____   |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |  |  1  | |  2  | |  3  |  |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |   -----   -----   -----   |"
+"\n\t\t\t |   _____   _____   _____   |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |  |  4  | |  5  | |  6  |  |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |   -----   -----   -----   |"
+"\n\t\t\t |   _____   _____   _____   |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |  |  7  | |  8  | |  9  |  |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |   -----   -----   -----   |"
+"\n\t\t\t |           _____________   |"
+"\n\t\t\t |          |             |  |"
+"\n\t\t\t |          |      0      |  |"
+"\n\t\t\t |          |             |  |"
+"\n\t\t\t |           -------------   |"
+"\n\t\t\t  ---------------------------"
                    );
            System.out.println("Please enter a number from the keypad above.");
            Scanner inFile = new Scanner(System.in);
            String numin = inFile.nextLine();
            while (!"0".equals(numin) && !"1".equals(numin) && !"2".equals(numin) && !"3".equals(numin) && !"4".equals(numin) && !"5".equals(numin) && !"6".equals(numin) && !"7".equals(numin) && !"8".equals(numin) && !"9".equals(numin)){
                System.out.println("Error. Please enter a digit between 0 and 9.");
                inFile = new Scanner(System.in);
                numin = inFile.nextLine();
            }
            keypadin+=numin;
        }
        System.out.println(
 "\n\t\t\t  ____________________________"
+"\n\t\t\t |   _____________________   |"
+"\n\t\t\t |  |                     |  |"
+"\n\t\t\t |  | " + keypadin
+"\n\t\t\t |  |                     |  |"
+"\n\t\t\t |   ---------------------   |"
+"\n\t\t\t |   _____   _____   _____   |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |  |  1  | |  2  | |  3  |  |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |   -----   -----   -----   |"
+"\n\t\t\t |   _____   _____   _____   |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |  |  4  | |  5  | |  6  |  |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |   -----   -----   -----   |"
+"\n\t\t\t |   _____   _____   _____   |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |  |  7  | |  8  | |  9  |  |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |   -----   -----   -----   |"
+"\n\t\t\t |           _____________   |"
+"\n\t\t\t |          |             |  |"
+"\n\t\t\t |          |      0      |  |"
+"\n\t\t\t |          |             |  |"
+"\n\t\t\t |           -------------   |"
+"\n\t\t\t  ---------------------------"
                    );
        if ("6310415".equals(keypadin)){
           System.out.println("The safe opens and you grab a shotgun and a glock. You make sure to pick up a couple of packs of rounds and put them in your backpack.");
        }
        else{
            System.out.println("The keypad beeps angrily. The safe remains locked.");
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public KeyPad(int i, int num) {
        this.i = i;
        this.num = num;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getKeypadin() {
        return keypadin;
    }

    public void setKeypadin(String keypadin) {
        this.keypadin = keypadin;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
}
 
