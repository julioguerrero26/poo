package Unidad1;

import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {
        int a;

        a = Integer.parseInt(JOptionPane.showInputDialog("Dijita un numero: "));

        long factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + a + " es: " + factorial);
    }
}