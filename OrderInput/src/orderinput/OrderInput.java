/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package orderinput;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class OrderInput {
    public OrderInput(){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        PriorityQueue<Integer> inputs = new PriorityQueue<Integer>();
        int temp = 1;
        System.out.print("Please enter a positive integer (0 to stop): ");
        try{
            temp = reader.nextInt();
            inputs.add(temp);  
            
        }
        catch(Exception e){
            
        }
            System.out.println();
        while(temp!=0){
            System.out.print("Please enter a positive integer (0 to stop): ");
            try{
                temp = reader.nextInt();
        inputs.add(temp);
        }
        catch(Exception e){
            
        }
            System.out.println();
        }
        System.out.print("In sorted order: " );
        Iterator<Integer> iteratorIn = inputs.iterator();
        inputs.remove();
        while(!inputs.isEmpty()){
            System.out.print(inputs.remove()+", ");
        }
    }
    
}
