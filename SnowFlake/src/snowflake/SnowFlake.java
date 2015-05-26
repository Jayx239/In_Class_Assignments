/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snowflake;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.lang.Integer;

/**
 *
 * @author Jason
 */
public class SnowFlake extends JComponent {
    SnowFlake(){
    }
    // its = iterations
    public int itCount = 0;
    private Vector<Integer> yVals = new Vector<Integer>();
    private Vector<Integer> xVals = new Vector<Integer>();
    int xVal[] = {300,240,360};
    int yVal[] = {200,300,300};
    int its = 2;
    public void drawFlake(){
            if(itCount == 0){
                xVals.add(300);
                xVals.add(240);
                xVals.add(360);
                yVals.add(200);
                yVals.add(300);
                yVals.add(300);
                itCount++;
            }
           
        if(itCount < its){
            if(itCount !=0){
                int size = yVals.size();
            for(int i=0; i<size; i++){
                if(i%3==0){
                xVals.add(xVals.get(i)*-1/3);
                yVals.add(yVals.get(i)*1/3);
                xVals.add(xVals.get(i)*2/3);
                yVals.add(yVals.get(i)*2/3);
                }
                if(i%3 == 1){
                xVals.add(xVals.get(i)*-1/3);
                yVals.add(yVals.get(i)*-1/3);
                xVals.add(xVals.get(i)*-2/3);
                yVals.add(yVals.get(i)*-2/3);
                }
                if(i%3 == 2){
                xVals.add(xVals.get(i)*1/3);
                yVals.add(yVals.get(i)*-1/3);
                xVals.add(xVals.get(i)*2/3);
                yVals.add(yVals.get(i)*-2/3);
                }
            }
            }
            itCount++;
            drawFlake();
        }
        repaint();
    }
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
                int x[] = new int[xVals.size()];
         int y[] = new int[yVals.size()];
         for(int i=0; i<yVals.size(); i++){
             y[i] = yVals.get(i);
             x[i] = xVals.get(i);
         }
        
        g2.drawPolygon(x, y, x.length);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       SnowFlake myFlake = new SnowFlake();
       frame.add(myFlake);
       myFlake.drawFlake();
       frame.show(true);

    }
    
}
