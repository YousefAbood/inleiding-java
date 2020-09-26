package h13;

import java.applet.Applet;
import java.awt.*;

public class Assignment133 extends Applet {

    int i, v, x, y, w, h, cw, ch, rows;
    Color brickRed = new Color(139, 0, 0);
    Color concreteGray = new Color(102, 102, 102);

    public void init() {
        // Variables
        x = -150;
        y = 0;
        w = 150;
        h = 100;
        cw = 200;
        ch = 150;
    }

    public void paint(Graphics g) {
        drawGreyBricks(g);
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

    void drawGreyBricks(Graphics g) {
        for (v = 0; v < 200; v++) {
            rows++;
            x += 150;
            g.setColor(concreteGray);
            g.fillRect(x, y, cw, ch);
            g.setColor(Color.black);
            g.drawRect(x, y, cw, ch);
            if (rows%9 == 0) {
                x = -150;
                y += 100;
            }
        }
    }
}
