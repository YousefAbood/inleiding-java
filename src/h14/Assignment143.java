package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;

public class Assignment143 extends Applet {

    // Buttons
    Button beginButton, resetButton, submitButton;

    // TextField & Label
    Label textFieldLabel;
    TextField playerInputTextfield;

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

        // Begin & Reset Buttons
        beginButton = new Button(">> Begin <<");
        resetButton = new Button(">> Reset <<");
        beginResetClass beginResetEvent = new beginResetClass();
        beginButton.addActionListener(beginResetEvent);
        resetButton.addActionListener(beginResetEvent);

        // TextField
        textFieldLabel = new Label("Put in a value, 1 2 3 then Click on Submit, To play again press Reset, To start playing Click on Begin. >> ");
        playerInputTextfield = new TextField("", 20);

        // Add
        add(textFieldLabel);
        add(beginButton);
        add(playerInputTextfield);
        add(submitButton);
        add(resetButton);
    }

    public void paint(Graphics g) {
        g.drawImage(chessPiece, 300, 100, 80, 80, this);
    }

    class submitClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class beginResetClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
}
