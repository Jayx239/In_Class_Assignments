/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;
import java.util.Scanner;
/**
 *
 * @author Jason
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String userInput;
        boolean isPalindrome = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        userInput = input.nextLine();
        int i = 0;
        int j = userInput.length()-1;
        userInput = userInput.toLowerCase();
        while(i<j){
        if(userInput.charAt(i)!=userInput.charAt(j)){
            isPalindrome = false;
        }
        i++;
        j--;
    }
        if(isPalindrome == true){
            System.out.println("The word is a palindrome!");
        }
        else{
            System.out.println("The word is not a palindrome");
        }
        
    }
    
}
