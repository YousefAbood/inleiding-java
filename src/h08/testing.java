package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class testing extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;
    Button knop2;
    String s;

    public void init()  {
        tekstvak = new TextField("",30);
        label = new Label("Type iets in het tekstvakje" +
                " en druk op enter");
        knop = new Button("Ok");
        knop2 = new Button("Reset");
        knop.addActionListener( new KnopListener());
        knop2.addActionListener(new KnopListener());

        TekstvakListener tekstVakEvent = new TekstvakListener();
        tekstvak.addActionListener(tekstVakEvent);

        add(tekstvak);
        add(label);
        add(knop);
        add(knop2);
        s = "Deze tekst verandert";
    }

    public void paint(Graphics g)   {
        g.drawString(s,50,70);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }


    class TekstvakListener implements ActionListener    {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
            }
        }

}