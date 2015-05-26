/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primefactorcalculator;

import java.util.Vector;

/**
 *
 * @author Jason
 */
public class PrimeFactorCalculator {

    PrimeFactorCalculator(int n){
       N=n;
    }
    private int N;
    private int count = 2;
    boolean isPrime = false;
    Vector<Integer> Ns = new Vector<Integer>();
    public void primeFactors(){
        assert N>=0;
        isPrime = true;
        for(int i = 2; i<count; i++){
            if(count%i == 0){
                isPrime = false;
                break;
            }
        }
        
        if(N%count == 0 && count <N-1 && isPrime){
            Ns.add(count);
            System.out.println("Prime Number: " + count);
        }
        if(count < N-1){
            count++;
           primeFactors();
        }
        if(count>= N-1){
            count = 2;
            int indCount = 0;
            int multiplier = 0;
            int totalVal = 1;
            
            if(Ns.size() > 0){
                System.out.print(Ns.get(0));
                totalVal*=Ns.get(0);
                while(totalVal< N){
                    totalVal *= Ns.get(indCount);
                    if(totalVal == Ns.get(indCount)){
                        System.out.print(Ns.get(indCount));
                    }
                    else{
                    System.out.print("*"+Ns.get(indCount));
                    }
                    if(indCount >= Ns.size()-1){
                        indCount = 0;
                    }
                    else{
                    indCount++;
                    }
                }
                System.out.println();
                    }
            else{
                System.out.println(N + " is Prime so: " + N +"*1");
            Ns.clear();//  reset variable
        }
        
        
    }
    }
    public void intToBin(int num){
        int remainder = num%2;
        if(num >1){
            intToBin(num/2);
        }
        System.out.print(remainder);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrimeFactorCalculator tester = new PrimeFactorCalculator(60);
        tester.primeFactors();
        tester.intToBin(13);
        System.out.println();
    }
    
}
