package Unidad2;

import javax.swing.*;

public class Multiplo {
    public static void main (String[]args){
        double mayor,menor;

        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Dijite el primer numero"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Dijite el primer numero"));

        if (a > b){
            mayor=a;
            menor=b;
        } else {
            mayor=b;
            menor=a;
        }

        if (mayor % menor == 0){
            JOptionPane.showMessageDialog(null, mayor+" es multiplo de "+menor);
        } else {
            JOptionPane.showMessageDialog(null, mayor+"No es multiplo de "+menor);
        }
    }
}