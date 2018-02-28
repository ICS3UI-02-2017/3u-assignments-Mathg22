/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import java.awt.Color;

/**
 *
 * @author mathg8825
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city for the robot
        City ovo = new City();
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 1, 1, Direction.SOUTH);
        drake.setColor(Color.red); //make drake red
        // counted while loop
        int numberOfMoves = 5;
        while (numberOfMoves > 0) {
            drake.move();
            numberOfMoves = numberOfMoves - 1;

        }
        drake.turnAround();

        //counting the other way
        numberOfMoves = 0;
        while (numberOfMoves < 5) {
            drake.move();
            numberOfMoves = numberOfMoves + 1;
        }

        drake.turnAround();
        // use a for loop to move
        for (int count = 0; count < 5; count++);
        drake.move();

        int x = 10;
        x = x + 5;//adds 5
        x += 5;//adds 5
        x -= 5; //subtract 5
        x *= 2; //multply by 2
        x /= 2; //divide by 2

        //modulus or modulo
        int remainder = 5 % 2;
        int quotient = 5 / 2;

        if (drake.frontIsClear()) {
            if (drake.canPickThing()) {
                drake.move();
            }
        }
        if (drake.frontIsClear() && drake.canPickThing()) {
        }
        if (drake.frontIsClear() || drake.canPickThing()) {
        }

        for (int i = 0; i < 10; i++) {
        }

    }
}
