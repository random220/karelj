import kareltherobot.*;

public class Task2_13_7 implements Directions
{
    public static void main(String [] args)
    {
        World.reset();
        World.setDelay(15);
        World.setVisible(true);
        World.readWorld("Task2_13_7.kwld");
        UrRobot karel = new UrRobot(5,7,East,0);
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.pickBeeper();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickBeeper();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.pickBeeper();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickBeeper();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
    }
}