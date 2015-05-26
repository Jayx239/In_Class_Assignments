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
public class Point implements Movable {
    Point(int x, int y){
        X = x;
        Y = y;
    }
    private int X;
    private int Y;
    
    public int getX(){
        return X;
    }
    public int getY(){
        return Y;
    }
    public void printCoordinates(){
        System.out.println("Point is at (" + X + "," + Y + ")");
    }
    public void move(int x, int y){
        X += x;
        Y += y;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("2D");
        Point TwoD = new Point(5,3);
        System.out.println("X: " + TwoD.getX());
        System.out.println("Y: " + TwoD.getY());
        //System.out.println(TwoD.getY());
        
        System.out.println("\n3D");
        TwoD.printCoordinates();
        Point3D ThreeD = new Point3D(7,4,9);
        System.out.println("X: " + ThreeD.getX());
        System.out.println("Y: " + ThreeD.getY());
        System.out.println("Z: " + ThreeD.getZ());
        ThreeD.printCoordinates();
        // ----------------------------- Problem 3 -------------------------------
        System.out.println("\n\n\n------------------------------------------------------------------------------------\n------------------------------------- Problem 3 ------------------------------------\n");
        Point p = new Point( 2, 3 );
        p.printCoordinates();
        p.move( 4, 5 );
        p.printCoordinates();
        Circle c = new Circle( 3, 4, 2 );
        c.printCoordinates();
        c.move( 2, 5 );
        c.printCoordinates();
    }
    
}
