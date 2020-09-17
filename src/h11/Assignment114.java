package h11;

import java.applet.Applet;
import java.awt.*;


public class Assignment114 extends Applet {

    int x, y, addition, number, output;
    Color black = new Color(9, 31, 44);

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
        x = 40;
        y = 350;
        addition = 0;
        number = 3;
    }

    public void paint(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 15));
        g.setColor(black);
        while (output < 100) {
            x += 40;
            output = addition + number;
            addition = output;
            g.drawString("" + output, x, y);
        }
    }
}
