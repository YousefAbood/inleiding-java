package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Assignment123 extends Applet {

    int i;
    Label sortLabel;
    TextField[] sortTextField = new TextField[5];

    public void init() {
        // Background Color
        Color SkyColor = new Color(69, 181, 210);
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // TextField
        sortLabel = new Label("Fill in 5 Numbers, Click on Sort to sort them! >> ");
        sortTextField[0] = new TextField("", 20);
        sortTextField[1] = new TextField("", 20);
        sortTextField[2] = new TextField("", 20);
        sortTextField[3] = new TextField("", 20);
        sortTextField[4] = new TextField("", 20);

        // Add
        add(sortLabel);
        for (i = 0; i < 5; i++) {
            add(sortTextField[i]);
        }
    }


    public void paint(Graphics g) {

    }

    class sortClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}
