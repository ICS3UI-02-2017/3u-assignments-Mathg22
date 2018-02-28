/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author mathg8825
 */
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city for the robot
        City ovo = new City();
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 0, 0, Direction.EAST);
        drake.setColor(Color.red); //make drake red\

        new Wall(ovo, 0, 1, Direction.EAST);


    }
}
