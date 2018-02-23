/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author mathg8825
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           //create a city for the robot
        City ovo = new City();
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 0, 2, Direction.WEST);
        drake.setColor(Color.red); //make drake red
        
        new Wall(ovo, 1, 1, Direction.NORTH);
        new Wall(ovo, 1, 2, Direction.NORTH);
        new Wall(ovo, 1, 1, Direction.WEST);
        new Wall(ovo, 2, 1, Direction.WEST);
        new Wall(ovo, 1, 2, Direction.EAST);
        new Wall(ovo, 2, 2, Direction.EAST);
        new Wall(ovo, 2, 1, Direction.SOUTH);
        new Wall(ovo, 2, 2, Direction.SOUTH);
        
        
    }
}
