/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package drawingrectangles;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author Jason
 */
public class RectangleComponent extends JComponent {
    public void paintComponent(Graphics g){
        //Recover Graphics 2d
        Graphics2D g2 = (Graphics2D) g;
        Rectangle myRectangle = new Rectangle(2,4,20,30);
        g2.draw(myRectangle);
        myRectangle.translate(4,10);
        g2.draw(myRectangle);
    }
    
}
