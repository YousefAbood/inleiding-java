package h06;

import java.applet.Applet;
import java.awt.*;

public class Assignment61 extends Applet {

    // Variables
    int earnings;
    int numberOfPeople;
    double distribution;

    public void init() {
        // ScreenSize Adjustment
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Variables
        earnings = 113;
        numberOfPeople = 4;
        distribution = (double) earnings / numberOfPeople;
        System.out.println(distribution);
    }

    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.setColor(Color.darkGray);
        g.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
        g.drawString("Earnings, " + earnings + " Euros.", 50, 50);
        g.setColor(Color.red);
        g.drawString(distribution + " Euros is the fair distribution between " + numberOfPeople + " people.", 50, 100);
    }
}
