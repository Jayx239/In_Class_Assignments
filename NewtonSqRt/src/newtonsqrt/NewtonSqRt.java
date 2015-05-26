/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newtonsqrt;

import java.util.Arrays;

/**
 *
 * @author Jason
 */
public class NewtonSqRt {
    private double rt = 0;
    private int n ;
    NewtonSqRt(int N){
        n= N;
    }
    double Sqrt(){
        if((rt*rt)>=(n-.00001) && (rt*rt) <=(n+.00001)){
        }
        else{
            if (rt == 0){
                rt=n;
            }
        rt= .5*(rt+(n/rt));
            Sqrt();
        }
        return rt;
    }
    public int KthLargest(int nums[],int k){
        assert k >0;
       Arrays.sort(nums);
        return nums[nums.length-k];
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewtonSqRt t5 = new NewtonSqRt(25);
        System.out.println(t5.Sqrt());
        NewtonSqRt t2 = new NewtonSqRt(2);
        System.out.println(t2.Sqrt());
        int ns[] = {5,2,9,10,1,5,4};
        int n = t2.KthLargest(ns,1);
        System.out.println(n);
    }
    
}
