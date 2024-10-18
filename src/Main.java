import campus.fractale.app.frame.DragonCurve;
import campus.fractale.app.frame.Visualizer;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //String iter =   JOptionPane.showInputDialog("How many iterations?");
        //System.out.println(iter);
        DragonCurve dragon = new DragonCurve();
        dragon.drawDragonCurve(10,50,50,50,50,true);
    }
}