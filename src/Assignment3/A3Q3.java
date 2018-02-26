/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import java.awt.Color;

/**
 *
 * @author mathg8825
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City ovo = new City();
        //put a robot in my city and give it 20 things
        RobotSE drake = new RobotSE(ovo, 1, 1, Direction.EAST, 20);
        drake.setColor(Color.red); //make drake red
        int x = 0;
        while (x < 5) {
            drake.putThing();
            drake.move();
            x++;
        }
        drake.turnRight();
        drake.move();
        drake.turnRight();
        drake.move();
        while (x < 10) {
            drake.putThing();
            drake.move();
            x++;
        }
    }
}
