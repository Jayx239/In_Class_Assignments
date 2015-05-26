/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package freememory;

/**
 *
 * @author Jason
 */
public class FreeMemory {
    FreeMemory(){
        
    }
    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long maxFreeMemory = 0;
        long minFreeMemory = Long.MAX_VALUE;
                while(maxFreeMemory - minFreeMemory > ACCURACY){
                    try{
                        Byte[(maxFreeMemory+minFreeMemory)/2)] bytes = new Byte();
                    }
                    
                    
}
    }
    
}
