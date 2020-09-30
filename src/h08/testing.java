package h08;

import java.awt.*;
import java.applet.*;
// Step 1, Setup an Input Variable to set an end-case for the method i am going to write
// Follow Up to Step 1, I take 8 & I set it as an end-case so that my For-Loop ends when it reaches that number

// Step 2, Think about all the ways that I can distinguish Even & Odd numbers from each other.
// Follow Up to Step 2, Know whether it is divisible by 2, if it is i put it in a seperate Variable named Even
// If it is not then i put in a separate variable named Odd, I also have an another variable named div6.
// Why? Incase my Nested For-Loop then if-statement catches a number divisible by 6 then it multiplies it by itself.

// SO! You fill in 8 then this happens, 2 .. 4 .. 36 .. 8 END OF PROGRAM

// Step 3, Check whether the code works or not & Fixed any bug that might occur

// Step 4, Figure out an elegant way to display the code on an Applet

public class testing extends Applet {

    int beginningNumber, endNumber, div6, sum, tell;

    public void init() {

    }

    public void paint(Graphics g) {
        endNumber = 180;
        for(beginningNumber = 1; beginningNumber <= endNumber; beginningNumber++) {
            if(beginningNumber%2 == 0 && beginningNumber%6 == 0) {
                tell++;
                div6 = beginningNumber * beginningNumber;
                sum += div6;
                System.out.println("Div6 >> " + div6);


//                    System.out.println(beginningNumber + " >> it can divided by Six");
            }

            else if(beginningNumber%2 == 0){
                tell++;
                System.out.println("Beginning Number >> " + beginningNumber);
                sum += beginningNumber;
            }


        }
        System.out.println("Tell >> " + tell);
        System.out.println("Sum >> " + sum);
    }
}