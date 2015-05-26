/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportslab;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/**
 *
 * @author Jason
 */
public class TransportSlabGraphics extends JComponent {

    private double[] AnalyticalPoints;  // Holder of Analytical Points
    private double[] EulerPoints;       // Holder of Euler Points
    private double[] MontePoints;       // Holder of Monte Points
    private double Sections = 0;        // Holder of sections
    private double SigmaT = 0;          // Holder of SigmaT
    private double T = 0;               // Holder of Thickness
    private int N = 0;                  // Holder of number of particles

    TransportSlabGraphics(int n, double t, double sigmat, int sections) {
        TransportSlab grabber = new TransportSlab(n, t, sigmat, sections); // Create new TransportSlab object
        grabber.analytical();   // Generate analytical data
        grabber.euler();        // Generate euler data
        grabber.monteCarlo();   // Generate Monte data
        AnalyticalPoints = grabber.getAnalyticalData(); // store analytical data
        EulerPoints = grabber.getEulerData();   // store euler data
        MontePoints = grabber.getMonteData();   // store monte data
        N = n;      // store the number of particles
        T = t;      // store the thickness
        SigmaT = sigmat;    // store sigmaT
        Sections = sections;    // store Sections

    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; // Create ne graphics object
        Rectangle innerPlotFrame = new Rectangle(200, 100, 800, 600);    // Set Plot frame Dimensions
        g2.setStroke(new BasicStroke(5));       // Set stroke thickness
        g2.draw(innerPlotFrame);        // Draw plot frame
        Rectangle Legend = new Rectangle(800, 100, 200, 100);  // Create legend rectangle
        g2.draw(Legend);    // Draw legend
        g2.setColor(Color.red);         // Set color for first data set
        g2.drawString("Analytical Data", 820, 120); // Add to legend
        //Display Analytical Data set
        for (int i = 0; i < AnalyticalPoints.length; i++) {
            double xPosition = (i * 800 / AnalyticalPoints.length) + 200;  // Set x position
            double yPosition = 700 - ((500.0 / N) * (AnalyticalPoints[i]));       // Set y position
            Ellipse2D.Double point = new Ellipse2D.Double(xPosition, yPosition, 5, 5);     // Set point
            g2.fill(point);     // Plot point
        }

        g2.setStroke(new BasicStroke(1));   // Set Stroke size
        // Draw Line for Analytical Data set
        for (int i = 1; i < AnalyticalPoints.length; i++) {
            double xPosition1 = ((i - 1) * 800 / AnalyticalPoints.length) + 200;     // Set x1 position
            double xPosition2 = ((i) * 800 / AnalyticalPoints.length) + 200;       // Set x2 position
            double yPosition1 = 700 - ((500.0 / N) * (AnalyticalPoints[i - 1]));        // set y1 position
            double yPosition2 = 700 - ((500.0 / N) * (AnalyticalPoints[i]));          // set y2 position
            Line2D.Double line = new Line2D.Double(xPosition1, yPosition1, xPosition2, yPosition2);    // create line
            g2.draw(line);      // draw line
        }
        g2.setColor(Color.blue);    // set color
        g2.drawString("Euler Data", 820, 150); // Add to legend
        // Display Euler Data set
        for (int i = 0; i < EulerPoints.length; i++) {
            double xPosition = (i * 800 / EulerPoints.length) + 200;   // set x position
            double yPosition = 700 - ((500.0 / N) * (EulerPoints[i]));    // set y position
            Ellipse2D.Double point = new Ellipse2D.Double(xPosition, yPosition, 5, 5);     // set point
            g2.fill(point); // draw point
        }

        // Draw Line for Euler Data set
        for (int i = 1; i < EulerPoints.length; i++) {
            double xPosition1 = ((i - 1) * 800 / EulerPoints.length) + 200;  // set x1 position
            double xPosition2 = ((i) * 800 / EulerPoints.length) + 200;    // set x2 position
            double yPosition1 = 700 - ((500.0 / N) * (EulerPoints[i - 1]));     // set y1 position
            double yPosition2 = 700 - ((500.0 / N) * (EulerPoints[i]));       // set y2 position
            Line2D.Double line = new Line2D.Double(xPosition1, yPosition1, xPosition2, yPosition2);        // create line
            g2.draw(line);  // draw line
        }

        g2.setColor(Color.green);   // set color
        g2.drawString("Monte Carlo Data", 820, 180); // Add to legend
        // Display Monte Carlo data set
        for (int i = 0; i < MontePoints.length; i++) {
            double xPosition = (i * 800 / MontePoints.length) + 200;   // set x position
            double yPosition = 700 - ((500.0 / N) * (MontePoints[i]));    // set y position
            Ellipse2D.Double point = new Ellipse2D.Double(xPosition, yPosition, 5, 5); // set point
            g2.fill(point);     // draw point
        }

        // Draw Line for Monte Carlo Data set
        for (int i = 1; i < MontePoints.length; i++) {
            double xPosition1 = ((i - 1) * 800 / MontePoints.length) + 200;      // set x1 position
            double xPosition2 = ((i) * 800 / MontePoints.length) + 200;        // set x2 position
            double yPosition1 = 700 - ((500.0 / N) * (MontePoints[i - 1]));         // set y1 position
            double yPosition2 = 700 - ((500.0 / N) * (MontePoints[i]));           // set y2 position
            Line2D.Double line = new Line2D.Double(xPosition1, yPosition1, xPosition2, yPosition2);        // create line
            g2.draw(line);      // draw line
        }
        g2.setColor(Color.BLACK);   // set color
        g2.setStroke(new BasicStroke(1));   // change stroke size
        AffineTransform originalT = g2.getTransform();   // get original translation
        AffineTransform modifiedT = new AffineTransform();  // Create Vertical Translation
        
        // Plot Scale and scale labels
        for (int i = 0; i < 100; i++) {
            double xPosition = 200 + i * 800 / 100;        // set x position for tick mark
            double yPosition = 700 - i * 600 / 100;       // set y position for tick mark
            // Plot x Axis
            if (i % 5 == 0) {
                String placeMarker = "%.01f";   // Setup formatting
                Line2D.Double line = new Line2D.Double(xPosition, 710, xPosition, 690); // Create tick mark
                g2.draw(line);  // Draw tick mark
                modifiedT.setToRotation(Math.toRadians(90),(int) xPosition, 715);  // Set vertical translation position
                g2.setTransform(modifiedT); // set vertical translation
                g2.drawString(String.format(placeMarker, (i * Sections / 100.0)), (int) xPosition, 715);   // Draw label
                g2.setTransform(originalT); // Reset translation
            } else {
                Line2D.Double line = new Line2D.Double(xPosition, 700, xPosition, 690); // Create smaller tick mark
                g2.draw(line);  // Draw tick mark
            }
            // Plot y Axis
            if (i % 5 == 0) {
                String placeMarker = "%.01f";   // Setup formatting
                Line2D.Double lineY = new Line2D.Double(190, yPosition, 210, yPosition);    // Create tick mark
                g2.draw(lineY);     // draw tick mark
                g2.drawString(String.format(placeMarker, (N * i * .6 / 50.0)), 140, (int) yPosition);   // Draw label
            } else {
                Line2D.Double lineY = new Line2D.Double(200, yPosition, 210, yPosition);    // create small tick mark
                g2.draw(lineY); // draw tick mark
            }
        }
        // Add labels
        g.setFont(new Font("TimesRoman", Font.PLAIN, 25));      // Set Font
        g2.drawString("Position(cm)", 550, 780); // x Label
        g2.drawString("Particles Dispersed Through Slab", 400, 50); // Title
        modifiedT.setToRotation(Math.toRadians(-90),75, 400);  // Set vertical translation position
        g2.setTransform(modifiedT); // set vertical translation
        g2.drawString("N(x)", 75, 400);   // Number of particles
        g2.setTransform(originalT); // reset vertical translation
        // Display Variables
        g.setFont(new Font("TimesRoman", Font.PLAIN, 15));      // Set Font
        String variables = "Number of particles: %d   Thickness: %.01f  SigmaT: %.01f  Sections: %.01f";   // create variables string (n, t, sigmat, sections)
        g2.drawString(String.format(variables,N,T,SigmaT,Sections),350,75); // draw variables
        g2.drawString("Created By: Jason Gallagher", 20, 30);   // Display the AWESOME creators name
        
    }
}
