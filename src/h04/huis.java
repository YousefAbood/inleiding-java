package h04;

import java.applet.Applet;
import java.awt.*;

public class huis extends Applet {

    public void init() {

    }
// Belangrijk Note, Maximize the Applet!
    public void paint(Graphics g) {
        // Sky Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);
        // Street
        g.setColor(Color.black);
        g.fillRect(0, 500, 1800, 300);
        // Yellow Marks on the Street
        g.setColor(Color.yellow);
        g.fillRect(100, 575, 200, 25);
        g.fillRect(350, 575, 200, 25);
        g.fillRect(600, 575, 200, 25);
        g.fillRect(850, 575, 200, 25);
        g.fillRect(1100, 575, 200, 25);
        // House
        Color BrickBrown = new Color(193, 106, 12);
        g.setColor(BrickBrown);
        g.fillRect(50, 205, 250, 200);
        // Pavement
        g.setColor(Color.lightGray);
        g.fillRect(0, 495, 1800, 15);
        g.fillRect(0, 660, 1800, 600);
    }

}
