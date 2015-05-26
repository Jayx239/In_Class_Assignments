/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clicktimer;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jason
 */
public class Clicktimer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            JFrame frame = new JFrame();
        JButton button = new JButton( "Click me!" );
        JButton button2 = new JButton("Don't click me");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(button, BorderLayout.WEST);
        panel.add(button2,BorderLayout.EAST);
        frame.add( panel );
        ActionListener listener = new GuiLayout();
        ActionListener listener2 =new GuiLayout();
        button.addActionListener( listener );
        button2.addActionListener( listener2);
        frame.setSize( 500, 500 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.show();
    }
    
}
