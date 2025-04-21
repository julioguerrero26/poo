package Unidad2;

import javax.swing.*;

public class Division {
    public static void main (String[]args){
        double resultado,resta;

        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Dijite el año actual"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Dijite un año al azar"));

        if (b < a){
            resultado = a-b;
            JOptionPane.showMessageDialog(null, "An pasado "+resultado+" años desde "+b);
        } else if (a < b){
            resta = a-b;
            resultado = resta*-1;
            JOptionPane.showMessageDialog(null,"Faltan "+resultado+" años para "+b);
        } else {
            JOptionPane.showMessageDialog(null,"los años son iguales");
        }
    }
}
