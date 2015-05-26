/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package holleprinter;

/**
 *
 * @author Jason
 */
public class HollePrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="Hello world!";  // Set String to be modified
        System.out.println(str);    // Original string output
        String str2 = str.replace("e","O"); // Replace all e's with capital O's
        str2 = str2.replace("o","e");   // Replace o's with e's
        str2 = str2.replace("O", "o");  // Convert Capital O's to lower case o's
        System.out.println(str2);   // Print modified string
    }
    
}
