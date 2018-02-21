/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
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
        RobotSE drake = new RobotSE(ovo, 0, 1, Direction.WEST);
        drake.setColor(Color.red); //make drake red
        //make a robot called bruce
        RobotSE bruce = new RobotSE(ovo, 3, 3, Direction.EAST);
        bruce.setColor(Color.blue);//make bruce blue
        new Wall(ovo, 3, 3, Direction.SOUTH); //Inserting walls
        new Wall(ovo, 3, 3, Direction.EAST);
        new Wall(ovo, 2, 3, Direction.NORTH);
        new Wall(ovo, 2, 3, Direction.EAST);
        new Wall(ovo, 2, 3, Direction.WEST);
        drake.setLabel("O"); //set label O to drake
        bruce.setLabel("B"); //set label B to bruce
        new Thing(ovo, 0, 0); //Inserting  things
        new Thing(ovo, 1, 0);
        new Thing(ovo, 1, 1);
        new Thing(ovo, 1, 2);
        new Thing(ovo, 2, 2);

        drake.move();
        bruce.turnAround();
        drake.turnLeft();
        bruce.move();
        drake.pickThing();
        drake.move();
        drake.turnLeft();
        bruce.turnRight();
        drake.pickThing();
        bruce.move();
        bruce.pickThing();
        drake.move();
        bruce.move();
        drake.pickThing();
        bruce.pickThing();
        bruce.turnLeft();


    }
}
