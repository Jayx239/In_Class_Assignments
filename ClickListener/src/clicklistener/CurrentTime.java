/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clicklistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 *
 * @author Jason
 */
public class CurrentTime implements ActionListener {
    public void actionPerformed(ActionEvent action){
        Date now = new Date();
        System.out.println( now );
    }
}
