package h04;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht extends Applet {

    public void init () {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        resize(width, height);
    }

    public void paint(Graphics g) {
        g.drawLine(20, 20, 160, 20);
        g.drawString("Lijn", 80, 40);
        g.drawRect(20, 80, 300, 150);
        g.drawString("Rechthoek", 100, 250);
        g.drawRoundRect(20, 275, 300, 150, 100, 100);
        g.drawString("Afgeronde Rechthoek", 100, 450);
        g.setColor(Color.magenta);
        g.fillRect(350, 80, 300, 150);
        g.setColor(Color.black);
        g.drawOval(350, 80, 300, 150);
        g.drawString("Gevulde rechthoek met ovaal", 450, 250);
        g.setColor(Color.magenta);
        g.fillOval(350, 275, 300, 150);
        g.setColor(Color.black);
        g.drawString("Gevulde Ovaal", 450, 450);
        g.drawOval(680, 80, 300, 150);
        g.setColor(Color.magenta);
        g.fillArc(680, 80, 300, 150, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 750, 250);
        g.drawOval(750, 275, 150, 150);
        g.drawString("Cirkel", 800, 450);


    }

}
