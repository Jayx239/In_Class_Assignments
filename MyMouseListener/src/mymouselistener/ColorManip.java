/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mymouselistener;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Jason
 */
public class ColorManip extends JComponent {
    ColorManip(Graphics g){
        gra = (Graphics2D) gra;
        gra.fillRect(50, 50, 400, 400);
        gra.drawRect(50,50,400,400);
        c = Color.BLACK;
    }
    public static Graphics2D gra;
    public static Color c;
    public static void paintRect(){
        
        
    }
    public static void setPaint(Color color){
        setPaint(gra, color);
    }
    public static void setPaint(Graphics g, Color color){
        Graphics2D g2D = (Graphics2D) g;
        g2D.setBackground(color);
        paintRect();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object g = new Object();
        ColorManip colorMan;
        colorMan = new ColorManip((Graphics) g);
        JFrame mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Rectangle rectangle = new Graphics.drawRectangle(50,50,400,400);
        mainFrame.getContentPane().add(colorMan);
        mainFrame.setVisible(true);
        
    }
}
