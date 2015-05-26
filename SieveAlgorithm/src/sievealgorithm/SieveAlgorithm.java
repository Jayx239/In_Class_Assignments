/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sievealgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class SieveAlgorithm {
    SieveAlgorithm(){
    
    }
    
    int numberOfPrimes(int topBound){
       List<Integer> primeNumbers = new ArrayList<Integer>();   // create new arraylist
       for(int i = 2; i<topBound;i++){
           primeNumbers.add(i); // fill arralist with all number from 0 to topbound
       }
       for(int i = 1; i < primeNumbers.size(); i++){
           if (primeNumbers.get(i)%2 == 0){ 
               primeNumbers.remove(i);  // Remove numbers divisible by 2 except 2
           }
       }
       for(int i = 0; i < primeNumbers.size();i++){
           
           for(int j = i+1; j< primeNumbers.size(); j++){
               if(primeNumbers.get(j)%primeNumbers.get(i) == 0){
                   primeNumbers.remove(j);      // Remove all numbers divisible by other numbers less than it
               }
           }
       }
       return primeNumbers.size();  // Print prime numbers
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SieveAlgorithm tester = new SieveAlgorithm();   // Create new object
        Scanner input = new Scanner(System.in); // Create new scanner object
        System.out.print("Enter a number: ");   // prompt for input
        int number = input.nextInt();       // scan in user input
        System.out.println("Number of Primes: " + tester.numberOfPrimes(number));   // print number of primes
    }
    
}
