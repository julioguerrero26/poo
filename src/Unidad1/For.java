package Unidad1;

import javax.swing.*;

public class For {
    public static void main (String[]args){
        int a;
        int Resultado;
        a = Integer.parseInt(JOptionPane.showInputDialog("Dijita un numero: "));

        System.out.println("Tabla de multiplicar del: "+a);
        for (int i=1;i<=10;i++){
            Resultado=a*i;
            System.out.println(a+"x"+i+"="+Resultado);
        }
    }
}