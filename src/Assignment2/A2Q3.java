/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import java.awt.Color;

/**
 *
 * @author mathg8825
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //create a city for the robot
        City ovo = new City();
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 9, 6, Direction.SOUTH);
        drake.setColor(Color.red); //make drake red
        //figure out where you are
        //turn around to face west 
     while(drake.getDirection()!=Direction.WEST){
        drake.turnLeft();
     }
     //keep moving until reaching Avenue 0
        while(drake.getAvenue()!=0){
            
            drake.move();
        
    }
        //turn to face north
        while(drake.getDirection()!=Direction.NORTH){
            drake.turnRight();
            
        }
        //keep moving until reaching street 0
        while(drake.getStreet()!=0){
        
        drake.move();
        }
        }
}
