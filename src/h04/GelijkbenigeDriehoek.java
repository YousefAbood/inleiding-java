package h04;

import java.applet.Applet;
import java.awt.*;

public class GelijkbenigeDriehoek extends Applet {

    public void init() {

    }

    public void paint(Graphics g){
        int[] x ={200, 100, 300};
        int[] y ={50, 250, 250};
        g.drawPolygon(x, y, 3);

    }
}
