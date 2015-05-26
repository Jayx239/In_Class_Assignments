/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quickclick;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 *
 * @author Jason
 */
public class GuiLayout implements ActionListener {
    private static boolean first = true;
    private long start = 0;
    private long dur = 0;
    Date getDate = new Date();
    public void actionPerformed(ActionEvent action){
            if(first){
                start = getDate.getTime();
                first = false;
            }
            else{
                dur =  getDate.getTime()-start;
                first = true;
                System.out.println(dur);
            }
            
            if(obj1 == obj2){
                
            }
        }
    
}
