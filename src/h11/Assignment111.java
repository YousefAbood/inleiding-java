package h11;


import java.applet.Applet;
import java.awt.*;

public class Assignment111 extends Applet {

    int i, x1, y1, x2, y2;

    public void init() {

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Variables Initializaton
        x1 = 20;
        y1 = 20;
        x2 = 80;
        y2 = 80;
    }

    public void paint(Graphics g) {
        g.drawLine(20, 20, 80, 80);
    }
}
