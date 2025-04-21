package Unidad1;

import javax.swing.JOptionPane;

public class SumaYPromedio {
    public static void main(String[] args) {
        double[] valores = new double[10];

        for (int i = 0; i < valores.length; i++) {
            String input = JOptionPane.showInputDialog(
                    null,
                    "Ingrese el valor " + (i + 1) + ":",
                    "Entrada de datos",
                    JOptionPane.QUESTION_MESSAGE
            );
            valores[i] = Double.parseDouble(input);
        }
        double suma = 0;
        for (double valor : valores) {
            suma += valor;
        }

        double promedio = suma / valores.length;

        JOptionPane.showMessageDialog(
                null,
                "La suma de los valores es: " + suma + "\nEl promedio de los valores es: " + promedio,
                "Resultados",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}