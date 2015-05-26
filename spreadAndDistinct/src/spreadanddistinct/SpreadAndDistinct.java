/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spreadanddistinct;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jason
 */
public class SpreadAndDistinct {
    // Constructor
    SpreadAndDistinct(){
        
    }
    // Method to Calculate spread
    public int spread(int [] input){
        int high = input[0];    // Create holder for high value
        int low = input[0];     // Create holder for low value
        // While i is less then input length
        for(int i = 1; i <input.length;i++){
            
            if(low > input[i]){
                low = input[i]; // Set low if lower value detected
            }
        }
        for(int i = 1; i<input.length; i ++){
            if(high < input[i]){
                high = input[i];    // set high if higher value detected
            }    
        }
        return high-low;    // Return spread
    }
    // Method to grab all distinct numbers and print them in an array list
    public List<Integer> distinct(int [] input){
        List<Integer> output = new ArrayList<Integer>();    // Create new array list
        int count = 0;  // Create counter
        output.add(input[0]);   // Add input 0 to output
        for(int i = 0; i < input.length; i ++){
            for(int j = 0; j < output.size();j++){
                if(output.get(j) == input[i]){  // if output contains any value in input break
                    count = 0;  // Reset Count
                    break;
                }
                else{
                    count+=1;   // Increment count if no value is detected
                }
                if(count == output.size()){
                    output.add(input[i]);       // If count is the length of the arraylist there the value is distinct and added to the array list
                    count = 0;      // Reset Count
                }
            }
        }
        return output;  // Return arraylist
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SpreadAndDistinct tester = new SpreadAndDistinct(); // Create new object
        int [] values = {1,2,2,5,6,4,5,3,3,2};  // Create tester array
        
        System.out.print("Distinct method test: ");
        System.out.println(tester.distinct(values));    // print distinct method result
        System.out.println("Expected: [1, 2, 5, 6, 4, 3]");
        System.out.print("Spread method test: ");
        System.out.println(tester.spread(values));      // Print spread result
        System.out.println("Expected: 5");
    }
    
}
