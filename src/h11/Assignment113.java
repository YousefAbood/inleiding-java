package h11;

import java.applet.Applet;
import java.awt.*;

public class Assignment113 extends Applet {

    int x, y, fibSeqOne, fibSeqTwo, input;
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
        fibSeqOne = 0;
        fibSeqTwo = 1;
    }

    public void paint(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 15));
        g.setColor(black);
        while (input < 10000) {
            x += 40;
            input = fibSeqOne + fibSeqTwo;
            fibSeqOne = fibSeqTwo;
            fibSeqTwo = input;
            g.drawString("" + input, x, y);
        }

    }
}
