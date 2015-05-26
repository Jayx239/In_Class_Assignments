/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circuit;

/**
 *
 * @author Jason
 */
public class Circuit {
    Circuit(double resistance){
        Resistance = resistance;
    }
    private double Resistance;
    public double getResistance(){
        return Resistance;
    }
    public String toString(){
        return Double.toString(Resistance);
    }
    public Circuit clone(){
        return new Circuit(Resistance);
    }
    boolean equals(Circuit toCompare){
        if(Math.abs(getResistance()-toCompare.getResistance()) < .1){
            return true;
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SeriesCircuit s1 = new SeriesCircuit ( new Circuit( 2 ), new Circuit ( 3 ) );
ParallelCircuit p1 = new ParallelCircuit ( s1, new Circuit( 4 ) );
SeriesCircuit s2 = new SeriesCircuit ( p1, new Circuit( 1 ) );
ParallelCircuit p2 = new ParallelCircuit ( s2, new Circuit( 8 ) );
System.out.println( p2 + " = " + p2.getResistance() );

    Circuit curcuitToClone = new Circuit(5);
    Circuit cloned = curcuitToClone.clone();
    
    System.out.println("Original: " + curcuitToClone.toString());
    System.out.println("Cloned: " + cloned.toString());
    System.out.println("Circuit 1: " + p1.getResistance());
    System.out.println("Circuit 2: " + s2.getResistance());
    System.out.println("Saying circuit 1 is equal to circuit 2 is a "+p1.equals(s2) + " statement");
    System.out.println("Saying circuit 1 is equal to itself is a " + p1.equals(p1) + " statement");
    
    }
    
}
