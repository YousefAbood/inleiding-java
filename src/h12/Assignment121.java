package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Assignment121 extends Applet {

    Boolean active = Boolean.FALSE;
    Button generateButton;
    int x, y, i, roundedAverage, roundedInput;
    double average, random, input, output, roundedOutput, roundedDrawnInput;
    double[] numbers = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};


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
        if (active) {
            for (i = 0; i < 10; i++) {
                x += 30;
                y += 30;
                random = Math.random() * 100 + 1;
                input = numbers[i];
                input = random;
                output += random;
                average = output / numbers.length;

                // Rounded Average
                roundedAverage = (int) (average * 10);
                roundedOutput = roundedAverage / 10.0;

                // Rounded Output
                roundedInput = (int) (input * 10);
                roundedDrawnInput = roundedInput / 10.0;

                g.drawString("Index " + i + " >> " + roundedDrawnInput, x, y);
                System.out.println("Input >> " + input);
                System.out.println("Random >> " + random);
                System.out.println("Output >> " + output);
                System.out.println("Average >> " + average);
                System.out.println("----------------");
            }
            g.drawString("Average >> " + roundedOutput, x+30, y+30);
        }
    }

    class generateClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            x = 20;
            y = 20;
            active = Boolean.TRUE;
            repaint();
        }
    }
}
