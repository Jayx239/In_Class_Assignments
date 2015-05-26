/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package copy;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class Copy {
    Copy(){
        
    }
    public int safeAdd(int a, int b){
        try{
            int c = a+b;
        if( a>0 && b>0 && c < 0 ){
            throw new Exception("ExceptionOverflow");
        }
        return c;
            }
        catch(Exception e){
            System.out.println("The integer values are too large, memory overflow");
            return 0;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String file1 = args[0];
        String file2 = args[1];
        try{
        File fin = new File(file1);
        File fout = new File(file2);
        
            try{
                
            FileWriter fw = new FileWriter(fout);
            Scanner in = new Scanner(fin);
            fw.write(in.nextLine());
            while(in.hasNext()){
                fw.write(in.next());
            }
                fw.close();
            }   
            catch(IOException e){
                System.out.println("File Read/Write Error");
            }
        }
        catch(Exception e){
            System.out.println("Error opening file");
        }
        Copy c = new Copy();
        c.safeAdd(1077395289, 1083927941);
        
    }
    
}
