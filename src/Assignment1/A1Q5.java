/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import java.awt.Color;

/**
 *
 * @author mathg8825
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          City ovo = new City(); //create a city for the robot
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 0, 1, Direction.SOUTH);
        drake.setColor(Color.red); //make drake red
        
        RobotSE bruce = new RobotSE(ovo, 3, 3, Direction.SOUTH);
        bruce.setColor(Color.blue);//make bruce blue
        
        new Thing(ovo, 0, 0);
        new Thing(ovo, 1, 0);
        new Thing(ovo, 1, 1);
        new Thing(ovo, 1, 2);
        new Thing(ovo, 2, 2);
        
        
    }
}
