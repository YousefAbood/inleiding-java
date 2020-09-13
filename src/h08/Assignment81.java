package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class Assignment81 extends Applet {
    Button submit;
    Button clear;
    Label label;
    TextField written;
    String printWritten;

    public void init() {
        // Background Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);


        // Work

        label = new Label("Type Here");
        written = new TextField("", 60);
        printWritten = "";

        // Event Listener for GetText
        getTextClass writeEvent = new getTextClass();
        written.addActionListener(writeEvent);

        // Event Listener for Submit
        submit = new Button("Submit");
        submitClass submetEvent = new submitClass();
        submit.addActionListener(submetEvent);

        // Event Listener for Clear
        clear = new Button("Reset");
        resetClass clearEvent = new resetClass();
        clear.addActionListener(clearEvent);

        add(written);
        add(label);
        add(submit);
        add(clear);
    }

    public void paint(Graphics g) {

        // Instruction
        g.drawString("Click Submit to show text on the screen", 500, 75);
        g.drawString("Click Clear to clear the screen", 525, 100);

        // PrintWritten
        g.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 40));
        g.drawString(printWritten, 525, 200);


    }

    class getTextClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            printWritten = written.getText();
        }
    }

    class submitClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            printWritten = written.getText();
            repaint();
        }
    }

    class resetClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            written.setText("");
            repaint();
        }
    }

}










