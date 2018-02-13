/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import java.awt.Color;

/**
 *
 * @author mathg8825
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
             City ovo = new City(); //create a city for the robot
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 3, 0, Direction.EAST);
        drake.setColor(Color.red); //make drake red
        
    }
}
