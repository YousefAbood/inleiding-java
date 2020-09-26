package h13;

import java.applet.Applet;
import java.awt.*;

public class Assignment134 extends Applet {

    int x, y, w ,h;
    Color trunkBrown = new Color(139,69,19);
    Color leavesGreen = new Color(30, 147, 45);

    public void init() {

        // BackGround Color
        Color SkyColor = new Color(69, 182, 180);
        setBackground(SkyColor);

        // Variables
        x = 525;
        y = 500;
        w = 150;
        h = 400;
    }

    public void paint(Graphics g) {
        drawTree(g);
    }

    void drawTree(Graphics g) {
        int[] a = {475, 725, 600};
        int[] b = {525, 525, 425};

        int[] c = {475, 725, 600};
        int[] d = {475, 475, 325};

        int[] e = {475, 725, 600};
        int[] f = {425, 425, 225};

        int[] j = {475, 725, 600};
        int[] z = {375, 375, 175};

        // Trunk
        g.setColor(trunkBrown);
        g.fillRect(x, y, w, h);

        // Leaves
        g.setColor(leavesGreen);
        g.fillPolygon(a, b, 3);
        g.setColor(leavesGreen);
        g.fillPolygon(c, d, 3);
        g.setColor(leavesGreen);
        g.fillPolygon(e, f, 3);
        g.setColor(leavesGreen);
        g.fillPolygon(j, z, 3);
    }
}
