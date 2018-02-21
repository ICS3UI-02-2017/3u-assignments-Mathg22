/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author mathg8825
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city for the robot
        City ovo = new City();
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 1, 1, Direction.EAST);
        drake.setColor(Color.red); //make drake red
        //inserting the 10 things in a row
        new Thing(ovo, 1, 2);
        new Thing(ovo, 1, 3);
        new Thing(ovo, 1, 4);
        new Thing(ovo, 1, 5);
        new Thing(ovo, 1, 6);
        new Thing(ovo, 1, 7);
        new Thing(ovo, 1, 8);
        new Thing(ovo, 1, 9);
        new Thing(ovo, 1, 10);
        new Thing(ovo, 1, 11);

        //as long as he has less than 7 things in his backpack he will move one and pick up one thing
        while (drake.countThingsInBackpack() < 7) {
            drake.move();
            drake.pickThing();
        }
        drake.move(4);//after picking up 7 things move forward 

    }
}
