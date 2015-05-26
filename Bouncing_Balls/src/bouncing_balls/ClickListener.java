/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bouncing_balls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Jason
 */
public class ClickListener implements ActionListener {
    ClickListener(JFrame frame){
     framei = frame;   
    }
    JFrame framei;
    @Override
    public void actionPerformed(ActionEvent e) {
        addBall(new Ball(500,500));
        System.out.println("Clicked");
    }
    public static ArrayList Balls = new ArrayList();
    
    public void addBall(Ball ball){
        Balls.add(ball);
        framei.add(ball);
        new Thread(ball).start();
        framei.validate();
        
}
    
}
