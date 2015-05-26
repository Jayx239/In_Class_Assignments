/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fractalhomework;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Jason
 */
public class FractalHomeWork extends JComponent {
    private static int FRAME_LEN = 500; /* Both width and height */
 private int order; /* Snowflake order */
    public FractalHomeWork(int n){
        order = n;
    }

    public void paintComponent( Graphics g )
 {
 Graphics2D g2 = ( Graphics2D ) g;
 double len = FRAME_LEN/3;
 /* lines of the equilateral triangle for order 0 */
 draw( g2, order,1 );
 }
 public static void draw( Graphics2D g2, int order, int index )
 {
     if(order>0){
     double repeat = Math.random();
     int numCirc = 2;
     if(repeat >= .5){
         numCirc = 4;
     }
     //color select
     int colorInd = (int)Math.round(Math.random()*100000)%8;
     switch(colorInd){
         case 0: g2.setColor(Color.YELLOW);
             break;
         case 1: g2.setColor(Color.red);
             break;
         case 2: g2.setColor(Color.green);
             break;
         case 3: g2.setColor(Color.BLUE);
             break;
         case 4: g2.setColor(Color.CYAN);
             break;
         case 5: g2.setColor(Color.black);
             break;
         case 6: g2.setColor(Color.MAGENTA);
             break;
         case 7: g2.setColor(Color.WHITE);
             break;
     }
     
     int w1 = Math.round(FRAME_LEN/index);
     int h1 = w1;
     int w2 = Math.round(FRAME_LEN/index);
     int h2 = w2;
     int x1 = (int)((Math.random()*(FRAME_LEN/2))-(.04*w1));
     int y1 = (int)((Math.random()*(FRAME_LEN/2))-.04*w1);
     int x2 = 0;
     int y2 = 0;
     int x3 = (int)((Math.random()*(FRAME_LEN/2))-.04*w2);
     int y3 = (int)((Math.random()*(FRAME_LEN/2))-.04*w2);
     int x4 = 0;
     int y4 = 0;
     
     if(x1 > FRAME_LEN/2){
         
        x2 = (FRAME_LEN)-x1;
     }
     else if(x1<FRAME_LEN/2){
         
         x2 = -x1+(FRAME_LEN);
     }
     else{
         
         x2 = x1;
     }
     if(y1 > FRAME_LEN/2){
         
        y2 = (FRAME_LEN)-y1;
     }
     else if(y1<FRAME_LEN/2){
         
         y2 = -y1+(FRAME_LEN);
     }
     else{
         
         y2 = y1;
     }
     if(x3 > FRAME_LEN/2){
         
        x4 = (FRAME_LEN)-x3;
     }
     else if(x3<FRAME_LEN/2){
         
         x4 = -x3+(FRAME_LEN);
     }
     else{
         
         x4 = x3;
     }
     if(y3 > FRAME_LEN/2){
         
        y4 = (FRAME_LEN)-y3;
     }
     else if(y3<FRAME_LEN/2){
         
         y4 = -y3+(FRAME_LEN);
     }
     else{
         
         y4 = y3;
     }
     
         g2.fillOval(x1-w1/2,y1-h1/2,w1,h1);
         g2.fillOval(x2-w2/2,y2-h2/2,w2,h2);
     /*
     if(numCirc == 4){
         g2.fillOval(x3,y3,w2,h2);
         g2.fillOval(x4,y4,w2,h2);
     }*/
     
     draw( g2, --order, ++index );
     }
     else{
         g2.setColor(Color.black);
         g2.drawOval((FRAME_LEN/2)-25, (FRAME_LEN/2)-25, 48, 48);
         
     }
     
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FractalHomeWork myHomeWork = new FractalHomeWork(10);
        JFrame frame = new JFrame();
 frame.setSize( FRAME_LEN, FRAME_LEN );
 frame.setTitle( "Snowflake of Order ");
 frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 frame.add( myHomeWork );
 frame.setVisible( true );
    }
    
}
