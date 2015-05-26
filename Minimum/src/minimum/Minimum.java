/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minimum;

import java.awt.Point;

/**
 *
 * @author Jason
 */
public class Minimum{
    Minimum(){
        
    }
    
    public Object getMinimum(Comparable objs[]){
        Comparable smallest = objs[0];
        for(int i=0; i< objs.length; i++){
            if(smallest.compareTo(objs[i]) > 0){
                smallest = objs[i];
            }
        }
        return smallest;
    }
    public Object getMinimum(Point points[]){
        Double[] objs = new Double[points.length];
        for(int i=0; i<points.length; i++){
            objs[i] = points[i].distance(0, 0);
        }
        Comparable smallest = objs[0];
        for(int i=0; i<objs.length; i++){
            if(smallest.compareTo(objs[i]) > 0){
                smallest = objs[i];
            }
        }
        return smallest;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Minimum minimumTest = new Minimum();
        Integer[] integers = new Integer[5];
        integers[0] = 5;
        integers[1] = 10;
        integers[2] = 1;
        integers[3] = 26;
        integers[4] = 16;
        Object num = minimumTest.getMinimum(integers);
        System.out.println(num);
        
        String strings[] = {"This","cars","homework","integer","wow","mom"};
        Object minString = minimumTest.getMinimum(strings);
        System.out.println(minString);
        
        Point points[] = new Point[3];
        points[0] = new Point();
        points[0].x = 5;
        points[0].y = 6;
        points[1] = new Point();
        points[1].x = 7;
        points[1].y= 8;
        points[2] = new Point();
        points[2].x = 1;
        points[2].y = 1;
        Object minPoint = minimumTest.getMinimum(points);
        System.out.println(minPoint);
    }
    
}
