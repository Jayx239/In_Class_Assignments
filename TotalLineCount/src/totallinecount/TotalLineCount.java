/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package totallinecount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Jason
 */
public class TotalLineCount extends Thread{
public TotalLineCount(File f){
        file = f;
        thisFileNum = numFiles++;
        try{
            in = new Scanner(f);
        }
        catch(FileNotFoundException e){
            
        }
    }
    private Lock totLinesLock = new ReentrantLock();
    static int numFiles = 0;
    static int totalLines = 0;
    private int thisFileNum;
    File file;

    Scanner in;
    private int lineCount = 0;
    public void run(){
        try{
            while(in.hasNextLine()){
                in.nextLine();
                lineCount++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            
        }
        finally{
            System.out.println("File " + thisFileNum + " : " + lineCount + " Lines");
        }
        
        try{
            while(!totLinesLock.tryLock()){
                Thread.sleep(100);
            }
            totalLines+= lineCount;
            
        }
        catch(Exception e){
            
        }
        finally{
            totLinesLock.unlock();
            System.out.println(totalLines);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File files[] = new File[args.length];
        TotalLineCount lineCounts[] = new TotalLineCount[args.length];
        for(int i=0; i< args.length; i++){
            lineCounts[i] = new TotalLineCount(new File(args[i]));
            //lineCounts[i].start();
        }
        lineCounts[0].start();
        lineCounts[1].start();
        lineCounts[2].start();
        
        
    }
    
}
