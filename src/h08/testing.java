package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Step 1, Setup an Input Variable to set an end-case for the method i am going to write
// Follow Up to Step 1, I take 8 & I set it as an end-case so that my For-Loop ends when it reaches that number

// Step 2, Think about all the ways that I can distinguish Even & Odd numbers from each other.
// Follow Up to Step 2, Know whether it is divisible by 2, if it is i put it in a seperate Variable named Even
// If it is not then i put in a separate variable named Odd, I also have an another variable named powerOfTwo.
// Why? Incase my Nested For-Loop then if-statement catches a number divisible by 6 then it multiplies it by itself.

// SO! You fill in 8 then this happens, 2 .. 4 .. 36 .. 8 END OF PROGRAM

// Step 3, Check whether the code works or not & Fixed any bug that might occur

// Step 4, Figure out an elegant way to display the code on an Applet

public class testing extends Applet {

    String getInputTextFromCustomer;
    int currentNumber, endNumber, powerOfTwo, sumOfAllElementsOnScreen, tell, strToInt, Difference, beforeSum;
    int x = 600;
    int y = 25;
    Label fillNumberLabel;
    TextField fillNumberTextfield;
    Button submitButton;

    public void init() {
        setSize(1920, 1080);

        // Button
        submitButton = new Button(">> Submit <<");
        SubmitClass submitEvent = new SubmitClass();
        submitButton.addActionListener(submitEvent);

        // submitButton.addActionListener(new SubmitClass());

        // Textfield
        fillNumberLabel = new Label("Invoer jouw nummer in >> ");
        fillNumberTextfield = new TextField("", 20);
        fillNumberTextfield.addActionListener(submitEvent);

        // Add
        add(fillNumberLabel);
        add(fillNumberTextfield);
        add(submitButton);
    }

    public void paint(Graphics g) {
        y = 25;
        endNumber = strToInt;
        for(currentNumber = 1; currentNumber <= endNumber; currentNumber++) {
            if(currentNumber %2 == 0 && currentNumber %6 == 0) {
                y += 20;
                tell++;
                powerOfTwo = currentNumber * currentNumber;
                sumOfAllElementsOnScreen += powerOfTwo;
                g.drawString("Div6 >> " + powerOfTwo, x, y);
            }

            else if(currentNumber %2 == 0){
                tell++;
                y += 20;
                g.drawString("Beginning Number >> " + currentNumber, x, y);
                sumOfAllElementsOnScreen += currentNumber;
            }

            if(currentNumber == endNumber) {
                y += 20;
                Difference = sumOfAllElementsOnScreen - beforeSum;
                g.drawString("Sum >> " + sumOfAllElementsOnScreen, x, y);
                g.drawString("Difference >> " + Difference, x, y+20);
            }
        }

        System.out.println("Tell >> " + tell);
    }

    class SubmitClass implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            beforeSum = sumOfAllElementsOnScreen;
            sumOfAllElementsOnScreen = 0;
            getInputTextFromCustomer = fillNumberTextfield.getText();
            strToInt = Integer.parseInt(getInputTextFromCustomer);
            System.out.println("Difference >> " + Difference);
            repaint();
        }
    }
}