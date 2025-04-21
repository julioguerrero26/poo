package Unidad2;

import javax.swing.*;

public class Examen {
    public static void main (String[]args){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Dijita A"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Dijita B"));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null,"Dijita C"));

        double fraccion1 = (25*Math.pow(a,2)/(Math.pow(c,2)*b));
        double fraccion2 = (Math.sqrt(5*a*Math.pow(c,2))/(4*Math.pow(b,3)));

        double formula = fraccion1-fraccion2;

        JOptionPane.showMessageDialog(null,"El resultado es:"+formula);
    }
}