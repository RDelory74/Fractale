package campus.fractale.app.frame;

import sun.java2d.SunGraphics2D;

public class DragonCurve {

    public int iter;
    private SunGraphics2D g;
    public int newY;
    public int newX;


    public void drawDragonCurve(int iter, int x1, int y1, int x2, int y2, boolean left) {
        int newX = 0;
        int newY=0;

        if (iter == 0) {
            g.drawLine(x1,y1,x2,y2);
        } else if (left) {
            newX = (x1+x2+y1-y2) /2;
            newY = (x2-x1+y1+y2) /2;
        } else {
            newX = (x1+x2-y1+y2) /2;
            newY = (x1-x2+y1+y2) /2;
        }
        drawDragonCurve(iter-1, x1, y1, newX, newY, true);
        drawDragonCurve(iter-1, newX, newY, x2, y2, false);
    }
}
