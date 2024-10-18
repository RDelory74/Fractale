package campus.fractale.app.frame;


import javax.swing.*;


public class Visualizer {


    public static String length;
    private JFrame frame;



    public void Visualiser(){
        JFrame frame = new JFrame("Iter request");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("How many iterations?");
        frame.getContentPane().add(label);


        frame.pack();
        frame.setVisible(true);
    }
}
