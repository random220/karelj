import kareltherobot.*;

public class Task2_13_5 implements Directions
{
    public static void main(String [] args)
{
    World.reset();
    World.setDelay(15);
    World.setVisible(true);
    World.readWorld("Task2_13_5.kwld");
    UrRobot karel = new UrRobot(3,4,West,0);
    karel.turnLeft(); 
    karel.turnLeft(); 
    karel.turnLeft(); 
    karel.move();
    karel.move();
    karel.turnLeft();
    karel.move();
    karel.move();
    karel.turnLeft(); 
    karel.move();
    karel.move();
    karel.turnLeft();
    karel.move();
    karel.pickBeeper();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
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
    karel.move();
    karel.move();
    karel.turnLeft(); 
    karel.turnLeft(); 
    karel.turnLeft(); 
}
}