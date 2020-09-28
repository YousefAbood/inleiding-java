package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Assignment142 extends Applet {
    Boolean active = Boolean.FALSE;
    Button serveButton;
    String[] Color = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] Type = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    int i, a, b, c, d, y, randomColor, randomType;

    public void init() {

        // BackGround Color
        Color SkyColor = new Color(69, 182, 200);
        setBackground(SkyColor);

        // Button
        serveButton = new Button(">> Serve <<");
        serveClass serveEvent = new serveClass();
        serveButton.addActionListener(serveEvent);

        // Add
        add(serveButton);
    }

    public void paint(Graphics g) {
        g.setColor(java.awt.Color.black);
        g.setFont(new Font("Courier", Font.BOLD, 15));
        if (active) {

            // Player Number 1
            y = 40;
            for (a = 0; a < 14; a++) {
                y += 40;
                serveMethod(g, 40, y);
            }

            // Player Number 2
            y = 40;
            for (b = 0; b < 14; b++) {
                y += 40;
                serveMethod(g, 340, y);
            }

            // Player Number 3
            y = 40;
            for (c = 0; c < 14; c++) {
                y += 40;
                serveMethod(g, 640, y);
            }

            // Player Number 4
            y = 40;
            for (d = 0; d < 14; d++) {
                y += 40;
                serveMethod(g, 940, y);
            }
        }
    }

    void serveMethod(Graphics g, int x, int y) {
        randomColor = new Random().nextInt(Color.length);
        randomType = new Random().nextInt(Type.length);
        g.drawString(Color[randomColor] + " " + Type[randomType], x, y);
        System.out.println("Color >> " + Color[randomColor] + " Type >> " + Type[randomType]);
    }

    class serveClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            active = Boolean.TRUE;
            repaint();
        }
    }
}
