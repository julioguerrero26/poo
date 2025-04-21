package Unidad1;

import javax.swing.*;

public class division {
    public static void main(String[] args) {
        double a, b;
        double div;

        a = Double.parseDouble(JOptionPane.showInputDialog("Dijita tu primer numero: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Dijita tu segundo numero: "));

        if (a == 0 || b == 0) {
            JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
        } else {
            div = a / b;
            JOptionPane.showMessageDialog(null, String.format("Los resultados son: " + "%.3f", div));
        }
    }
}