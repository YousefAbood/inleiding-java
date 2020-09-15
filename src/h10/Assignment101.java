package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment101 extends Applet {

    Button submitButton;
    Label submittedLabel;
    TextField submittedTextField;
    String submitGetText, submitStrToInt;
    int highestNumber, submittedNumber;

    public void init() {
        // Background Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Button
        submitButton = new Button(" >> Submit << ");
        Comparsion submitButtonEvent = new Comparsion();
        submitButton.addActionListener(submitButtonEvent);

        // TextField
        submittedLabel = new Label("Enter The number here! >> ");
        submittedTextField = new TextField("", 30);
        Comparsion submittedTextFieldEvent = new Comparsion();
        submittedTextField.addActionListener(submittedTextFieldEvent);

        // Add
        add(submittedLabel);
        add(submittedTextField);
        add(submitButton);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.BOLD, 20));

        // Submitted Number
        g.drawString("This is the submitted number >> " + submittedNumber, 525, 200);

        // Highest Number
        g.drawString("This is the highest number >> " + highestNumber, 575, 250);

    }

    class Comparsion implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            submitGetText = submittedTextField.getText();
            submittedNumber = Integer.parseInt(submitGetText);
            if (submittedNumber > highestNumber) {
                highestNumber = submittedNumber;
                submittedTextField.setText("");
                repaint();
            }
            else {
                submittedTextField.setText("");
                repaint();
            }
        }
    }

}
