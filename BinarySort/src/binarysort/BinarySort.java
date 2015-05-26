/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarysort;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Jason
 */
public class BinarySort implements Comparator{
    public BinarySort(){
        
    }
    String outBinary = "";
    int arrayCount = -1;
    @Override
    public int compare(Object aOb, Object bOb){
            String a = (String) aOb;
            String b = (String) bOb;
            int aCount = 0;
            int bCount = 0;
            for(int i=0; i<a.length(); i++){
                if(a.charAt(i) == '1'){
                    aCount++;
                }
            }
            for(int i=0; i<b.length(); i++){
                if(b.charAt(i) == '1'){
                    bCount++;
                }
            }
            if(aCount > bCount){
                return 1;
            }
            else if(bCount>aCount){
                return -1;
            }
            else{
                return 0;
            }
    }
    public boolean equals(String a, String b){
        if(compare(a,b) == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public String sortBinary(int num){
        outBinary = "";
        int remainder = num%2;
        if(num >1){
            sortBinary(num/2);
        }
        outBinary = outBinary+Integer.toString(remainder);
        return outBinary;
    }
    public String[] sortBinaryArray(int input[]){
        String binary[] = new String[input.length];
        for(int i=0; i< input.length; i++){
        /*if(arrayCount == -1){
            arrayCount = input.length;
            binary[arrayCount-1] = sortBinary(arrayCount);
        }
        else if(arrayCount >0){
            binary[arrayCount] = sortBinary(--arrayCount);
        }*/
            binary[i] = sortBinary(input[i]);
        }
        
            Arrays.sort(binary,this);
            
            return binary;
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySort mySorter = new BinarySort();
        int arr[] = {10,45,12,56,15,254,152};
        String[] sortedBinary = mySorter.sortBinaryArray(arr);
        for(int i=0; i< sortedBinary.length; i++){
            System.out.println(sortedBinary[i]);
        }
    }

    
    
}
