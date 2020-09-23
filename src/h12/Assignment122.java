package h12;

import java.applet.Applet;
import java.awt.*;

public class Assignment122 extends Applet {

    int i;
    Button[] buttons = new Button[25];

    public void init() {
        // Background Color
        Color SkyColor = new Color(69, 181, 200);
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Add
        for (i = 0; i < 25; i++) {
            buttons[i] = new Button("B" + i);
            add(buttons[i]);
        }

    }

}


