/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uniqueprimefactors;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

/**
 *
 * @author Jason
 */
public class UniquePrimeFactors {
    UniquePrimeFactors(){
        
    }
    Map<Integer,Integer> primes = new HashMap<Integer,Integer>();
    int primeDivisor = 2;
    public void getPrimes(int testNum){
        if(primeDivisor <= testNum){
            if(testNum%primeDivisor == 0){
                primes.putIfAbsent(primeDivisor,primeDivisor);
            }
                if(primeDivisor == 2){
                    ++primeDivisor;
                }
                else{
                    primeDivisor+=2;
                }
            getPrimes(testNum);
            }
            if(primes.size() != 0){
            System.out.println(primes.values());
            primes.clear();
            }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UniquePrimeFactors primeFactorCalc = new UniquePrimeFactors();
        primeFactorCalc.getPrimes(24);
    }
    
}
