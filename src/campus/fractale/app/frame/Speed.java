package campus.fractale.app.frame;

import javax.swing.*;

public class Speed {

    private int delay;

    // Demande à l'utilisateur de choisir un délai
    public Speed() {
        this.delay = Integer.parseInt(JOptionPane.showInputDialog(null, "Choisissez la vitesse (en ms) :"));
    }

    // Retourne le délai choisi
    public int getDelay() {
        return this.delay;
    }
}
