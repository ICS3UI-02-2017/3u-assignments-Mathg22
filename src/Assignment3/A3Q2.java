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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city for the robot
        City ovo = new City();
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 2, 2, Direction.EAST);
        drake.setColor(Color.red); //make drake red
        //show how many things are there
        ovo.showThingCounts(true);
        //10 things inserted
        new Thing(ovo, 2, 2);
        new Thing(ovo, 2, 2);
        new Thing(ovo, 2, 2);
        new Thing(ovo, 2, 2);
        new Thing(ovo, 2, 2);
        new Thing(ovo, 2, 2);
        new Thing(ovo, 2, 2);
        new Thing(ovo, 2, 2);
        new Thing(ovo, 2, 2);
        new Thing(ovo, 2, 2);
// set variable x to a value of 0
        int x = 0;

        /*drake will pick up one thing then move and put 1 thing as long 
         as x is less than 10 and everytime it does that it increases x by one 
         so it puts all 10 things to the right pile.
         */
        while (x < 10) {
            drake.pickThing();
            drake.move(2);
            drake.putThing();
            drake.turnAround();
            drake.move(2);
            drake.turnAround();
            x++;
        }
        //be on top of the new pile
        drake.move(2);
    }
}
