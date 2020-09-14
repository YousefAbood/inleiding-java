package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment83 extends Applet {

    Button submitButton;
    Label taxesLabel;
    TextField taxesTextField;
    Double beforeTaxStrToDouble, afterTax, taxValue;
    String printNumber;

    public void init() {

        // Background Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        setSize(width, height);

        // Submit
        submitButton = new Button(" >> Submit << ");
        submitClass submitEvent = new submitClass();
        submitButton.addActionListener(submitEvent);

        // Text Field
        taxesLabel = new Label("Fill in the Number here >> ");
        taxesTextField = new TextField("", 40);
        taxesClass taxesEvent = new taxesClass();
        taxesTextField.addActionListener(taxesEvent);
        printNumber = "";

        // Taxes Variables

        beforeTaxStrToDouble = 0.0;
        afterTax = 0.0;

        // Add

        add(taxesLabel);
        add(taxesTextField);
        add(submitButton);

    }

    public void paint(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 40));
        g.drawString("Original Price >> " + beforeTaxStrToDouble, 525, 200);
        g.drawString("Price after Tax >> " + afterTax, 575, 250);

    }

    class taxesClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            printNumber = taxesTextField.getText();
            beforeTaxStrToDouble = Double.parseDouble(printNumber);
            taxValue = beforeTaxStrToDouble * (21.0 / 100.0);
            afterTax = beforeTaxStrToDouble + taxValue;
            System.out.println(beforeTaxStrToDouble);
            System.out.println(afterTax);
            repaint();

        }
    }

    class submitClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            printNumber = taxesTextField.getText();
            beforeTaxStrToDouble = Double.parseDouble(printNumber);
            taxValue = beforeTaxStrToDouble * (21.0 / 100.0);
            afterTax = beforeTaxStrToDouble + taxValue;
            System.out.println(beforeTaxStrToDouble);
            System.out.println(afterTax);
            repaint();
        }

    }
}
