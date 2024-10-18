package campus.fractale.app.frame;

import java.awt.*;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class KochFlake {

    public void drawKochFlake(Graphics g,int iter, int x1, int y1, int x2, int y2) {

        int deltaX = 0;
        int deltaY = 0;

        if (iter ==0) {
            g.drawLine(x1, y1, x2, y2);
            return ;
        } else {
            deltaX = (x2 - x1) /3;
            deltaY = (y2 - y1) /3;
        }

        /*


            B
           / \
      ___A/   \C___


       */


        //Point A
        int xA = x1 + deltaX;
        int yA = y1 + deltaY;

        //Point C
        int xC = x2 - deltaX;
        int yC = y2 - deltaY;

        // point B
        double angle = Math.PI/3;
        int xB = (int)(xA + (xC - xA) * cos(Math.toRadians(60)) - (yC - yA) * sin(Math.toRadians(60)));
        int yB = (int)(yA + (xC - xA) * sin(Math.toRadians(60)) + (yC - yA) * cos(Math.toRadians(60)));

        drawKochFlake(g, iter -1, xC, yC, xA, yA);
        drawKochFlake(g, iter -1, xA, yA, xB, yB);
        drawKochFlake(g, iter -1, xB, yB, xC, yC);
       // drawKochFlake(g, iter -1, xC, yC, x2, y2);

    }

}


/*
double xB = xA + (xC - xA) * Math.cos(Math.toRadians(60)) - (yC - yA) * Math.sin(Math.toRadians(60));
double yB = yA + (xC - xA) * Math.sin(Math.toRadians(60)) - (yC - yA) * Math.cos(Math.toRadians(60));
*/