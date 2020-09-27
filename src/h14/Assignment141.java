package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Assignment141 extends Applet {

    Boolean active = Boolean.FALSE;
    Button serveButton;
    String[] Color = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] Type = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    int i, v, x, y, randomColor, randomType;

    public void init() {

        // BackGround Color
        Color SkyColor = new Color(69, 182, 200);
        setBackground(SkyColor);

        // Button
        serveButton = new Button(">> Serve <<");
        serveClass serveEvent = new serveClass();
        serveButton.addActionListener(serveEvent);

        // Variables
        x = 40;
        y = 40;

        // Add
        add(serveButton);
    }

    public void paint(Graphics g) {
        g.setColor(java.awt.Color.black);
        g.setFont(new Font("Courier", Font.BOLD, 30));
        if (active) {
           serveMethod(g);
        }
    }

    void serveMethod(Graphics g) {
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
