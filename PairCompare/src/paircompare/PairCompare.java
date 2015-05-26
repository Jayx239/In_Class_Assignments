/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paircompare;

import static java.lang.Integer.hashCode;

/**
 *
 * @author Jason
 */
public class PairCompare {
    PairCompare(int a, int b){
        intA = a;
        intB = b;
    }
    private int intA;
    private int intB;
    
    public boolean equals(PairCompare pair2){
        if((intA+intB) == (pair2.intA+pair2.intB)){
            return true;
        }
        else{
            return false;
        }
    }
    public int hashCode(){
        int sum = intA+intB;
        return Integer.hashCode(sum);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PairCompare testerA = new PairCompare(6,10);
        PairCompare testerB = new PairCompare(11,5);
        PairCompare testerC = new PairCompare(99,5);
        System.out.println(testerA.equals(testerB));
        System.out.println(testerA.equals(testerC));
        System.out.println(testerA.hashCode());
        System.out.println(testerB.hashCode());
        System.out.println(testerC.hashCode());
        
    }
    
}
