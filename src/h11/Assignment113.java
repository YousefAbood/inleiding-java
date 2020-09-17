package h11;

import java.applet.Applet;
import java.awt.*;

public class Assignment113 extends Applet {

    int i, x, y, fibSeq;

    public void init() {

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Background Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);

        // Variables
        i = 0;
        x = 40;
        y = 350;
        fibSeq = 0;
    }

    public void paint(Graphics g) {

    }
}
