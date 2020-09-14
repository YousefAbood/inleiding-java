package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rekenenmachine extends Applet {

    Label firstBracketLabel, secondBracketLabel;
    TextField firstBracketTextField, secondBracketTextField;
    Button add, sub, div, mul, clear;
    String firstBracketWritten, secondBracketWritten;
    int output, firstBracketValue, secondBracketValue;



    public void init() {
        // Background Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);

        // Resize Screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // TextFields

        // First Bracket
        firstBracketLabel = new Label();
        firstBracketTextField = new TextField("", 40);
        firstBracketWritten = "";

        // Second Bracket
        secondBracketLabel = new Label();
        secondBracketTextField = new TextField("", 40);
        secondBracketWritten = "";

        // Buttons

        // Addition
        add = new Button("+");
        addClass addEvent = new addClass();
        add.addActionListener(addEvent);

        // Subtraction
        sub = new Button("-");
        subClass subEvent = new subClass();
        sub.addActionListener(subEvent);

        // Division
        div = new Button("/");
        divClass divEvent = new divClass();
        div.addActionListener(divEvent);

        // Multiplication
        mul = new Button("*");
        mulClass mulEvent = new mulClass();
        mul.addActionListener(mulEvent);

        // Clear Button
        clear = new Button(" >> Clear << ");
        clearClass clearEvent = new clearClass();
        clear.addActionListener(clearEvent);

        // Variable


        // Add

        add(firstBracketTextField);
        add(firstBracketLabel);
        add(secondBracketTextField);
        add(secondBracketLabel);
        add(add);
        add(sub);
        add(div);
        add(mul);
        add(clear);

    }

    public void paint(Graphics g) {
        g.setFont(new Font("Courier", Font.BOLD, 20));
        g.drawString("The Answer is >> " + output, 525, 200);

    }



    class addClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            firstBracketWritten = firstBracketTextField.getText();
            firstBracketValue = Integer.parseInt(firstBracketWritten);
            secondBracketWritten = secondBracketTextField.getText();
            secondBracketValue = Integer.parseInt(secondBracketWritten);
            output = firstBracketValue + secondBracketValue;
            repaint();
        }
    }

    class subClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            firstBracketWritten = firstBracketTextField.getText();
            firstBracketValue = Integer.parseInt(firstBracketWritten);
            secondBracketWritten = secondBracketTextField.getText();
            secondBracketValue = Integer.parseInt(secondBracketWritten);
            output = firstBracketValue - secondBracketValue;
            repaint();
        }
    }

    class divClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            firstBracketWritten = firstBracketTextField.getText();
            firstBracketValue = Integer.parseInt(firstBracketWritten);
            secondBracketWritten = secondBracketTextField.getText();
            secondBracketValue = Integer.parseInt(secondBracketWritten);
            output = firstBracketValue / secondBracketValue;
            repaint();
        }
    }

    class mulClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            firstBracketWritten = firstBracketTextField.getText();
            firstBracketValue = Integer.parseInt(firstBracketWritten);
            secondBracketWritten = secondBracketTextField.getText();
            secondBracketValue = Integer.parseInt(secondBracketWritten);
            output = firstBracketValue * secondBracketValue;
            repaint();
        }
    }

    class clearClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            firstBracketTextField.setText("");
            secondBracketTextField.setText("");
            output = 0;
            repaint();
        }
    }
}


