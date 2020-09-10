package h06;

import java.applet.Applet;
import java.awt.*;

public class Assignment63 extends Applet {

    int output;

    public void init() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Variables

        int numOne = 2147483647;
        int numTwo = 1;
        output = numOne + numTwo;
        System.out.println(output);
    }

    public void paint (Graphics g) {
        setBackground(Color.lightGray);
        g.setFont(new Font("TimesRoman", Font.BOLD, 20));
        g.setColor(Color.red);
        g.drawString("Maximum Number that INT can log is 2147483647, if we add 1 it causes an Overflow!", 50, 50);
        g.setColor(Color.black);
        g.drawString("Negative number " + output, 100, 100 );
    }
}
