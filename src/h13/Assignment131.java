package h13;

import java.applet.Applet;
import java.awt.*;

public class Assignment131 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        draw(g, 300, 300, 600, 600, 450, 450);
    }

    void draw(Graphics g, int x1, int x2, int x3, int y1, int y2, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }
}
