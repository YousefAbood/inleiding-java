package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment103 extends Applet {

    Label monthLabel;
    TextField monthTextField;
    String monthNumberGetText, monthName, monthDays;
    Button submitButton;
    int monthNumberStrToInt;

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
        monthClass submitButtonEvent = new monthClass();
        submitButton.addActionListener(submitButtonEvent);

        // Text Field
        monthLabel = new Label("Type in the number of the month >> ");
        monthTextField = new TextField("", 30);
        monthClass monthTextFieldEvent = new monthClass();
        monthTextField.addActionListener(monthTextFieldEvent);

        // Add
        add(monthLabel);
        add(monthTextField);
        add(submitButton);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.BOLD, 20));
        g.drawString("Month Submitted >> " +  monthNumberStrToInt, 50, 50);
        g.drawString("Month's Name >> " + monthName, 100, 100);
        g.drawString("Days in month >> " + monthDays,  150, 150);
    }

    class monthClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            monthNumberGetText = monthTextField.getText();
            monthNumberStrToInt = Integer.parseInt(monthNumberGetText);
            if (monthNumberStrToInt == 1) {
                monthName = "January";
                monthDays = "31";
                monthTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 2) {
                monthName = "February";
                monthDays = "28, 29";
                monthTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 3) {
                monthName = "March";
                monthDays = "31";
                monthTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 4) {
                monthName = "April";
                monthDays = "30";
                monthTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 5) {
                monthName = "May";
                monthDays = "31";
                monthTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 6) {
                monthName = "June";
                monthDays = "30";
                monthTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 7) {
                monthName = "July";
                monthDays = "31";
                monthTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 8) {
                monthName = "August";
                monthDays = "31";
                monthTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 9) {
                monthName = "September";
                monthDays = "30";
                monthTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 10) {
                monthName = "October";
                monthDays = "31";
                monthTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 11) {
                monthName = "November";
                monthDays = "30";
                monthTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 12) {
                monthName = "December";
                monthDays = "31";
                monthTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt > 12 || monthNumberStrToInt < 0) {
                monthName ="Null";
                monthDays = "Null";
                monthTextField.setText("");
                repaint();
            }
        }
    }
}
