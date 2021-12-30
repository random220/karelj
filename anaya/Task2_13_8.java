import kareltherobot.*;

public class Task2_13_8 implements Directions
{
    public static void main(String [] args)
    {
        World.reset();
        World.setDelay(15);
        World.setVisible(true);
        World.readWorld("Task2_13_8.kwld");
        UrRobot karel = new UrRobot(4,3,East,0);
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.pickBeeper();
        karel.move();
        karel.pickBeeper();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.pickBeeper();
        karel.move();
        karel.pickBeeper();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.putBeeper();
        karel.move();
        karel.putBeeper();
        karel.move();
        karel.move();
        karel.putBeeper();
        karel.move();
        karel.putBeeper();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
    }
}