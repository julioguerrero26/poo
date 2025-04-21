package Unidad1;import javax.swing.JOptionPane;

public class Calculadora{
    public static void main (String []args) {
        double x, y;
        double suma, resta, div,mult;

        x=Double.parseDouble(JOptionPane.showInputDialog("inserta un valor"));
        y=Double.parseDouble(JOptionPane.showInputDialog("inserta otro valor"));

        suma=x+y;
        resta=x-y;
        div=x/y;
        mult=x*y;

        JOptionPane.showMessageDialog(null,"el resultado de la suma es:\n" +suma);
        JOptionPane.showMessageDialog(null,"el resultado de la resta  es:\n" +resta);
        JOptionPane.showMessageDialog(null,"el resultado de la division es:\n" +div);
        JOptionPane.showMessageDialog(null,"el resultado de la multiplicacion es:\n"+mult);
                }
}