/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clicklistener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jason
 */
public class ClickListener implements ActionListener {
    private int count = 0;
    public void actionPerformed( ActionEvent event ) {
        count++;
        System.out.println( "I was clicked. Click number " + count );
    
    }
    
    /**
     * @param args the command line arguments
     */
    
}
