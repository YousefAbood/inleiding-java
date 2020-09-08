package h04;

import java.applet.Applet;
import java.awt.*;

public class gewichten extends Applet {

    public void init(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        resize(width, height);
    }

    public void paint(Graphics g){

        // Sky Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);

        // Bar x, y axis
        Color DarkMagenta = new Color(177, 2, 166);
        g.setColor(DarkMagenta);
        g.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        g.drawString("Gewichten", 80, 60);
        g.drawString("Names", 1175, 590);

        // X Axis
        g.setColor(Color.black);
        g.fillRect(150, 580, 1000, 15);

        // Y Axis
        g.fillRect(150, 80, 15, 500);

        // Valerie 40kg
        Color Red = new Color(174, 28, 40);
        g.setColor(Red);

        // Jeroen 100kg
        Color White = new Color(255, 255, 255);
        g.setColor(White);

        // Hans 80kg
        Color Blue = new Color(33, 70, 139);
        g.setColor(Blue);

    }
}
