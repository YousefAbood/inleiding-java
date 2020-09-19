package h11;

// Initial Idea for the Program
// Commit 1, Use For Loop until i = 64 because a chess board has 64 Squares!
// Commit 2, I will use Modulo n%2 to know whether n (aka. i) is Odd or Even & in that notion the computer can know whether to use Black or White squares
// Commit 3, Nested Under the % If-Statement of both Black & White is an another if-statement!
// Commit 4, i%8 so every 8 squares i can go down one row and that makes it more automated and efficient instead of writing a code block for every row
//

import java.applet.Applet;
import java.awt.*;

public class Assignment119 extends Applet {

    int x, y, i, rectWidth, rectHeight, rowcounter;
    Color SkyColor = new Color(69, 182, 217);
    Color white, black;

    public void init() {

        // Background Color
        setBackground(SkyColor);

        // Screen Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        resize(width, height);

        // Variables
        x = 50;
        y = 50;
        rectWidth = 100;
        rectHeight = 100;
        white = new Color(255, 255, 255);
        black = new Color(0, 0, 0);


    }

    public void paint(Graphics g) {
        setBackground(SkyColor);
        for (i = 0; i < 48; i++) {
            if (i%2 == 0) {
                g.setColor(black);
            }

            else {
                g.setColor(white);
            }

            if (i%8 == 0 && !(i == 0)) {
                rowcounter++;
                x = 50;
                y = 50;
                y = 50 + (rowcounter * 100);
            }

            x += rectWidth;
            g.fillRect(x, y, rectWidth, rectHeight);
        }
    }
}
