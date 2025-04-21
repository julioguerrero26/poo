package Unidad2;

import javax.swing.*;

public class Prueba{
    public static void main(String[] args) {
        try {
            double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el primer número:"));
            double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el segundo número:"));
            double C = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el tercer número:"));

            double mayor, medio, menor;

            if (A >= B && A >= C) {
                mayor = A;
                if (B >= C) {
                    medio = B;
                    menor = C;
                } else {
                    medio = C;
                    menor = B;
                }
            } else if (B >= A && B >= C) {
                mayor = B;
                if (A >= C) {
                    medio = A;
                    menor = C;
                } else {
                    medio = C;
                    menor = A;
                }
            } else {
                mayor = C;
                if (A >= B) {
                    medio = A;
                    menor = B;
                } else {
                    medio = B;
                    menor = A;
                }
            }

            String message = String.format("Números Ordenados\n" +
                    "Mayor = "+mayor+"\n"+
                    "Medio = "+medio+"\n"+
                    "Menor = "+menor);
            JOptionPane.showMessageDialog(null, message);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese números válidos.");
        }
    }
}