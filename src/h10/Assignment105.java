package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Color Red = new Color(184, 29, 19); Red
// Color Green = new Color(0, 132, 80); Green
// Color Yellow = new Color(239, 183, 0); Yellow

public class Assignment105 extends Applet {

    Boolean active = Boolean.FALSE;
    Label scoreLabel;
    TextField scoreTextField;
    Button checkButton, submitButton;
    String getScore;
    Double scoreStrToDouble, average, Score, output;
    int input, roundedAverage;
    Color SkyColor = new Color(69, 182, 217);
    Color Red = new Color(184, 29, 19);
    Color Green = new Color(0, 132, 80);

    public void init() {


        Score = 0.0;
        input = 0;

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

        // Submit Button
        submitButton = new Button(" >> Submit << ");
        average submitButtonEvent = new average();
        submitButton.addActionListener(submitButtonEvent);

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
        add(submitButton);
    }

    public void paint(Graphics g) {
        g.setColor(SkyColor);
        if (scoreStrToDouble >= 5.5 && scoreStrToDouble <= 10) {
            g.setFont(new Font("Courier", Font.BOLD, 35));
            g.setColor(Green);
            g.drawString("Pass!", 50, 150);
        }

        if (scoreStrToDouble < 5.5 && scoreStrToDouble >= 0) {
            g.setFont(new Font("Courier", Font.BOLD, 35));
            g.setColor(Red);
            g.drawString("Fail!", 50, 300);
        }

        if (scoreStrToDouble < 0 || scoreStrToDouble > 10) {
            g.setFont(new Font("Courier", Font.BOLD, 35));
            g.setColor(Red);
            g.drawString("INVALID VALUE, PLEASE TRY AGAIN!", 500, 300);
        }

        if (active) {
            g.setFont(new Font("Courier", Font.BOLD, 20));
            g.setColor(Color.BLACK);
            g.drawString("Your average score >> " + output, 500, 300);
        }
    }


    class score implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getScore = scoreTextField.getText();
            scoreStrToDouble = Double.parseDouble(getScore);
            input++;
            Score += scoreStrToDouble;
            average = Score / input;
            repaint();
        }
    }

    class average implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            roundedAverage = (int) (average * 10);
            output = roundedAverage / 10.0;
            active = Boolean.TRUE;
            repaint();
        }
    }
}
