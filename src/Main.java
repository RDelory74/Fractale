
import campus.fractale.app.frame.RequstInt;
import campus.fractale.app.frame.Speed;
import campus.fractale.app.frame.Visualizer;


public class Main {
    public static void main(String[] args) {
        //Fenetre pour récupérer le nbr d'itérations
        RequstInt requstInt = new RequstInt();
        int iter = requstInt.getValeur();
        System.out.println(iter);

       /* Speed speed = new Speed();
        int delay = speed.getDelay();
        System.out.println(delay);
        */

        // Création de la frame
        Visualizer.createAndShowGUI(iter);
    }
}