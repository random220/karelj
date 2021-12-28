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


3. Run the include sample program to see it in work 

    cd SIM

    # compile the program StairClimber.java and link it with
    # the simulation library KarelJRobot.jar

    javac -d . -cp .:KarelJRobot.jar StairClimber.java

    # That would produce the comiled file StairClimber.class
    # Now, run that program

    java -cp .:KarelJRobot.jar StairClimber





