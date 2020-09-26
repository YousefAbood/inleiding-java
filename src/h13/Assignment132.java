package h13;

import java.applet.Applet;
import java.awt.*;

public class Assignment132 extends Applet {

    int i, v, x, y, w, h, rows;
    Color brickRed = new Color(139, 0, 0);

    public void init() {
        // Variables
        x = -150;
        y = 0;
        w = 150;
        h = 100;
    }

    public void paint(Graphics g) {
        drawRedBricks(g);
    }

    void drawRedBricks(Graphics g) {
        for (i = 0; i < 200; i++) {
            rows++;
            x += 150;
            g.setColor(brickRed);
            g.fillRect(x, y, w, h);
            g.setColor(Color.black);
            g.drawRect(x, y, w, h);
            if (rows%9 == 0) {
                x = -150;
                y += 100;
            }
        }
    }
}
