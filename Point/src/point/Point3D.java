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
public class Point3D extends Point {
    Point3D(int x, int y, int z){
        super(x,y);
        Z = z;
    }
    private int Z;
    
    public int getZ(){
        return Z;
    }
    public void printCoordinates(){
        System.out.println("Point is at (" + getX()+ "," + getY() + "," + Z + ")");
    }
}
