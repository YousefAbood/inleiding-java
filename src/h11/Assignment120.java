package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Assignment120 extends Applet {

    Button submitButton;
    Label labelTextField;
    TextField textField;
    String getText;
    int i, input, output, getTextstrToInt;
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


    }

    public void paint(Graphics g) {

        // For Loop

        for (i = 0; i < 12; i++) {

        }
    }

   class submitClass implements ActionListener {
       public void actionPerformed(ActionEvent e) {

       }
   }
}
