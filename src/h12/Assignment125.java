package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Assignment125 extends Applet {

    int i, v, x, y;
    Boolean active = Boolean.FALSE;
    String nameInput, phoneNumberInput;
    Button submitButton;
    Label nameLabel, phonenumberLabel;
    TextField nameTextField, phoneNumberTextField;
    String[] namesArray = new String[10];
    String[] phoneNumberArray = new String[10];

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
        x = 5;
        y = 0;
        i = -1;

        // Add
        add(nameLabel);
        add(nameTextField);
        add(phonenumberLabel);
        add(phoneNumberTextField);
        add(submitButton);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.setFont(new Font("Courier", Font.BOLD, 20));
        if (active) {
            for(v = 0; v < i+1; v++) {
                y += 60;
                g.drawString("Name >> " + namesArray[v], x, y);
                g.drawString("Phone Number >> " + phoneNumberArray[v], x, y + 30);
                System.out.println("namesArray V >> " + namesArray[v]);
                System.out.println("phonesArray V >> " + phoneNumberArray[v]);
            }
        }
    }

    class addContactClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            i++;
            x = 5;
            y = 0;
            nameInput = nameTextField.getText();
            phoneNumberInput = phoneNumberTextField.getText();
            namesArray[i] = nameInput;
            phoneNumberArray[i] = phoneNumberInput;
            active = Boolean.TRUE;
            System.out.println("i >> " + i);
            System.out.println("nameInput >> " + nameInput);
            System.out.println("phoneNumberInput >> " + phoneNumberInput);
            System.out.println("namesArray i >> " + namesArray[i]);
            System.out.println("phonesArray i >> " + phoneNumberArray[i]);
            repaint();
        }
    }
}
