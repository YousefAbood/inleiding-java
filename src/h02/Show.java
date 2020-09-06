package h02;

// import the necessary classes from the Java library
import java.awt. *;
import java.applet. *;

// a class called Show of type Applet
public class Show extends Applet {

    // an (empty) method that initializes the Applet
    public void init () {

    }
    // a method that draws the contents of the screen
    public void paint (Graphics g) {
        g.drawString ("Welcome to Java !!", 50, 60);
    }

}