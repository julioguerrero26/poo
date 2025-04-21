package Unidad2;

import javax.swing.*;

public class CompararNumeros {
    public static void main(String[] args) {
        double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el primer número:"));
        double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el segundo número:"));
        double C = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el tercer número:"));

        double mayor = 0, medio = 0, menor = 0;

        try {
            if (A == B && B == C) {
                JOptionPane.showMessageDialog(null, "Todos son iguales");
                mayor = medio = menor = A;
            }
            else {
                mayor = Math.max(A, Math.max(B, C));
                menor = Math.min(A, Math.min(B, C));
                medio = (A + B + C) - mayor - menor;

                if (mayor == A && menor == C) {
                    JOptionPane.showMessageDialog(null, A + " es mayor que " + C);
                } else if (mayor == B && menor == A) {
                    JOptionPane.showMessageDialog(null, "B es mayor");
                } else {
                    JOptionPane.showMessageDialog(null, "No son iguales");
                }
            }

            String message = String.format("Números Ordenados\n" +
                    "Mayor = " + mayor + "\n" +
                    "Medio = " + medio + "\n" +
                    "Menor = " + menor);
            JOptionPane.showMessageDialog(null, message);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese números válidos.");
        }
    }
}