package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment82 extends Applet {

    Label visitorsLabel, pupilsLabel;
    int menCounter, womenCounter, boyCounter, girlCounter, totalVisitors;

    public void init() {

        // Variables

        menCounter = 0;
        womenCounter = 0;
        boyCounter = 0;
        girlCounter = 0;

        // Background Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        setSize(width, height);

        // Men
        visitorsLabel = new Label("Visitors >> ");
        Button menButton = new Button("Men");
        menCounterClass menCounterEvent = new menCounterClass();
        menButton.addActionListener(menCounterEvent);

        // Women
        Button womenButton = new Button("Women");
        womenCounterClass womenCounterEvent = new womenCounterClass();
        womenButton.addActionListener(womenCounterEvent);

        // Boy
        pupilsLabel = new Label(" Pupils >> ");
        Button boyButton = new Button("Male");
        boyCounterClass boyCounterEvent = new boyCounterClass();
        boyButton.addActionListener(boyCounterEvent);

        // Girl
        Button girlButton = new Button("Female");
        girlCounterClass girlCounterEvent = new girlCounterClass();
        girlButton.addActionListener(girlCounterEvent);

        // Add
        add(visitorsLabel);
        add(menButton);
        add(womenButton);
        add(pupilsLabel);
        add(boyButton);
        add(girlButton);

    }

    public void paint (Graphics g) {

        // Middle Section
        g.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 20));
        g.drawString("Welcome to the Open Day!", 500, 75);
        g.drawString("Press Men & Women to indicate Visitors according to Gender.", 525, 100);
        g.drawString("Press Male & Female to indicate Pupils according to Gender", 550, 125);

        // Counter Section
        g.setFont(new Font("TimesRoman", Font.BOLD, 15));
        g.drawString("Visitors Male >> " + menCounter, 20, 20);
        g.drawString(" Visitors Female >> " + womenCounter, 40, 40);
        g.drawString(" Pupils Male >> " + boyCounter, 60, 60);
        g.drawString(" Pupils Female >> " + girlCounter, 80, 80);
        g.drawString(" Total Visitors >> " + totalVisitors, 100, 100);

    }

    class menCounterClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            menCounter += 1;
            totalVisitors += 1;
            repaint();
        }
    }

    class womenCounterClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            womenCounter += 1;
            totalVisitors += 1;
            repaint();
        }
    }

    class boyCounterClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            boyCounter += 1;
            totalVisitors += 1;
            repaint();
        }
    }

    class girlCounterClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            girlCounter += 1;
            totalVisitors += 1;
            repaint();
        }
    }
}
