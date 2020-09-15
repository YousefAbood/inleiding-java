package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment104 extends Applet {
    Label monthLabel, yearLabel;
    TextField monthTextField, yearTextField;
    String monthNumberGetText, monthName, monthDays, yearNumberGetText;
    Button submitButton;
    int monthNumberStrToInt, yearNumberStrToInt;

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
        monthYearClass submitButtonEvent = new monthYearClass();
        submitButton.addActionListener(submitButtonEvent);

        // Text Field

        // Month
        monthLabel = new Label("Type in the number of the month >> ");
        monthTextField = new TextField("", 30);
        monthYearClass monthTextFieldEvent = new monthYearClass();
        monthTextField.addActionListener(monthTextFieldEvent);

        // Year
        yearLabel = new Label("  Type in the number of the year >> ");
        yearTextField = new TextField("", 30);
        monthYearClass yearTextFieldEvent = new monthYearClass();
        yearTextField.addActionListener(yearTextFieldEvent);

        // Add
        add(monthLabel);
        add(monthTextField);
        add(yearLabel);
        add(yearTextField);
        add(submitButton);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.BOLD, 20));
        g.drawString("Month Submitted >> " +  monthNumberStrToInt, 75, 75);
        g.drawString("Month's Name >> " + monthName, 125, 125);
        g.drawString("Days in month >> " + monthDays,  175, 175);
    }

    class monthYearClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            monthNumberGetText = monthTextField.getText();
            monthNumberStrToInt = Integer.parseInt(monthNumberGetText);
            yearNumberGetText = yearTextField.getText();
            yearNumberStrToInt = Integer.parseInt(yearNumberGetText);
            if (monthNumberStrToInt == 1) {
                monthName = "January";
                monthDays = "31";
                monthTextField.setText("");
                yearTextField.setText("");
                repaint();
            }
            if ((yearNumberStrToInt % 4 == 0 && !(yearNumberStrToInt % 100 == 0)) || yearNumberStrToInt % 400 == 0 && monthNumberStrToInt == 2) {
                monthName = "February";
                monthDays = "29";
                monthTextField.setText("");
                yearTextField.setText("");
                repaint();
            }
            if (!(yearNumberStrToInt % 4 == 0 && !(yearNumberStrToInt % 100 == 0)) || yearNumberStrToInt % 400 == 0 && monthNumberStrToInt == 2) {
                monthName = "February";
                monthDays = "28";
                monthTextField.setText("");
                yearTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 3) {
                monthName = "March";
                monthDays = "31";
                monthTextField.setText("");
                yearTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 4) {
                monthName = "April";
                monthDays = "30";
                monthTextField.setText("");
                yearTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 5) {
                monthName = "May";
                monthDays = "31";
                monthTextField.setText("");
                yearTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 6) {
                monthName = "June";
                monthDays = "30";
                monthTextField.setText("");
                yearTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 7) {
                monthName = "July";
                monthDays = "31";
                monthTextField.setText("");
                yearTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 8) {
                monthName = "August";
                monthDays = "31";
                monthTextField.setText("");
                yearTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 9) {
                monthName = "September";
                monthDays = "30";
                monthTextField.setText("");
                yearTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 10) {
                monthName = "October";
                monthDays = "31";
                monthTextField.setText("");
                yearTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 11) {
                monthName = "November";
                monthDays = "30";
                monthTextField.setText("");
                yearTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt == 12) {
                monthName = "December";
                monthDays = "31";
                monthTextField.setText("");
                yearTextField.setText("");
                repaint();
            }
            if (monthNumberStrToInt > 12 || monthNumberStrToInt < 0) {
                monthName ="Null";
                monthDays = "Null";
                monthTextField.setText("");
                yearTextField.setText("");
                repaint();
            }
        }
    }
}
