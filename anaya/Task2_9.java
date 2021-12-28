import kareltherobot.*;

public class Task2_9 implements Directions
{
    public static void main(String [] args)
    {
        World.reset();
        World.setDelay(10);
        World.setVisible(true);
        World.readWorld("Task2_9.kwld");
        UrRobot karel = new UrRobot(3,1,East,0);
        UrRobot carl = new UrRobot(1,1,East,0);
        karel.pickBeeper();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.putBeeper();
        karel.turnLeft();
        carl.pickBeeper();
        carl.move();
        carl.move();
        carl.putBeeper();
    }
}