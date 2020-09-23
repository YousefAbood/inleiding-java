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

        // Buttons
        buttons[0] = new Button("B1");
        buttons[1] = new Button("B2");
        buttons[2] = new Button("B3");
        buttons[3] = new Button("B4");
        buttons[4] = new Button("B5");
        buttons[5] = new Button("B6");
        buttons[6] = new Button("B7");
        buttons[7] = new Button("B8");
        buttons[8] = new Button("B18");
        buttons[9] = new Button("B19");
        buttons[10] = new Button("B10");
        buttons[11] = new Button("B11");
        buttons[12] = new Button("B12");
        buttons[13] = new Button("B13");
        buttons[14] = new Button("B14");
        buttons[15] = new Button("B15");
        buttons[16] = new Button("B16");
        buttons[17] = new Button("B17");
        buttons[18] = new Button("B18");
        buttons[19] = new Button("B19");
        buttons[20] = new Button("B20");
        buttons[21] = new Button("B21");
        buttons[22] = new Button("B22");
        buttons[23] = new Button("B23");
        buttons[24] = new Button("B24");
        buttons[25] = new Button("B25");


        }

    }


