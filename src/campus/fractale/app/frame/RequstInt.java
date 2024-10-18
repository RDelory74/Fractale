package campus.fractale.app.frame;

import javax.swing.*;

public class RequstInt {

    private int valeur;

    public RequstInt() {
        this.valeur = Integer.valueOf(JOptionPane.showInputDialog(null, "Nombre: "));
    }

    public int getValeur() {
        return this.valeur;
    }
}
