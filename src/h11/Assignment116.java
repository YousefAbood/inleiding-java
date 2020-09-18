package h11;

import java.applet.Applet;
import java.awt.*;

public class Assignment116 extends Applet {

    int x, y, widthCircle, heightCircle;

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
        x = 650;
        y = 350;
        widthCircle = 20;
        heightCircle = 20;
    }

    public void paint(Graphics g) {
        g.drawOval(x, y, widthCircle, heightCircle);
    }
}
