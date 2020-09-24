package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Assignment125 extends Applet {

    Button submitButton;
    Label nameLabel, phonenumberLabel;
    TextField nameTextField, phoneNumberTextField;

    public void init() {
        // Background Color
        Color SkyColor = new Color(69, 181, 200);
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Button
        submitButton = new Button(">> Submit <<");
        addContactClass submitButtonEvent = new addContactClass();
        submitButton.addActionListener(submitButtonEvent);

        // Textfields
        nameLabel = new Label("Name >> ");
        phonenumberLabel = new Label("  Phone Number >> ");

        nameTextField = new TextField("", 30);
        phoneNumberTextField = new TextField("", 30);

        // Variables

        // Add
        add(nameLabel);
        add(nameTextField);
        add(phonenumberLabel);
        add(phoneNumberTextField);
        add(submitButton);
    }

    public void paint(Graphics g) {

    }

    class addContactClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
}
