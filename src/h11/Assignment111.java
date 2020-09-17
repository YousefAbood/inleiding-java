package h11;


import java.applet.Applet;
import java.awt.*;

public class Assignment111 extends Applet {

    int i, x1, y1, x2, y2;

    public void init() {

        // Background Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);


        // Variables Initializaton
        x1 = 40;
        y1 = 50;
        x2 = 40;
        y2 = 600;
    }

    public void paint(Graphics g) {
        // While Loop, Reaches 10. Cuts Off!
        while (i < 10) {
            x1 += 40;
            x2 += 40;
            g.drawLine(x1, y1, x2, y2);
            i++;
        }
    }
}
