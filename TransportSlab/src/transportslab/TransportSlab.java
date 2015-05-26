/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportslab;

import java.util.Random;

/**
 *
 * @author Jason
 */
public class TransportSlab {

    // Instance Variables
    private int N = 0;  // Incident particles
    private double T = 0;   // Thickness
    private double SigmaT = 0;  // Macroscopic cross sections
    private int Sections = 0;   // number of sections
    private double[] AnalyticalData;    // holder for analytical data
    private double[] EulerData;     // Holder for Euler Data
    private double[] MonteData; // holder for Monte Carlo Data 
    private double leastSquaresSigmaValue = 0;  // Holder for least squares sigma value
    // Constructor

    TransportSlab(int n, double t, double sigmat, int sections) {
        N = n;      // set Incident particles
        T = t;      // set Thickness
        SigmaT = sigmat;    // set Marcoscopic cross sections
        Sections = sections;    // set number of sections
        AnalyticalData = new double[Sections];    // set analytical array size
        EulerData = new double[Sections];     // set euler method size
        MonteData = new double[Sections];     // set monte data size

    }

    // Method for calculating analytical data

    public void analytical() {
        for (int i = 0; i < Sections; i += T) {
            double t = (double) i / Sections;    // calculate line space
            AnalyticalData[i] = N * Math.exp(-SigmaT * t);  // calculate analytical data
        }

    }

    // Method returning Analytical data set

    public double[] getAnalyticalData() {
        return AnalyticalData;  // return analytical data
    }

    // Method for calulating euler data set

    public void euler() {
        EulerData[0] = N;   // Set first value of analytical data to the total number of incident particles
        double t = (double) T / Sections;  // calulate linespace value
        for (int i = 1; i < Sections; i++) {
            EulerData[i] = EulerData[i - 1] - EulerData[i - 1] * SigmaT * t;  // Calculate euler data
        }
    }

    // Method returning Euler data set 

    public double[] getEulerData() {
        return EulerData;   // return euler data
    }

    // Method for calulating monte carlo data set

    public void monteCarlo() {
        MonteData[0] = N;       // Set initial Value to total number of incident particles
        double t = (double) T / Sections;  // calcuate linspace value
        double probability = SigmaT * t;  // calculate probability
        double survived = N;        // set initial survived to total number of incident particles
        double test = 0;            // intitialize test value(counter variable for holding number of particles that left in a section)
        double rand = 0;             // variable to hold rand value
        for (int i = 1; i < Sections; i++) {
            test = 0;                           // Reset test value
            for (int j = 0; j < survived; j++) {
                rand = Math.random();           // calculate random value
                if (rand > probability) {
                    test += 1;                   // increment test value if rand is greater then probability
                }
            }
            MonteData[i] = test;    // Set monte data point to the number that survived
            survived = test;        // reset the number of particles that survived
        }
    }
    // Method returning monte carlo data set

    public double[] getMonteData() {
        return MonteData;           // Return monte data
    }

    // Method for calulating and displaying the macroscopic cross section
    public void leastSquaresSigma(double[] input) {
        double[] y = new double[Sections];  // create holder for log values 
        double t = (double) T / Sections;     // calulate linespace value
        double sumxx = 0;                   // holder for sum of linespace values
        double sumxx2 = 0;                  // holder for sum of linespace squared values
        double sumxxy = 0;                   // holder for sum of the product of linespace and log values
        double sumy = 0;                    // sum of log values          
        for (int i = 0; i < Sections; i++) {
            y[i] = Math.log(input[i]);      // calculate log of input values
            sumxx += t * i;                   // calculate sumxx values
            sumxx2 += t * i * t * i;              // calculate sumxx2 values
            sumxxy += t * i * y[i];             // calculate sumxxy values
            sumy += y[i];                   // calculate sum of log values
        }
        leastSquaresSigmaValue = (-1 / ((Sections * sumxx2) - (sumxx * sumxx))) * ((-sumxx * sumy) + (Sections * sumxxy));  // calculate least squares value
        System.out.println(leastSquaresSigmaValue);     // Print least squares value
    }
    public int getSections(){
        return Sections;
    }

}
