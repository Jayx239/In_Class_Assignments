/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quadrant;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class Quadrant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean xQuad;
        boolean yQuad;
        int x1;
        int x2;
        int y1;
        int y2;
        System.out.print("Enter x1: ");
        x1 = input.nextInt();
        System.out.print("Enter x2: ");
        x2 = input.nextInt();
        System.out.print("Enter y1: ");
        y1 = input.nextInt();
        System.out.print("Enter y2: ");
        y2 = input.nextInt();
        if(y1>0 && y2>0){
            if(x1>0 && x2>0){
                System.out.println("The points are in the same quadrant.");
            }
            else{
                System.out.println("The points are in adjacet quadrants.");
            }
            
        }
        else{
            if(x1>0 && x2>0){
                System.out.println("The points are in adjacet quadrants.");
            }
            else{
            System.out.println("The points are in opposite quadrants.");
            }
        }
        
    }
    
}
