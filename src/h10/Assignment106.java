package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment106 extends Applet {
    Label scoreLabel;
    TextField scoreTextField;
    Button checkButton;
    String getScore;
    Double scoreStrToDouble;
    Color SkyColor = new Color(69, 182, 217);
    Color Red = new Color(184, 29, 19);
    Color Yellow = new Color(239, 183, 0);
    Color Green = new Color(0, 132, 80);

    public void init() {

        // Background Color
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Button

        // Check Button
        checkButton = new Button(" >> Check << ");
        score checkButtonEvent = new score();
        checkButton.addActionListener(checkButtonEvent);

        // TextField
        // Label
        scoreLabel = new Label("Put in your score between 0, 10 >> ");
        scoreTextField = new TextField("", 30);
        score scoreTextFieldEvent = new score();
        scoreTextField.addActionListener(scoreTextFieldEvent);

        // Add
        add(scoreLabel);
        add(scoreTextField);
        add(checkButton);
    }

    public void paint(Graphics g) {
        g.setColor(SkyColor);
        if (scoreStrToDouble < 5 && scoreStrToDouble <= 10 && scoreStrToDouble >= 0) {
            g.setFont(new Font("Courier", Font.BOLD, 35));
            g.setColor(Red);
            g.drawString("Fail", 50, 150);
        }

        if (scoreStrToDouble == 5 && scoreStrToDouble <= 10 && scoreStrToDouble >= 0) {
            g.setFont(new Font("Courier", Font.BOLD, 35));
            g.setColor(Yellow);
            g.drawString("Moderate", 50, 300);
        }

        if (6 <= scoreStrToDouble && scoreStrToDouble < 8 && scoreStrToDouble <= 10 && scoreStrToDouble >= 0) {
            g.setFont(new Font("Courier", Font.BOLD, 35));
            g.setColor(Yellow);
            g.drawString("Sufficient", 50, 450);
        }

        if (8 <= scoreStrToDouble && scoreStrToDouble <= 10 && scoreStrToDouble <= 10 && scoreStrToDouble >= 0) {
            g.setFont(new Font("Courier", Font.BOLD, 35));
            g.setColor(Green);
            g.drawString("Good", 50, 600);
        }

        if (scoreStrToDouble < 0 || scoreStrToDouble > 10) {
            g.setFont(new Font("Courier", Font.BOLD, 35));
            g.setColor(Red);
            g.drawString("INVALID VALUE, PLEASE TRY AGAIN!", 500, 300);
        }

    }


    class score implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getScore = scoreTextField.getText();
            scoreStrToDouble = Double.parseDouble(getScore);
            repaint();
        }
    }

}
