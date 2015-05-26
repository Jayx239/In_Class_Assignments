/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package drawingrectangles;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Jason
 */
public class DrawingRectangles{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame myFrame = new JFrame();
        myFrame.setSize(300,400);
        myFrame.setTitle("My Frame");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        RectangleComponent rectangle = new RectangleComponent();
        myFrame.add(rectangle);
        myFrame.setVisible(true);
    }
    
}
