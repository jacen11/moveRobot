package com.company;

import org.junit.Test;
import com.company.Main.*;

import static com.company.Main.moveRobot;
import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void TestX() {
        Robot robot1 = new Robot(0, 0, Direction.LEFT);
        Robot robot2 = new Robot(0, 0, Direction.UP);
        Robot robot3 = new Robot(0, 0, Direction.RIGHT);
        Robot robot4 = new Robot(0, 0, Direction.DOWN);

        moveRobot(robot1, -20, 0);
        moveRobot(robot2, -20, 0);
        moveRobot(robot3, -20, 0);
        moveRobot(robot4, -20, 0);

        assertEquals("ошибка", -20, robot1.getX());
        assertEquals("ошибка", -20, robot2.getX());
        assertEquals("ошибка", -20, robot3.getX());
        assertEquals("ошибка", -20, robot4.getX());



        Robot robot5 = new Robot(-10, 0, Direction.LEFT);
        Robot robot6 = new Robot(-10, 0, Direction.UP);
        Robot robot7 = new Robot(-10, 0, Direction.RIGHT);
        Robot robot8 = new Robot(-10, 0, Direction.DOWN);

        moveRobot(robot5, -20, 0);
        moveRobot(robot6, -20, 0);
        moveRobot(robot7, -20, 0);
        moveRobot(robot8, -20, 0);

        assertEquals("ошибка", -20, robot5.getX());
        assertEquals("ошибка", -20, robot6.getX());
        assertEquals("ошибка", -20, robot7.getX());
        assertEquals("ошибка", -20, robot8.getX());


        Robot robot9 = new Robot(10, 0, Direction.LEFT);
        Robot robot10 = new Robot(10, 0, Direction.UP);
        Robot robot11 = new Robot(10, 0, Direction.RIGHT);
        Robot robot12 = new Robot(10, 0, Direction.DOWN);

        moveRobot(robot9 , -20, 0);
        moveRobot(robot10, -20, 0);
        moveRobot(robot11, -20, 0);
        moveRobot(robot12, -20, 0);

        assertEquals("ошибка", -20, robot9 .getX());
        assertEquals("ошибка", -20, robot10.getX());
        assertEquals("ошибка", -20, robot11.getX());
        assertEquals("ошибка", -20, robot12.getX());


    }

    @Test
    public void TestY() {
        Robot robot1 = new Robot(0, 0, Direction.LEFT);
        Robot robot2 = new Robot(0, 0, Direction.UP);
        Robot robot3 = new Robot(0, 0, Direction.RIGHT);
        Robot robot4 = new Robot(0, 0, Direction.DOWN);

        moveRobot(robot1, 0, -20);
        moveRobot(robot2, 0, -20);
        moveRobot(robot3, 0, -20);
        moveRobot(robot4, 0, -20);

        assertEquals("ошибка", -20, robot1.getY());
        assertEquals("ошибка", -20, robot2.getY());
        assertEquals("ошибка", -20, robot3.getY());
        assertEquals("ошибка", -20, robot4.getY());


        Robot robot5 = new Robot(0, 10, Direction.LEFT);
        Robot robot6 = new Robot(0, 10, Direction.UP);
        Robot robot7 = new Robot(0, 10, Direction.RIGHT);
        Robot robot8 = new Robot(0, 10, Direction.DOWN);

        moveRobot(robot5, 0, -20);
        moveRobot(robot6, 0, -20);
        moveRobot(robot7, 0, -20);
        moveRobot(robot8, 0, -20);

        assertEquals("ошибка", -20, robot5.getY());
        assertEquals("ошибка", -20, robot6.getY());
        assertEquals("ошибка", -20, robot7.getY());
        assertEquals("ошибка", -20, robot8.getY());
    }


}
