import kareltherobot.*;

public class Tester implements Directions 
{
    public static void main(String [] args)
    {
        World.reset();
        World.setDelay(10);
        World.setVisible(true);
        World.readWorld("Tester.kwld");
        UrRobot karel = new UrRobot(1,2,East,0);
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.pickBeeper();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.pickBeeper();
        karel.turnOff();
    }
}
