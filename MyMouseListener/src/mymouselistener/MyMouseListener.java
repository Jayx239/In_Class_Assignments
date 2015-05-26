/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mymouselistener;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Jason
 */
public class MyMouseListener implements MouseListener{
    Point topLeftWind = new Point(0,0);
    Point botRightWind = new Point(0,0);
    private boolean Inside = false;
    public void mousePressed(MouseEvent event){
        cMan.setPaint(Color.BLUE);
    }
    public void mouseMoved(MouseEvent event){
        
    }
    public void mouseClicked(MouseEvent event){
        Point mouseLoc = event.getLocationOnScreen();
        cMan.setPaint(Color.BLACK);
    }
    public void mouseExited(MouseEvent event){
        Inside = false;
        cMan.setPaint(Color.GREEN);
    }
    
    public void mouseEntered(MouseEvent event){
        cMan.setPaint(Color.BLACK);
    }
    public void mouseReleased(MouseEvent event){
        
    }
    
}
