/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author lamon
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall1.txt");
        Robot karel = new Robot(kw, 1, 1, Direction.WEST);

        while (karel.getAvenue() == 1) { //while karl is in avenue 1
            if (karel.frontIsClear()) {  //stops the loop if there is a break
                break;
            } else {                     //finds next wall
                karel.turnLeft();       
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
        }
    }
}
