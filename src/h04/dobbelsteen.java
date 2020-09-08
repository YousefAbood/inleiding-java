package h04;

import java.applet.Applet;
import java.awt.*;

public class dobbelsteen extends Applet {

    public void init () {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        resize(width, height);
    }

    public void paint(Graphics g) {

        // Sky Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);

        // Face of the Dice
        int x = 500;
        int y = 150;
        int w = 400;
        int h = 400;
        g.setColor(Color.white);
        g.fillRoundRect(x, y, w, h, 100, 100);
        g.setColor(Color.black);
        g.drawRoundRect(x, y, w, h, 100, 100);

        // Circles in the dice
        int cx = 525;
        int cy = 175;
        int cw = 150;
        int ch = cw;
        g.fillOval(cx, cy, cw, ch);
        g.fillOval(cx+200, cy, cw, ch);
        g.fillOval(cx, cy+200, cw, ch);
        g.fillOval(cx+200, cy+200, cw, ch);
    }

}
