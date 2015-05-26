/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package point;

/**
 *
 * @author Jason
 */
public class Circle extends Point{
    Circle(int x, int y, int r){
        super(x,y);
        radius = r;
    }
    int radius;
    public void printCoordinates(){
        System.out.println("Circle center is at (" + getX()+ "," + getY() + ") and radius is " + radius);
    }
}
