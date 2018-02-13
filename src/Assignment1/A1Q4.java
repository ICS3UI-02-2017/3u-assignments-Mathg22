/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/**
 *move drake and bruce to exchange locations while avoiding obstacles and arriving at almost the same time
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
        RobotSE drake = new RobotSE(ovo, 0, 0, Direction.SOUTH);
        drake.setColor(Color.red); //make drake red
        RobotSE bruce = new RobotSE(ovo, 0, 1, Direction.SOUTH);
        bruce.setColor(Color.blue);//make bruce blue
        new Wall(ovo, 0, 1, Direction.WEST);//insert walls
        new Wall(ovo, 1, 1, Direction.WEST);
        new Wall(ovo, 1, 1, Direction.SOUTH);
//move drake and bruce to exchange locations while avoiding obstacles
        drake.move(2);
        bruce.move();
        bruce.turnLeft();
        bruce.move();
        bruce.turnRight();
        bruce.move();
        drake.turnLeft();
        drake.move();
        bruce.turnRight();
        bruce.move();
        bruce.move();
        drake.move();
        bruce.turnRight();
        drake.turnLeft();
        bruce.move();
        drake.move();
        drake.turnLeft();
        drake.move();
        drake.turnRight();
        bruce.move();
        drake.move();
        
        
    }
}
