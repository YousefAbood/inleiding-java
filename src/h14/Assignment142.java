package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
// Idea, Make it Numerical then Shuffle it.

public class Assignment142 extends Applet {
    Boolean active = Boolean.FALSE;
    Button serveButton;
    String[] Color = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] Type = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String[] Deck = new String[52];
    String Input;
    int w, v, z, a, b, c, d, y, randomNumber, shuffledDeckIndex;
    int l = 0;
    int t = -1;
    int i = -1;

    public void init() {

        // BackGround Color
        Color SkyColor = new Color(69, 182, 200);
        setBackground(SkyColor);

        // Button
        serveButton = new Button(">> Serve <<");
        serveClass serveEvent = new serveClass();
        serveButton.addActionListener(serveEvent);

        // Add
        add(serveButton);
    }

    public void paint(Graphics g) {
        g.setColor(java.awt.Color.black);
        g.setFont(new Font("Courier", Font.BOLD, 15));
        if (active) {

            // Player Number 1
            y = 40;
            for (a = 0; a < 13; a++) {
                y += 40;
                serveMethod(g, 40, y);
            }

            // Player Number 2
            y = 40;
            for (b = 0; b < 13; b++) {
                y += 40;
                serveMethod(g, 340, y);
            }

            // Player Number 3
            y = 40;
            for (c = 0; c < 13; c++) {
                y += 40;
                serveMethod(g, 640, y);
            }

            // Player Number 4
            y = 40;
            for (d = 0; d < 13; d++) {
                y += 40;
                serveMethod(g, 940, y);
            }
        }
    }

    void serveMethod(Graphics g, int x, int y) {


        // Random Number Generation
        randomNumber = new Random().nextInt(Deck.length);

        // Shuffling
        Input = Deck[randomNumber];
        String[] shufflingDeck = new String[Deck.length - 1];
        shuffledDeckIndex = 0;

        for (z = 0; z < Deck.length; z++) {
            if (z != randomNumber) {
                shufflingDeck[shuffledDeckIndex] = Deck[z];
                shuffledDeckIndex++;
            }
        }

        Deck = shufflingDeck;

        // Drawing & Checking Values
        g.drawString(Input, x, y);
    }


    void cardGeneration() {
        for (v = 0; v < Deck.length; v++) {
            t++;
            if (v%13 == 0 && !(v == 0)) {
                t = 0;
                l++;
                System.out.println("M >> " + l);
            }

            Deck[v] = Color[l] + " " + Type[t];
//            System.out.println("Deck >> " + Deck[v]);
        }

        for (w = 0; w < 52; w++) {
            System.out.println("Deck W >> " + Deck[w]);
        }
    }

    class serveClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cardGeneration();
            active = Boolean.TRUE;
            repaint();
        }
    }
}
