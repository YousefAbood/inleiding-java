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
    Color SkyColor = new Color(69, 182, 219);
    Color rcZero = new Color(69, 110, 217);
    Color rcOne = new Color(255, 0, 0);
    Color rcTwo = new Color(255, 165, 0);
    Color rcThree = new Color(255, 255, 0);
    Color rcFour = new Color(0, 128, 0);
    Color rcFive = new Color(85, 150, 230);
    Color rcSix = new Color(101, 75, 204);
    Color rcSeven = new Color(217, 218, 197);
    Color rcEight = new Color(9, 31, 44);
    Color rcNine = new Color(227, 37, 91);
    Color rcTen = new Color(38, 107, 223);
    Color rcEleven = new Color(255, 255, 255);
    Color[] Colors = {rcZero, rcOne, rcTwo, rcThree, rcFour, rcFive, rcSix, rcSeven, rcEight, rcNine, rcTen, rcEleven};


    public void init() {

        // Background Color
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
                g.setColor(Colors[i]);
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