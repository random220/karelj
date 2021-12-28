import kareltherobot.*;

public class Task2_13 implements Directions
{
    public static void main(String[] args)
    {
        World.reset();
        World.setDelay(30);
        World.setVisible(true);
        World.readWorld("Task2_13.kwld");
        UrRobot karel = new UrRobot(2,7,West,0);
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.pickBeeper();
        karel.turnOff();
    }
}