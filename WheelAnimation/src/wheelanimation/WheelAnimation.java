/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wheelanimation;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Jason
 */
public class WheelAnimation extends JPanel implements ActionListener{
    
    int x = 10 ;
    int y = 150;
    int width = 50;
    int height = 50;
    int xc = x+width/2;
    int yc = y+height/2;
    int xs[] = {x+width, x, x-width};
    int ys[] = {y, y+height, y};
    int offset[] = {0,90,102};
    Timer timer;
    public WheelAnimation(){
        timer = new Timer(1000/40,this);
        timer.start();
    }
    
    
    public void paint(Graphics g){
        
        if(xc <= 450){
        xc++;
        x++;
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);
        
        g2.clearRect(0, 0, 500, 300);
        for(int i=0; i<3; i++){
            xs[i] = (int)Math.floor(Math.cos((offset[i]+x)*Math.PI/8)*width/2+xc);
            ys[i] = (int)Math.floor(Math.sin((offset[i]+x)*Math.PI/8)*height/2+yc);
            g2.drawLine( xc, yc, xs[i], ys[i]);
        }
        
        g2.drawOval(x, y, width, height);
        g2.setColor(Color.GREEN);
        g2.drawLine(10,y+height+1,470,y+height+1);
        }
        else{
            timer.stop();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame("animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new WheelAnimation());
    frame.setSize(500, 300);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    }
    
}
