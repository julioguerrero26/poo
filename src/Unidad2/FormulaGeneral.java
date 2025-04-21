package Unidad2;
import javax.swing.*;

public class FormulaGeneral {
    public static void main ( String[]args ){

        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Dame el valor de a: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Dame el valor de b: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Dame el valor de c: "));

        double Raiz = Math.pow(b, 2) - 4 * a * c;

        double x1 = (-b + Math.sqrt(Raiz)) / (2 * a);
        double x2 = (-b - Math.sqrt(Raiz)) / (2 * a);

        String mensaje = String.format("Resultados:\nx1 = %.2f\nx2 = %.2f", x1, x2);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}