package com.company;

public class Main {

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        int differenceX = Math.abs(robot.getX() - toX);
        int differenceY = Math.abs(robot.getY() - toY);

        switch (robot.getDirection()) {
            case UP:
                if (toX < robot.getX()) {
                    robot.turnLeft();
                    move(robot, differenceX);
                } else {
                    robot.turnRight();
                    move(robot, differenceX);
                }
                break;
            case LEFT:
                if (toX < robot.getX()) {
                    move(robot, differenceX);
                } else {
                    robot.turnRight();
                    robot.turnRight();
                    move(robot, differenceX);
                }
                break;
            case RIGHT:
                if (toX < robot.getX()) {
                    robot.turnLeft();
                    robot.turnLeft();
                    move(robot, differenceX);
                } else {
                    move(robot, differenceX);
                }
                break;
            case DOWN:
                if (toX < robot.getX()) {
                    robot.turnRight();
                    move(robot, differenceX);
                } else {
                    robot.turnLeft();
                    move(robot, differenceX);
                }
        }

        switch (robot.getDirection()) {
            case LEFT:
                if (toY < robot.getY()) {
                    robot.turnLeft();
                    move(robot, differenceY);
                } else {
                    robot.turnRight();
                    move(robot, differenceY);
                }
                break;
            case UP:
                if (toY < robot.getY()) {
                    robot.turnLeft();
                    robot.turnLeft();
                    move(robot, differenceY);
                } else {
                    move(robot, differenceY);
                }
                break;
            case DOWN:
                if (toY < robot.getY()) {
                    move(robot, differenceY);
                } else {
                    robot.turnLeft();
                    robot.turnLeft();
                    move(robot, differenceY);
                }
                break;
            case RIGHT:
                if (toY < robot.getY()) {
                    robot.turnRight();
                    move(robot, differenceY);
                } else {
                    robot.turnLeft();
                    move(robot, differenceY);
                }
                break;
        }
    }

    public static void move(Robot robot, int difference) {
        for (int i = 0; i < difference; i++) {
            robot.stepForward();
        }
    }


}
