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
public class ParallelCircuit extends Circuit{
    ParallelCircuit(Circuit circuit1, Circuit circuit2){
        super(circuit1.getResistance());
        Resistance = (circuit1.getResistance()*circuit2.getResistance())/(circuit1.getResistance()+circuit2.getResistance());
        Circuit1 = circuit1;
        Circuit2 = circuit2;
    }
    Circuit Circuit1;
    Circuit Circuit2;
    
    private double Resistance = 0;
    public double getResistance(){
        return Resistance;
    }
    public String toString(){
        return "("+Circuit1.toString() + "||"+Circuit2.toString() + ")";
    }
}
