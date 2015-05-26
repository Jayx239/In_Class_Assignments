/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medianofset;
import java.util.*;
/**
 *
 * @author Jason
 */
public class MedianOfSet {
    public double median(int [] medianSet){
        double median = 0;  // holer of median value
        int[] sortedSet = new int[medianSet.length];    // holder of sorted set
        sortedSet[0] = medianSet[0];    // set initial sorted set value
        for(int i = 1; i < medianSet.length; i++){
            sortedSet[i] = medianSet[i];    // set sorted set[i]
            for(int j = i; j>0;j--){
                if(medianSet[j]<sortedSet[j-1]){
                    int hold = sortedSet[j-1];  // holder value
                    sortedSet[j-1] = sortedSet[j];  //replace value
                    sortedSet[j] = hold;    // move holder value to end
                }
                else{
                    break;
                }
            }
        }// if even
        if(medianSet.length%2 == 0){
            median = (sortedSet[medianSet.length/2]+sortedSet[(medianSet.length/2)-1])/2;   // calculate median
        }
        else{   // if odd
            median = sortedSet[Math.round(medianSet.length/2)]; // calculate median
        }
            return median;  // return median
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MedianOfSet tester = new MedianOfSet(); // create median object
        int[] arrayOdd = {2,5,3,7,26};  // create odd size array
        int[] arrayEven = {2,4,6,8};    // create even sized array
        System.out.println("Array value of odd size: " + tester.median(arrayOdd));    // print array value
        System.out.println("Array value of even size: " + tester.median(arrayEven));   // print array value
    
    }
    
}
