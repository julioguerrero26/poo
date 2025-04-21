package Unidad1;

import javax.swing.*;

public class ParImpar {
    public static void main(String[] args) {
        int x;

        x = Integer.parseInt(JOptionPane.showInputDialog("Dijita un numero entero"));

        if (x % 2 == 0) {
            JOptionPane.showMessageDialog(null,"el numero es par");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es impar");
        }
    }
}