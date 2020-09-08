package h04;

import java.applet.Applet;
import java.awt.*;

public class huis extends Applet {

    public void init() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        resize(width, height);
    }

    @SuppressWarnings("DuplicatedCode")
    public void paint(Graphics g) {
        // Sky Color
        Color SkyColor = new Color(69, 182, 217);
        setBackground(SkyColor);
        // Street
        g.setColor(Color.black);
        g.fillRect(0, 500, 1800, 300);
        // Yellow Marks on the Street
        g.setColor(Color.yellow);
        g.fillRect(100, 575, 200, 25);
        g.fillRect(350, 575, 200, 25);
        g.fillRect(600, 575, 200, 25);
        g.fillRect(850, 575, 200, 25);
        g.fillRect(1100, 575, 200, 25);
        // House
        Color BrickBrown = new Color(193, 106, 12); // Brick Color
        g.setColor(BrickBrown);
        g.fillRect(50, 300, 250, 200); // Colored House
        g.setColor(Color.black);
        g.drawRect(50, 300, 250, 200); // Black Outlining
        // Chimney
        g.setColor(Color.lightGray);
        g.fillRoundRect(235, 200, 50, 100, 10, 10);
        g.setColor(Color.black);
        g.drawRoundRect(235, 200, 50, 100, 10, 10);
        // Coordinates of the Roof
        int[] x ={175, 300, 50};
        int[] y ={150, 300, 300};
        g.setColor(Color.lightGray);
        g.fillPolygon(x, y, 3); // Roof of the house (Colored)
        g.setColor(Color.black);
        g.drawPolygon(x, y, 3); // Roof of the house Outline
        // Door
        g.setColor(Color.lightGray);
        g.fillRect(150, 400, 50, 100); // Color of House
        g.setColor(Color.black);
        g.drawRect(150, 400, 50, 100); // Black Outlining
        // Windows
        g.drawRoundRect(185, 330, 100, 50, 10, 10);
        g.drawRoundRect(65, 330, 100, 50, 10, 10);
        g.setColor(Color.black);
        g.drawOval(145, 210, 60, 60);
        g.setColor(BrickBrown);
        g.fillOval(145, 210, 60, 60);


        // ---------------
        // Second House
        // ---------------

        // House
        g.fillRect(450, 300, 250, 200); // Colored House
        g.setColor(Color.black);
        g.drawRect(450, 300, 250, 200); // Black Outlining
        // Chimney
        g.setColor(Color.lightGray);
        g.fillRoundRect(635, 200, 50, 100, 10, 10);
        g.setColor(Color.black);
        g.drawRoundRect(635, 200, 50, 100, 10, 10);
        // Coordinates of the Roof
        int[] m ={575, 450, 700};
        int[] v ={150, 300, 300};
        g.setColor(Color.lightGray);
        g.fillPolygon(m, v, 3); // Roof of the house (Colored)
        g.setColor(Color.black);
        g.drawPolygon(m, v, 3); // Roof of the house Outline
        // Door
        g.setColor(Color.lightGray);
        g.fillRect(550, 400, 50, 100); // Color of House
        g.setColor(Color.black);
        g.drawRect(550, 400, 50, 100); // Black Outlining
        // Windows
        g.drawRoundRect(585, 330, 100, 50, 10, 10);
        g.drawRoundRect(465, 330, 100, 50, 10, 10);
        g.setColor(Color.black);
        g.drawOval(545, 210, 60, 60);
        g.setColor(BrickBrown);
        g.fillOval(545, 210, 60, 60);

        // Pavement
        g.setColor(Color.lightGray);
        g.fillRect(0, 495, 1800, 15);
        g.fillRect(0, 660, 1800, 600);
        // Sun
        g.setColor(Color.yellow);
        g.fillOval(1100, 50, 200, 200);
    }

}
