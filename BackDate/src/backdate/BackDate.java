/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backdate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class BackDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Date date = new Date();
        try{
        File file = new File(args[0]);
        FileReader freader = new FileReader(file);    
        try{
        long rollBackDate = file.lastModified() - Integer.parseInt(args[1])*1000*60*60*24;
        file.setLastModified(rollBackDate);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid date");
        }
        }
        catch(FileNotFoundException e){
            System.out.println("Invalid file");
        }
        finally{
        
    }
        
        
}
    
}
