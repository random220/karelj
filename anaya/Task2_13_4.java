import kareltherobot.*;

public class Task2_13_4 implements Directions
{
    public static void main(String [] args)
    {
        World.reset();
        World.setDelay(15);
        World.setVisible(true);
        World.readWorld("Task2_13_4.kwld");
        UrRobot karel = new UrRobot(5,4, East,0);
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
    }
}