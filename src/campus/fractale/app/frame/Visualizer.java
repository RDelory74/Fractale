package campus.fractale.app.frame;

import javax.swing.*;
import java.awt.*;


public class Visualizer extends JPanel {


    private final int iter;


    public Visualizer(int iter) {
        this.iter = iter;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        KochFlake kc = new KochFlake();
        kc.drawKochFlake(g,iter,300,300,20,300);

/*

       KochCurve kc = new KochCurve();
       kc.drawKochCurve(g,iter,300,300,5,300);
  */

/*
        DragonCurve dragon = new DragonCurve();
        dragon.drawDragonCurve(g, iter, 400, 300, 500, 300, true);
*/


    }

    public static void createAndShowGUI(int iter) {
        JFrame frame = new JFrame("Fractale");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Visualizer visualizer = new Visualizer(iter);
        frame.add(visualizer);
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}
