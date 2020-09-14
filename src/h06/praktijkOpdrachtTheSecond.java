package h06;

import java.applet.Applet;
import java.awt.*;

public class praktijkOpdrachtTheSecond extends Applet {

    double CijferOne, CijferTwo, CijferThree, numberofvakken, average, roundedAverage, output;

    public void init () {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Variables

        CijferOne = 5.9;
        CijferTwo = 6.3;
        CijferThree = 6.9;
        numberofvakken = 3.0;

        average = (CijferOne + CijferTwo + CijferThree) / numberofvakken;
        roundedAverage = (int) (average * 10);
        output = roundedAverage / 10;
        System.out.println(output);
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setFont(new Font("TimesRoman", Font.BOLD, 20));

        g.setColor(Color.red);
        g.drawString("Cijfers van Yousef, ", 50, 50);

        g.setColor(Color.blue);
        g.drawString("Wiskunde, " + CijferOne, 75, 100);

        g.setColor(Color.green);
        g.drawString("Nederlands, " + CijferTwo, 75, 150);

        g.setColor(Color.magenta);
        g.drawString("Scheikunde, " + CijferThree, 75, 200);

        g.setColor(Color.black);
        g.drawString("Average Score, " + output, 75, 250);

    }
}
