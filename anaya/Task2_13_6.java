import kareltherobot.*;

public class Task2_13_6 implements Directions
{
    public static void main(String [] args)
    {
        World.reset();
        World.setDelay(15);
        World.setVisible(true);
        World.readWorld("Task2_13_6.kwld");
        UrRobot karel = new UrRobot(1,2,East,1);
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putBeeper();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
    }
}