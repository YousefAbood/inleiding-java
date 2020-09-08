package h04;


import java.applet.Applet;
import java.awt.*;

public class TrafficLight extends Applet {

    public void init () {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        resize(width, height);
    }

    public void paint (Graphics g) {
        // Sky Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);

        // The Pillar of the Traffic Light
        g.setColor(Color.darkGray);
        g.fillRect(625, 450, 100, 300);
        g.setColor(Color.black);
        g.drawRect(625, 450, 100, 300);

        // The Board of the traffic lights
        g.setColor(Color.lightGray);
        g.fillRoundRect(515, 75, 325, 500, 50, 50);
        g.setColor(Color.black);
        g.drawRoundRect(515, 75, 325, 500, 50, 50);

        // Traffic Lights
        int w = 150;
        int h = w;

        // Red
        int a = 600;
        int b = 90;
        Color Red = new Color(184, 29, 19);
        g.setColor(Red);
        g.fillOval(a, b, w, h);
        g.setColor(Color.black);
        g.drawOval(a, b, w, h);

        // Yellow
        int c = 600;
        int d = 250;
        Color Yellow = new Color(239, 183, 0);
        g.setColor(Yellow);
        g.fillOval(c, d, w, h);
        g.setColor(Color.black);
        g.drawOval(c, d, w, h);

        // Green
        int e = 600;
        int f = 410;
        Color Green = new Color(0, 132, 80);
        g.setColor(Green);
        g.fillOval(e, f, w, h);
        g.setColor(Color.black);
        g.drawOval(e, f, w, h);
    }

}
