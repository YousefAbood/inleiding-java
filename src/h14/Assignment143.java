package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;

public class Assignment143 extends Applet {

    // For-Loop
    int i;

    // Boolean
    Boolean active = Boolean.FALSE;
    // Not Correct Value Boolean
    Boolean outOfBounds = Boolean.FALSE;

    // Coordinates & Dimensions
    int x, y, w, h;

    // Buttons
    Button resetButton, submitButton;

    // TextField & Label & Parse
    Label textFieldLabel;
    TextField playerInputTextfield;
    String getText;

    // Integers for the Player Input & Computer Input
    int playerNumber, computerNumber, imageNumber;

    // Images
    Image chessPiece;
    URL path;

    public void init() {

        // BackGroundColor
        Color SkyColor = new Color(69, 182, 210);
        setBackground(SkyColor);

        // Images
        path = Assignment143.class.getResource("/resources/");
        chessPiece = getImage(path, "PawnChess-removebg-preview.png");

        // Buttons

        // Submit Button
        submitButton = new Button(">> Submit <<");
        submitClass submitEvent = new submitClass();
        submitButton.addActionListener(submitEvent);

        // Reset Button
        resetButton = new Button(">> Reset <<");
        resetClass beginResetEvent = new resetClass();
        resetButton.addActionListener(beginResetEvent);

        // TextField
        textFieldLabel = new Label("Put in a value, 1 2 3 then Click on Submit, To play again press Reset. >> ");
        playerInputTextfield = new TextField("", 20);
        playerInputTextfield.addActionListener(submitEvent);

        // Variables
        imageNumber = 24;
        x = 150;
        y = 50;
        w = 80;
        h = 80;

        // Add
        add(textFieldLabel);
        add(playerInputTextfield);
        add(submitButton);
        add(resetButton);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Courier", Font.BOLD, 20));
        if (outOfBounds) {
            g.setColor(Color.red);
            g.drawString("You put an Invalid Number, Try Again!", 50, 50);
        }
        active = Boolean.TRUE;
        drawingObjects(g);
        g.drawString("Value You Submitted >> " + playerNumber, 75, 75);
        g.drawString("Value the Computer Submitted >> " + computerNumber, 100, 100);
    }

    void drawingObjects(Graphics g) {
        x = 150;
        y = 50;
        if (active) {
            g.setColor(Color.black);
            for (i = 0; i <= imageNumber; i++) {
                x += 100;
                if (i % 5 == 0) {
                    x = 150;
                    y += 100;
                }
                g.drawImage(chessPiece, x, y, w, h, this);
            }

        }
    }

    class submitClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            x = 150;
            y = 50;
            getText = playerInputTextfield.getText();
            playerNumber = Integer.parseInt(getText);
            if(playerNumber <= 0 || playerNumber > 3) {
                outOfBounds = Boolean.TRUE;
            }

            else {
                outOfBounds = Boolean.FALSE;
                imageNumber -= playerNumber;
            }
            repaint();
        }
    }

    class resetClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            imageNumber = 24;
            x = 150;
            y = 50;
            repaint();
        }
    }


}
