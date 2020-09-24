package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Made a Game, Generate 6 numbers between 1 & 10, the person tries to guess with the textfield, if he is wrong he can try again.
public class Assignment124 extends Applet {

    boolean active = Boolean.FALSE;
    boolean correct = Boolean.FALSE;
    boolean wrong = Boolean.FALSE;
    int i, v, x, y, strToInt, random, output, input;
    int[] generatedNum = {0, 0, 0, 0, 0, 0};
    String getText;
    Button guessButton, generateButton;
    Label guessLabel;
    TextField guessTextField;
    Color SkyColor = new Color(69, 181, 210);


    public void init() {
        // Background Color
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Button

        // Guess Button
        guessButton = new Button(">> Guess <<");
        guessClass guessButtonEvent = new guessClass();
        guessButton.addActionListener(guessButtonEvent);

        // Generate Button
        generateButton = new Button(">> Generate <<");
        generateClass generateButtonEvent = new generateClass();
        generateButton.addActionListener(generateButtonEvent);

        // Textfield
        guessLabel = new Label("Click Generate to Generate New Numbers >> " + "Click Guess to know if your Guess was correct");
        guessTextField = new TextField("", 20);
        guessClass guessTextFieldEvent = new guessClass();
        guessTextField.addActionListener(guessTextFieldEvent);

        // Variables
        x = 60;
        y = 60;

        // Add
        add(guessLabel);
        add(guessTextField);
        add(guessButton);
        add(generateButton);
    }


    public void paint(Graphics g) {
        g.setColor(SkyColor);
        g.setFont(new Font("Courier", Font.BOLD, 20));

        g.setColor(SkyColor);
        if (strToInt == input) {
            g.setColor(Color.green);
            g.drawString("Correct! Your Answer was " + strToInt, x, y);
        }

        else {
            g.setColor(Color.red);
            g.drawString("Wrong! Your Answer was " + strToInt, x, y + 30);
        }
    }




    // Gets Text to decide whether the guess is correct
    class guessClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            active = Boolean.TRUE;
            getText = guessTextField.getText();
            strToInt = Integer.parseInt(getText);
            for (v = 0; v < 6; v++) {
                input = generatedNum[v];
            }
            repaint();
        }
    }

    // Generates the numbers you are going to be guessing from
    class generateClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (i = 0; i < 6; i++) {
                active = Boolean.FALSE;
                random = (int) (Math.random() * 10 + 1);
                output = random;
                generatedNum[i] = output;
                System.out.println("Input >> " + output);
                System.out.println("Index " + i + " >> "+  generatedNum[i]);
                System.out.println("---------------");
                repaint();
            }
        }
    }

}

