package h05;

import java.applet.Applet;
import java.awt.*;

public class Assignment51 extends Applet {
    public void init () {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        resize(width, height);
    }

    public void paint(Graphics g) {
        // Variables

        // Variable for Colors
        Color CrimsonRed = new Color(153, 0, 0);

        // Variable for Line
        // Lxs is Line X-Axis Start, Lxe Line X-axis End
        int lxs = 20;
        int lxe = 160;

        // Variable for Rectangle
        int rw = 300;
        int rh = 150;

        // Variable for Oval
        int ow = 300;
        int oh = 150;

        // Variable for Circle
        int cw = 150;
        int ch = 150;

        // Drawing

        // Line
        g.drawLine(lxs, 20, lxe, 20);
        g.drawString("Lijn", 80, 40);

        // Rectangle
        g.drawRect(20, 80, rw, rh);
        g.drawString("Rechthoek", 100, 250);

        // Rectangle with round sides
        int aw = 100;
        int ah = aw;
        g.drawRoundRect(20, 275, rw, rh, aw, ah);
        g.drawString("Afgeronde Rechthoek", 100, 450);

        // Rectangle with an Oval inside
        g.setColor(CrimsonRed);
        g.fillRect(350, 80, rw, rh);
        g.setColor(Color.black);
        g.drawOval(350, 80, ow, oh);
        g.drawString("Gevulde rechthoek met ovaal", 450, 250);

        // Filled Oval
        g.setColor(CrimsonRed);
        g.fillOval(350, 275, ow, oh);
        g.setColor(Color.black);
        g.drawString("Gevulde Ovaal", 450, 450);

        // Oval with an ARC inside
        g.drawOval(680, 80, ow, oh);
        g.setColor(CrimsonRed);
        g.fillArc(680, 80, ow, oh, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 750, 250);

        // Normal Circle
        g.drawOval(750, 275, cw, ch);
        g.drawString("Cirkel", 800, 450);


    }

}


