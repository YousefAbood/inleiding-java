package h04;

import java.applet.Applet;
import java.awt.*;

public class Ellips extends Applet {

    public void init () {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        resize(width, height);
    }

    public void paint (Graphics g) {
        // Background Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);

        // Drawing an Arc
        g.setColor(Color.yellow);
        g.fillArc(500, 100, 600, 400, 0, 360);
        g.setColor(Color.black);
        g.drawArc(500, 100, 600, 400, 0, 360);

    }
}
