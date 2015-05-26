/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bouncing_balls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jason
 */
public class BallFrame extends JFrame{
    BallFrame(){
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton addBallButt = new JButton("Add Ball");
        this.setTitle("Great Balls of Fire");
        
        ActionListener buttonListener = new ClickListener(this);
        addBallButt.addActionListener(buttonListener);
        Ball ball = new Ball(500,500);
        addBallButt.setSize(100, 20);
        addBallButt.setLocation(200, 0);
        JPanel panel = new JPanel();
        panel.setLocation(300, 200);
        //panel.add(addBallButt);
        this.add(addBallButt);
        this.add(ball);
        new Thread(ball).start();
    }
    
}

