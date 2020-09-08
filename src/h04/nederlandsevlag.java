package h04;

import java.applet.Applet;
import java.awt.*;

public class nederlandsevlag extends Applet {

    public void init() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        resize(width, height);
    }

    public void paint(Graphics g) {

        // Sky Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);

        // Sun
        g.setColor(Color.yellow);
        g.fillOval(1100, 50, 200, 200);

        // Rood Stuk
        Color Red = new Color(174, 28, 40);
        g.setColor(Red);
        g.fillRect(150, 190, 600, 150);

        // Wit Stuk
        Color White = new Color(255, 255, 255);
        g.setColor(White);
        g.fillRect(150, 290, 600, 150);

        // Blue Stuk
        Color Blue = new Color(33, 70, 139);
        g.setColor(Blue);
        g.fillRect(150, 390, 600, 100);

        // VlaggenStok
        g.setColor(Color.black);
        g.fillRect(150, 190, 15, 500);
    }
}
