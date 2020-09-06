package h02;

import java.applet.Applet;
import java.awt.*;

public class Assignment22 extends Applet {

    public void init () {
        setBackground(Color.white);
    }

    public void paint (Graphics g) {
        g.setColor (Color.blue);
        g.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        g.drawString("Yousef", 50, 60);
        g.setColor(Color.red);
        g.drawString("Abood", 50, 100);
    }

}
