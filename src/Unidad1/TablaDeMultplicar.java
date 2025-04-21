package Unidad1;
import javax.swing.JOptionPane;

public class TablaDeMultplicar {
    public static void main (String []args) {
        double x;
        double numero1, numero2,numero3,numero4,numero5;
        double numero6, numero7, numero8,numero9, numero10;

        x=Double.parseDouble(JOptionPane.showInputDialog("inserta un valor"));

        numero1 = x*1;
        numero2 = x*2;
        numero3 = x*3;
        numero4 = x*4;
        numero5 = x*5;
        numero6 = x*6;
        numero7 = x*7;
        numero8 = x*8;
        numero9 = x*9;
        numero10 = x*10;

        JOptionPane.showMessageDialog(null, "Resultados:\n" +
                String.format("%.0f x 1 = %.0f\n", x, numero1) +
                String.format("%.0f x 2 = %.0f\n", x, numero2) +
                String.format("%.0f x 3 = %.0f\n", x, numero3) +
                String.format("%.0f x 4 = %.0f\n", x, numero4) +
                String.format("%.0f x 5 = %.0f\n", x, numero5) +
                String.format("%.0f x 6 = %.0f\n", x, numero6) +
                String.format("%.0f x 7 = %.0f\n", x, numero7) +
                String.format("%.0f x 8 = %.0f\n", x, numero8) +
                String.format("%.0f x 9 = %.0f\n", x, numero9) +
                String.format("%.0f x 10 = %.0f", x, numero10));
    }
}