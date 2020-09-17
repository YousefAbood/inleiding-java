package h11;

import java.applet.Applet;
import java.awt.*;

public class Assignment112 extends Applet {

    int i, x, y;
    Color SkyColor = new Color(69, 182, 217);
    // Rainbow Colors
    Color rcOne = new Color(255, 0, 0);
    Color rcTwo = new Color(255, 165, 0);
    Color rcThree = new Color(255, 255, 0);
    Color rcFour = new Color(0, 128, 0);
    Color rcFive = new Color(85, 150, 230);
    Color rcSix = new Color(101, 75, 204);
    Color rcSeven = new Color(217, 218, 197);
    Color rcEight = new Color(9, 31, 44);
    Color rcNine = new Color(227, 37, 91);
    Color rcTen = new Color(38, 107, 223);

    public void init() {

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Background COlor
        setBackground(SkyColor);
    }

    public void paint(Graphics g) {

    }
}
