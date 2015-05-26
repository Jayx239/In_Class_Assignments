/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primemultithreaded;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Jason
 */
public class PrimeMultiThreaded extends Thread{
    public PrimeMultiThreaded(int startNum){
        sNum = startNum;
    }
    static Lock evalNumLock = new ReentrantLock();
    static int numEvaluated;
    private int sNum = 0;
    static int isPrime = 0;
    public void setNumEvaluated(int in){
        numEvaluated = in;
    }
    public void run(){
        try{
            for(;;){
                while(!evalNumLock.tryLock()){
                    
                }
            
                
                                
                
                for(int i=0; i<3; i++){
                    if(isPrime == -1){
                        this.interrupt();
                    }
                    if(numEvaluated%sNum == 0){
                        isPrime = -1;
                        System.out.println(numEvaluated + " is not prime");
                        this.interrupt();
                    }
                    sNum+=4;
                }
                if(numEvaluated>=sNum){
                    sNum+=1;
                }
                if(sNum == 2){
                    System.out.println(numEvaluated +" is prime");
                    this.interrupt();
                }
                evalNumLock.unlock();
            
            
            
            Thread.sleep(500);
        }
        }
        catch(Exception e){
            
        }
        finally{
            evalNumLock.unlock();
        }
            
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrimeMultiThreaded primeThread1 = new PrimeMultiThreaded(3);
        PrimeMultiThreaded primeThread2 = new PrimeMultiThreaded(5);
        primeThread1.setNumEvaluated(1281016105);
        
        primeThread1.start();
        primeThread2.start();
        
        
    }
    
}
