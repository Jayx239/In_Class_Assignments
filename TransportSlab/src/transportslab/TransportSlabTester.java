/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package transportslab;

import javax.swing.JFrame;

/**
 *
 * @author Jason
 */
public class TransportSlabTester {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TransportSlab tester = new TransportSlab(10000,1,5,100);    // Create TrnsportSlab object    
        tester.analytical();    // calculate analytical solution
        tester.euler();     // Calculate euler solution
        tester.monteCarlo();    // calculate monte carlo solution
        System.out.print("Least Squares Analytical: ");
        tester.leastSquaresSigma(tester.getAnalyticalData());   // calculate analytical least squares value
        System.out.print("Least Squares Euler: ");
        tester.leastSquaresSigma(tester.getEulerData());        // caculate Euler least squares value
        System.out.print("Least Squares Monte Carlo: ");
        tester.leastSquaresSigma(tester.getMonteData());        // caculate monte carlo least squares value
    //----------------------Begin Graphical Component-----------------------
        JFrame PlotFrame = new JFrame();
        PlotFrame.setSize(1100,900);
        PlotFrame.setTitle("Incident Particles");
        PlotFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TransportSlabGraphics graphics = new TransportSlabGraphics(10000,1,5,100);
        PlotFrame.add(graphics);
        PlotFrame.setVisible(true);
    }   
        
}
