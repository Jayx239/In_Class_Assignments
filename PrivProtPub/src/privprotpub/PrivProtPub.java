/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package privprotpub;

/**
 *
 * @author Jason
 */
public class PrivProtPub {
    PrivProtPub(){
        
    }
    private int priv = 10;
    protected int prot = 100;
    public int pub = 1000;
    private void getPriv(){
        System.out.println("Private");
    }
    protected void getProt(){
        System.out.println("Protected");
    }
    public void getPub(){
        System.out.println("Public");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tester testit = new tester();
        //testit.getPriv(); doesn't work, private members can only be called within class
        testit.getProt();   // works, subclass can access protected methods
        testit.getPub();    // works, subclass can access public methods
        testit.getPrivVal();    // Doesn't work, can't access private instance variable of super class in subclass
        testit.getProtVal(); // works, subclass can access super classes protected variables
        testit.getPubVal(); // works, subclass can access super classes public instance variables
        
    }
    
}
