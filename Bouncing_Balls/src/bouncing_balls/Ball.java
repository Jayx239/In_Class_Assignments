/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bouncing_balls;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author Jason
 */
public class Ball extends JComponent implements Runnable{
    
    Ball(int windowx, int windowy){
        
        x = (int) (Math.random()*windowx);
        y = (int) (Math.random()*windowy);
        speed = (int)(Math.random()*100);
        if (speed <20){
            speed = 20;
        }
        switch((int)(Math.round(Math.random()*7))){
            case 0: color = Color.BLUE;
                break;
            case 1: color = Color.GREEN;
                break;
            case 2: color = Color.MAGENTA;
                break;
            case 3: color = Color.ORANGE;
                break;
            case 4: color = Color.RED;
                break;
            case 5: color = Color.YELLOW;
                break;
            case 6: color = Color.CYAN;
                break;
            case 7: color = Color.PINK;
                break;
        }
        incrementX *=Math.random();
        incrementY *=Math.random();
        while(incrementX == 0 && incrementY == 0){
        incrementX =(int) Math.round(10*Math.random());
        incrementY = (int)Math.round(10*Math.random());
            
        }
        windowX = windowx-w;
        windowY = windowy;
                
    }
    private int x;
    private int y;
    int w = 10;
    private int speed;
    private Color color;
    int incrementX = 10;
    int incrementY = 10;
    int windowX;
    int windowY;
    
    public void move(){
        if((x <= 0 && incrementX <=0) || (x+w >= windowX-10 && incrementX >=0)){
            incrementX*=-1;
        }
        if((y <= 0 && incrementY <=0) || (y+w>= windowY-45 && incrementY >=0)){
            incrementY*=-1;
        }
        x+=incrementX;
        y+=incrementY;
        repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw((Graphics2D)g);
    }
    public void draw(Graphics2D g2){
        //g2.setColor(color);
        //g2.fillOval(x, y, w, w);
        g2.setColor(color);
        g2.fillOval(x,y, w, w);
    }
    
    public void animate(){
            move();
        }

    @Override
    public void run() {
        int k=0;
        for(;;){
            
        animate();
        
        //System.out.println("("+x+","+y+")");
try{
Thread.sleep(speed);
            }
            catch(InterruptedException e){
                
            }
        }
}
}
