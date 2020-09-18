package h11;

import java.applet.Applet;
import java.awt.*;

public class Assignment116 extends Applet {

    int x, y, i, widthCircle, heightCircle, changeinSize;

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
        widthCircle = 0;
        heightCircle = 0;
        changeinSize = 0;
    }

    public void paint(Graphics g) {
        // For Every Loop
        // Oval change in size by 20 width & height
        // If we change size of Oval without X, Y coordinates, It shifts!
        // So we change the coordinates of the beginning point of drawing the Oval.
        for (i = 0; i < 5; i++) {
            changeinSize += 20;
            x -= 10;
            y -= 10;
            g.drawOval(x, y, widthCircle+(changeinSize), heightCircle+(changeinSize));
        }
    }
}
