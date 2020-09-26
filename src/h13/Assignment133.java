package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Assignment133 extends Applet {

    Boolean activeRed = Boolean.FALSE;
    Boolean activeGrey = Boolean.FALSE;
    Button redBricks, greyBricks, eraseButton;
    int i, v, x, y, w, h, cw, ch, rowsRed, rowsGrey;
    Color brickRed = new Color(139, 0, 0);
    Color concreteGray = new Color(102, 102, 102);

    public void init() {

        // Buttons

        // Red Button
        redBricks = new Button(">> Click Here To Draw Red Bricks <<");
        redBricksClass redBricksEvent = new redBricksClass();
        redBricks.addActionListener(redBricksEvent);

        // Grey Button
        greyBricks = new Button(">> Click Here To Draw Grey Bricks <<");
        greyBricksClass greyBricksEvent = new greyBricksClass();
        greyBricks.addActionListener(greyBricksEvent);

        // Erase Button
        eraseButton = new Button(">> Click here to Erase <<");
        eraseClass eraseEvent = new eraseClass();
        eraseButton.addActionListener(eraseEvent);

        // Variables
        x = -150;
        y = 0;
        w = 150;
        h = 100;
        cw = 200;
        ch = 150;

        // Add
        add(redBricks);
        add(greyBricks);
        add(eraseButton);
    }

    public void paint(Graphics g) {
        System.out.println("ActiveRed >> " + rowsRed);
        System.out.println("ActiveGrey >> " + rowsGrey);

        if(activeRed) {
            System.out.println("Received");
            drawRedBricks(g);
        }

        if(activeGrey) {
            System.out.println("Received");
            drawGreyBricks(g);
        }
    }

    void drawRedBricks(Graphics g) {
        for (i = 0; i < 200; i++) {
            rowsRed++;
            x += 150;
            g.setColor(brickRed);
            g.fillRect(x, y, w, h);
            g.setColor(Color.black);
            g.drawRect(x, y, w, h);
            if (rowsRed%9 == 0) {
                x = -150;
                y += 100;
            }
        }
    }

    void drawGreyBricks(Graphics g) {
        for (v = 0; v < 200; v++) {
            rowsGrey++;
            x += 150;
            g.setColor(concreteGray);
            g.fillRect(x, y, cw, ch);
            g.setColor(Color.black);
            g.drawRect(x, y, cw, ch);
            if (rowsGrey%9 == 0) {
                x = -150;
                y += 100;
            }
        }
    }

    class redBricksClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            activeRed = Boolean.TRUE;
            repaint();
        }
    }

    class greyBricksClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            activeGrey = Boolean.TRUE;
            repaint();
        }
    }

    class eraseClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            activeGrey = Boolean.FALSE;
            activeRed = Boolean.FALSE;
            x = -150;
            y = 0;
            rowsGrey = 0;
            rowsRed = 0;
            repaint();
        }
    }
}
