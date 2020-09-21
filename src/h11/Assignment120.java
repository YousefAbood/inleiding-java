package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Assignment120 extends Applet {

    Button submitButton;
    Label labelTextField;
    TextField textField;
    String getText;
    int i, output, getTextstrToInt, x, y;
    Color SkyColor = new Color(69, 182, 217);


    public void init() {

        // Background Color
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Button
        submitButton = new Button(">> Submit <<");
        submitClass submitEvent = new submitClass();
        submitButton.addActionListener(submitEvent);

        // Text Field

        // Label
        labelTextField = new Label("Enter Number You Want Here & It's table shall appear >> ");
        textField = new TextField("", 30);
        submitClass textFieldEvent = new submitClass();
        textField.addActionListener(textFieldEvent);

        // Variables

        // Coordinates
        x = 50;
        y = 20;

        // Add
        add(labelTextField);
        add(textField);
        add(submitButton);
    }

    public void paint(Graphics g) {

        // For Loop
        g.setColor(Color.black);
        g.setFont(new Font("TimesRoman", Font.BOLD, 30));
        for (i = 1; i < 13; i++) {
            x += 50;
            y += 50;
            output = getTextstrToInt * i;
            g.drawString(getTextstrToInt + " * " + i + " = " + output, x, y);
        }
    }

   class submitClass implements ActionListener {
       public void actionPerformed(ActionEvent e) {
            getText = textField.getText();
            getTextstrToInt = Integer.parseInt(getText);
            textField.setText("");
            x = 50;
            y = 20;
            repaint();
       }
   }
}
