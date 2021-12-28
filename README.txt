1. Install java compiler and runtime

    % cd ~/Downloads
    % curl -O https://download.oracle.com/java/17/latest/jdk-17_macos-aarch64_bin.tar.gz

    # Extract the downloaded java compiler and related files
    % cd ~/
    % tar xf ~/Downloads/jdk-17_macos-aarch64_bin.tar.gz

    # You just extracted the gzipped files
    # Now find out where the java compiler is

    % find `pwd` -name javac
    /Users/harker/jdk-17.0.1.jdk/Contents/Home/bin/javac

    # Edit your ~/.bashrc file and add these two files to the end if it
    export JAVA_HOME=~/jdk-17.0.1.jdk/Contents/Home
    export PATH=/usr/sbin:/usr/bin:/sbin:/bin:/opt/homebrew/bin:$JAVA_HOME/bin


2. Install Karel J Robot simulator

    Download simulator from this page https://csis.pace.edu/~bergin/KarelJava2ed/downloads.html
    [Just go to the bottom of the page and hit "Get the Zip" button]

    Or,
    
    Just download it from here:
    https://github.com/random220/karelj/raw/master/KJRDistribution160819.zip

    Or,

    You don't even have to do it. I already downloaded and extracted the zip file
    in the SIM directory

    There is only one file that is of interest to us presently
    SIM/KarelJRobot.jar

    That file is the simulator library. It knows how to draw the robot on the
    screen and how to make it do stuff. In our code, later, we will teach it to
    do new stuff and also ask it to do stuff it already knows how to do.


3. Create your first test program

   cd anaya
   #create a file Tester.java here. Give it this content

//------------------------------------------------
import kareltherobot.*;

public class Tester implements Directions {
    public static void main(String [] args)
    {
        World.setVisible(true);
        UrRobot karel = new UrRobot(3, 3, East, 3);
        UrRobot steve = new UrRobot(3, 4, West, 3);
    }
}
//------------------------------------------------

    # Now run this code
    java -classpath ../SIM/KarelJRobot.jar Tester.java

    It simply delivers two robots facing each other at 3,3 and 3,4



