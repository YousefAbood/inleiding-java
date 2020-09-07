package h04;

import java.applet.Applet;
import java.awt.*;

public class drawing extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.yellow);
        g.fillRect(20, 20, 100, 50);
        g.setColor(Color.black);
        g.drawRect(20, 20, 100, 50);
    }
}
