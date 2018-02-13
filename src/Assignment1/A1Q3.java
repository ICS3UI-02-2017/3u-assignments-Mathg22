/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           City ovo = new City(); //create a city for the robot
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 3, 0, Direction.EAST); 
  drake.setColor(Color.red); //make drake red
  new Wall(ovo, 3, 2, Direction.WEST); //insert a wall
  new Wall(ovo, 3, 2, Direction.NORTH); //insert a wall
  new Wall(ovo, 2, 3, Direction.WEST); //insert a wall
  new Wall(ovo, 1, 3, Direction.WEST); //insert a wall
  new Wall(ovo, 1, 3, Direction.NORTH); //insert a wall
  new Wall(ovo, 1, 3, Direction.EAST); //insert a wall
  new Wall(ovo, 2, 4, Direction.NORTH); //insert a wall
  new Wall(ovo, 2, 4, Direction.EAST); //insert a wall
  new Wall(ovo, 3, 4, Direction.EAST); //insert a wall
  new Thing(ovo, 3, 1);//insert a thing
  //drake picks thign up and moves up the left side of the mountain to the top
  drake.move();
  drake.pickThing();
  drake.turnLeft();
  drake.move();
  drake.turnRight();
  drake.move();
  drake.turnLeft();
  drake.move(2);
  drake.turnRight();
  drake.move();
  //drake puts thing at the top of the mountain and descends across the right side of the mountain
  drake.putThing();
  drake.move();
  drake.turnRight();
  drake.move();
  drake.turnLeft();
  drake.move();
  drake.turnRight();
  drake.move(2);
  drake.turnLeft();
  
  
  
  
  
    }
}
