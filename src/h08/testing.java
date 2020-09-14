package h08;

import java.awt.*;
import java.applet.*;


public class testing extends Applet {
    double begingetal;
    double second;
    double third;
    double op;
    int sub;
    double uitkomst;
    public void init() {
    }

    public void paint(Graphics g) {
        begingetal = 5.9;
        second = 6.3;
        third = 6.9;
        op = (begingetal + second + third) / 3;
        sub = (int)(op * 10);
        uitkomst = sub / 10.0;
        g.drawString(" " + op + " ",20,20);
        g.drawString(" " + sub + " ",60,60);
        g.drawString(" " + uitkomst + " ",100,100);

    }
}