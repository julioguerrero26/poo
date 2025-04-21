package Unidad1;

import javax.swing.*;

public class MenorMayor {
    public static void main (String []args) {
        double x, y;

        x =Double.parseDouble(JOptionPane.showInputDialog("Dijita un numero"));
        y =Double.parseDouble(JOptionPane.showInputDialog("Dijita un numero"));

        if (x == y) {
            JOptionPane.showMessageDialog(null,x+" es mayor que "+y);
        } else {
            JOptionPane.showMessageDialog(null,y+" es mayor que "+x);
        }
    }
}