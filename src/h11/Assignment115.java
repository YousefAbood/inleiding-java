package h11;

import java.applet.Applet;
import java.awt.*;

public class Assignment115 extends Applet {

    int widthSquare, heightSquare, x, y, i;

    public void init() {

        // Background Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Variables
        widthSquare = 50;
        heightSquare = 50;
        x = 50;
        y = 50;
    }

    public void paint(Graphics g) {
        g.drawRect(x, y, widthSquare, heightSquare);

    }
}
