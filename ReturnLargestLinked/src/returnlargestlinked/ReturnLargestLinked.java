/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package returnlargestlinked;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Jason
 */
public class ReturnLargestLinked {
    public ReturnLargestLinked(){
    }
    
    public int Largest(LinkedList<Integer> list){
        ListIterator<Integer> iterator = list.listIterator();
        int greatest = 0;
        if(iterator.hasNext()){
            greatest = iterator.next();
        }
        int temp;
        while(iterator.hasNext()){
            if((temp = iterator.next()) >= greatest){
                greatest = temp;
            }
            
        }
        return greatest;
    }
    public LinkedList<Integer> intersection(LinkedList<Integer> setA, LinkedList<Integer> setB){
        ListIterator<Integer> iteratorA = setA.listIterator();
        LinkedList<Integer> output = new LinkedList<Integer>();
        
        while(iteratorA.hasNext()){
            int a = iteratorA.next();
            ListIterator<Integer> iteratorB = setB.listIterator();
            while(iteratorB.hasNext()){
                if(a == iteratorB.next()){
                    
        ListIterator<Integer> iteratorout = output.listIterator();
        boolean repeat = false;
                    while(iteratorout.hasNext()){
                        if(iteratorout.next() == a){
                            repeat = true;
                        }
                    }
                    if (repeat == false){
                    output.add(a);
                    }
                    break;
                }
            }
        }
        return output;
    }
    
    public LinkedList<Integer> union(LinkedList<Integer> setA, LinkedList<Integer> setB){
        ListIterator<Integer> iteratorA = setA.listIterator();
        LinkedList<Integer> output = new LinkedList<Integer>();
        
        while(iteratorA.hasNext()){
            output.add(iteratorA.next());
        }
        
            ListIterator<Integer> iteratorB = setB.listIterator();
        while(iteratorB.hasNext()){
            int b = iteratorB.next();
             ListIterator<Integer> iteratorOut = setA.listIterator();
             boolean repeat = false;
             while(iteratorOut.hasNext()){
                 if(iteratorOut.next() == b){
                     repeat = true;
                 }
             }
            if(!repeat){
                output.add(b);
            }
        }
        return output;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> input = new LinkedList<Integer>();
        ReturnLargestLinked tester = new ReturnLargestLinked();
        input.add(1);
        input.add(5);
        input.add(-10);
        input.add(20);
        System.out.println(tester.Largest(input));
        
        LinkedList<Integer> input2 = new LinkedList<Integer>();
        input2.add(1);
        input2.add(5);
        input2.add(6);
        input2.add(100);
        
        System.out.println(tester.intersection(input, input2));
        System.out.println(tester.union(input, input2));
        
    }
    
}
