package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Assignment121 extends Applet {

    Button generateButton;
    int x, y, i, output, average, random;
    int[] numbers;

    public void init() {

        // Background Color
        Color SkyColor = new Color(69, 182, 219);
        setBackground(SkyColor);

        // Dimension
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screensize.width;
        int height = screensize.height;
        resize(width, height);

        // Button
        generateButton = new Button(">> Generate <<");
        generateClass generateEvent = new generateClass();
        generateButton.addActionListener(generateEvent);

        // Variable
        x = 20;
        y = 20;

        // Add
        add(generateButton);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.setFont(new Font("Courier", Font.BOLD, 20));
        g.drawString("Index " + i + " >> " + random, x, y);
    }

    class generateClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (i = 0; i < 11; i++) {
                x += 50;
                y += 50;
                random = (int)(Math.random() * 50 +1);
                numbers[i] = random;
                repaint();
            }
        }
    }
}
