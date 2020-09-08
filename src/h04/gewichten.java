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
        g.drawString("Valerie", 350, 625);
        g.drawString("Jeroen", 650, 625);
        g.drawString("Hans", 950, 625);

        // Y Axis, NOTE, 85 PERFECT VALUE FOR HEIGHT 500!!!!!!!!!!!!!

        // Equation for Variables, For every number you subtract from height(500), you add to Y Axis (85)!
        // Vice Versa, Add to height, you subtract from Y Axis
        g.setColor(Color.black);
        g.fillRect(150, 80, 15, 500);

        // Valerie 40kg
        Color Blue = new Color(33, 70, 139);
        g.setColor(Blue);
        g.fillRect(350, 425, 75, 160);

        // Jeroen 100kg
        Color White = new Color(255, 255, 255);
        g.setColor(White);
        g.fillRect(650, 185, 75, 400);

        // Hans 80kg
        Color Red = new Color(174, 28, 40);
        g.setColor(Red);
        g.fillRect(950, 265, 75, 320);

        // X Axis
        g.setColor(Color.black);
        g.fillRect(150, 580, 1000, 15);
    }
}
