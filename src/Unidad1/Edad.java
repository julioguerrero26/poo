package Unidad1;

import javax.swing.*;

public class Edad {
    public static void main (String []args) {
        double edad;

        edad =Double.parseDouble(JOptionPane.showInputDialog("Dijita Tu Edad: "));

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null,"Eres mayor de edad ");
        } else {
            JOptionPane.showMessageDialog(null,"No eres mayor de edad ");
        }
    }
}
