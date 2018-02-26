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
        RobotSE drake = new RobotSE(ovo, 0, 3, Direction.WEST);
        drake.setColor(Color.red); //make drake red
        //make the square
        new Wall(ovo, 1, 1, Direction.NORTH);
        new Wall(ovo, 1, 2, Direction.NORTH);
        new Wall(ovo, 1, 1, Direction.WEST);
        new Wall(ovo, 2, 1, Direction.WEST);
        new Wall(ovo, 1, 2, Direction.EAST);
        new Wall(ovo, 2, 2, Direction.EAST);
        new Wall(ovo, 2, 1, Direction.SOUTH);
        new Wall(ovo, 2, 2, Direction.SOUTH);
        //set a value to x
        int x = 0;
    
     /*when x is less than two move around the square. After one whole roation
        around the square the variable x is increased by one that way it only 
        moves around the square 2 times.*/
        while(x < 2){
            drake.move(3);
        drake.turnLeft();
        drake.move(3);
        drake.turnLeft();
        drake.move(3);
        drake.turnLeft();
        drake.move(3);
        drake.turnLeft();
        x++;
    }
    }
}
