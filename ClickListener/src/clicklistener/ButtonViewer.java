/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clicklistener;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Jason
 */
public class ButtonViewer {
    public static void main( String[] args ) {
        JFrame frame = new JFrame();
        JButton button = new JButton( "Click me!" );
        JButton button2 = new JButton("Don't click me");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(button, BorderLayout.WEST);
        panel.add(button2,BorderLayout.EAST);
        frame.add( panel );
        ActionListener listener = new ClickListener();
        ActionListener listener2 = new ClickListener();
        button.addActionListener( listener );
        button2.addActionListener( listener2);
        frame.setSize( 500, 500 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
        ActionListener ct = new CurrentTime();
        
        Timer timer = new Timer(1000,ct);
        timer.start();
        JButton button3 = new JButton("Get Date");
        panel.add(button3,BorderLayout.CENTER);
        CurrentTime listenerDate = new CurrentTime();
        button3.addActionListener(listenerDate);
    }
}
