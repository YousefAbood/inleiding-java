package h11;

import java.applet.Applet;
import java.awt.*;

public class Assignment112 extends Applet {

    int i, x, y, countdown;
    Color SkyColor = new Color(69, 182, 217);
    // Rainbow Colors
    Color rcZero = new Color(69, 110, 217);
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

        // Background Color
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);


        // X, Y coordinates
        i = 0;
        x = 40;
        y = 350;
        countdown = 21;
    }

    public void paint(Graphics g) {
        // if I could use an Array, This code would be ALOT shorter.
        g.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 30));
        while (i < 11) {
            i++;
            x += 80;
            countdown--;
            if (i == 1) {
                g.setColor(rcZero);
                g.drawString("" + countdown, x, y);
            }
            if (i == 2) {
                g.setColor(rcOne);
                g.drawString("" + countdown, x, y);
            }
            if (i == 3) {
                g.setColor(rcTwo);
                g.drawString("" + countdown, x, y);
            }
            if (i == 4) {
                g.setColor(rcThree);
                g.drawString("" + countdown, x, y);
            }
            if (i == 5) {
                g.setColor(rcFour);
                g.drawString("" + countdown, x, y);
            }
            if (i == 6) {
                g.setColor(rcFive);
                g.drawString("" + countdown, x, y);
            }
            if (i == 7) {
                g.setColor(rcSix);
                g.drawString("" + countdown, x, y);
            }
            if (i == 8) {
                g.setColor(rcSeven);
                g.drawString("" + countdown, x, y);
            }
            if (i == 9) {
                g.setColor(rcEight);
                g.drawString("" + countdown, x, y);
            }
            if (i == 10) {
                g.setColor(rcNine);
                g.drawString("" + countdown, x, y);
            }
            if (i == 11) {
                g.setColor(rcTen);
                g.drawString("" + countdown, x, y);
            }
        }
    }
}
