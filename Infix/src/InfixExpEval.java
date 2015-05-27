
import infix.Infix;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class InfixExpEval {
    
       public static void main(String[] args) {
        // TODO code application logic here
        Infix tester = new Infix();
        System.out.println(tester.evaluatePostfix("2 4 + 9 23 * 2 + +"));
        System.out.println(tester.infixToPostfix("(2+1)-(5/3)+2*3"));
        for(int i = 0; i < args.length; i++){
            String tString = tester.infixToPostfix(args[i]);
            System.out.println(tester.infixToPostfix(args[i]));
            System.out.println(tester.evaluatePostfix(tString));
        }
    }
    
    
}
