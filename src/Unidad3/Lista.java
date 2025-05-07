package Unidad3;
import javax.swing.*;

public class Lista {
    public static void main (String[]args){
        int[] numeros = new int[]{1,2,3,4,5,6,7,8,9,10};
        int suma = 0;

        for (int numero : numeros){
            suma += numero;
        }

        double promedio = (double) suma / numeros.length;

        JOptionPane.showMessageDialog(null,"El promedio es: "+promedio);
    }
}
