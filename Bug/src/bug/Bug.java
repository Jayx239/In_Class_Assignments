/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bug;

/**
 *
 * @author Jason
 */
public class Bug {
    // Bug Default Constructor
    Bug(){
        Position = 0;       // Default position of 0
        Direction = 1;      // Default direction of 1 (right)
    }
    // Bug Constructor with position parameter
    Bug(int position){
        Position = position;    // Set Position
        Direction = 1;          // Default direction of 1 (right)
    }
    
    //Instance Variables
    int Position;   // Position value
    int Direction;  // 1 = right 0 = left
    // Turn Method
    public void turn(){
        if(Direction == 1){
            Direction = 0;  // Chamge direction to left
        }
        else if (Direction == 0){
            Direction = 1;          // Change direction to right
        }
    }
    // Move Method
    public void move(){
        if(Direction == 1){
            Position+=1;    // Move right
        }
        else{
            Position-=1;    // Move left
        }
    }
    // Get Position Method
    public int getPosition(){
        return Position;        // Return bug position
    }
   /**
     * @param args the command line arguments
     */
}
