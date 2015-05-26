/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linecount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Jason
 */
public class LineCount extends Thread{
    public LineCount(File f){
        file = f;
        thisFileNum = numFiles++;
        try{
            in = new Scanner(f);
        }
        catch(FileNotFoundException e){
            
        }
    }
    static int numFiles = 0;
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
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File files[] = new File[args.length];
        LineCount lineCounts[] = new LineCount[args.length];
        for(int i=0; i< args.length; i++){
            lineCounts[i] = new LineCount(new File(args[i]));
            //lineCounts[i].start();
        }
        //Problem 2
        lineCounts[0].start();
        lineCounts[1].start();
        lineCounts[2].start();
        //Problem 3
        
        
    }
    
}
