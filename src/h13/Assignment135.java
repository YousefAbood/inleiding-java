package h13;

import java.applet.Applet;
import java.awt.*;

public class Assignment135 extends Applet {
    int x, y, w ,h, lx, ly, lw, lh;
    Color trunkBrown = new Color(139,69,19);
    Color leavesGreen = new Color(30, 147, 45);

    public void init() {

        // BackGround Color
        Color SkyColor = new Color(69, 182, 180);
        setBackground(SkyColor);

        // Variables

        // Trunk Variables
        x = 75;
        y = 250;
        w = 75;
        h = 125;

        // Leaves Variables
        lx = 50;
        ly = 50;
        lw = 125;
        lh = 200;
    }

    public void paint(Graphics g) {
        drawTree(g);
    }

    void drawTree(Graphics g) {


        // Trunk
        g.setColor(trunkBrown);
        g.fillRect(x, y, w, h);

        // Leaves
        g.setColor(leavesGreen);
        g.fillRect(lx, ly, lw, lh);

    }
}
