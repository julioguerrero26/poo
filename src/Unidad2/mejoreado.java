package Unidad2;

import javax.swing.*;

public class mejoreado {
    public static void main(String[] args) {
        double mayor, menor;

        try {

            double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite el primer numero"));
            double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite el primer numero"));


            if (a > b) {
                mayor = a;
                menor = b;
            } else {
                mayor = b;
                menor = a;
            }

            if (a < 0 || b < 0){
                JOptionPane.showMessageDialog(null,"Error: debe agregar numeros positivos validos");
            }else if (mayor % menor == 0) {
                JOptionPane.showMessageDialog(null, mayor + " es multiplo de " + menor);
            }else {
                JOptionPane.showMessageDialog(null, mayor + "No es multiplo de " + menor);
            }


        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese números válidos.");
        }
    }
}