package h12;

import java.applet.Applet;
import java.awt.*;

public class Assignment121 extends Applet {

    int[] numbers;

    public void init() {

        // Background Color
        Color SkyColor = new Color(69, 182, 219);
        setBackground(SkyColor);

        // Dimension
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screensize.width;
        int height = screensize.height;
        resize(width, height);

        // Variable
        numbers[0] = 24;


    }

    public void paint(Graphics g) {

    }


}
