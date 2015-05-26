/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vowelsconsonants;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class VowelsConsonants {

   public VowelsConsonants(){
    }
    
    public String letterClass(char character){
        switch(character){
            case 'a':   return "vowel";
            case 'e':   return "vowel";
            case 'i':   return "vowel";
            case 'o':   return "vowel";
            case 'u':   return "vowel";
            case 'y':   return "semi-vowel";
            case 'w':   return "semi-vowel";
            default :   return "consonant";
            }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char userInput;
        VowelsConsonants tester = new VowelsConsonants();
        // tests
        System.out.println("a is a: "+tester.letterClass('a'));
        System.out.println("Expecter: vowel");
        System.out.println("e is a: "+tester.letterClass('e'));
        System.out.println("Expecter: vowel");        
        System.out.println("i is a: "+tester.letterClass('i'));
        System.out.println("Expecter: vowel");
        System.out.println("o is a: "+tester.letterClass('o'));
        System.out.println("Expecter: vowel");    
        System.out.println("u is a: "+tester.letterClass('u'));
        System.out.println("Expecter: vowel");
        System.out.println("y is a: "+tester.letterClass('y'));
        System.out.println("Expecter: semi-vowel");
        System.out.println("w is a: "+tester.letterClass('w'));
        System.out.println("Expecter: semi-vowel");
        System.out.println("z is a: "+tester.letterClass('z'));
        System.out.println("Expecter: consonant");
        
        
    }
    
}
