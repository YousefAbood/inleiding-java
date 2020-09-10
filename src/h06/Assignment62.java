package h06;

import java.applet.Applet;
import java.awt.*;

public class Assignment62 extends Applet {
    int secinhour;
    int secinday;
    int secinyear;

    public void init () {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Variables
        int secinmin = 60;
        int mininhour = 60;
        int hourinday = 24;
        int dayinyear = 365;

        // Equation
        secinhour = secinmin * mininhour;
        secinday = secinhour * hourinday;
        secinyear = secinday * dayinyear;
        System.out.println("Seconds in an hour, " + secinhour);
        System.out.println("Seconds in an day, " + secinday);
        System.out.println("Seconds in an year, " + secinyear);
    }

    public void paint(Graphics g) {
        // Colors
        Color Red = new Color(174, 28, 40, 244);
        Color White = new Color(255, 255, 255);
        Color Blue = new Color(33, 70, 139);

        setBackground(Color.darkGray);
        g.setFont(new Font("TimesRoman", Font.BOLD , 20));

        g.setColor(Red);
        g.drawString("Seconds in an hour, " + secinhour, 50, 50);

        g.setColor(White);
        g.drawString("Seconds in an day, " + secinday, 100, 100);

        g.setColor(Blue);
        g.drawString("Seconds in an year, " + secinyear, 150, 150);

    }

}
