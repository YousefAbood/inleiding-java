package h12;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Made a Game, Generate 6 numbers between 1 & 10, the person tries to guess with the textfield, if he is wrong he can try again.
public class Assignment124 extends Applet {

    boolean active = Boolean.FALSE;
    int i, strToInt;
    int[] generatedNum = {0, 0, 0, 0, 0, 0};
    String getText;
    Button guessButton, generateButton;
    Label guessLabel;
    TextField guessTextField;

    public void init() {
        // Background Color
        Color SkyColor = new Color(69, 181, 210);
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Button

        // Guess Button
        guessButton = new Button(">> Guess <<");

        // Generate Button
        generateButton = new Button(">> Generate <<");

        // Textfield
        guessLabel = new Label("Click Generate to Generate New Numbers >> " + "Click Guess to know if your Guess was correct"  );
        guessTextField = new TextField("", 20);

        // Variables

        // Add
        add(guessLabel);
        add(guessTextField);
        add(guessButton);
        add(generateButton);
    }


    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.setFont(new Font("Courier", Font.BOLD, 20));

    }

    // Gets Text to decide whether the guess is correct
    class guessClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    // Generates the numbers you are going to be guessing from
    class generateClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

}
