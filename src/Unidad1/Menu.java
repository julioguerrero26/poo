package Unidad1;

import javax.swing.*;

public class Menu {
    public static void main (String[]args){
        int menu;
        menu = Integer.parseInt(JOptionPane.showInputDialog(null, """
                Selecciona una opcion
                1.- Par e Impar
                2.- Solicitud
                3.- Division
                4.- Edad
                5.- Menor y Mayor
                6.- Del 1 al 50
                7.- Suma y Promedio
                8.- Ejercicio 1
                9.- Factorial
                10.- For
                """));

        switch (menu){
            case 1:
                int x;

                x = Integer.parseInt(JOptionPane.showInputDialog("Dijita un numero entero"));

                if (x % 2 == 0) {
                    JOptionPane.showMessageDialog(null,"el numero es par");
                } else {
                    JOptionPane.showMessageDialog(null, "El numero es impar");
                }
                break;

            case 2:
                Object[] opciones = {"Masculino", "Femenino"};
                int edad, genero, nota;

                nota = Integer.parseInt(JOptionPane.showInputDialog("Dijita tu nota: "));
                edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Dijita tu edad: "));
                genero = JOptionPane.showOptionDialog(
                        null,
                        "¿Cuál es tu género?",
                        "Selecciona una opcion",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]
                );

                if (genero == JOptionPane.YES_OPTION && edad >= 18 && nota >= 5) {
                    JOptionPane.showMessageDialog(null, "Posible. ");
                } else if (genero == JOptionPane.NO_OPTION && edad >= 18 && nota >= 5) {
                    JOptionPane.showMessageDialog(null,"Aceptada.");
                } else {
                    JOptionPane.showMessageDialog(null, "No aceptado.");
                }
                break;

            case 3:
                double a, b;
                double div;

                a = Double.parseDouble(JOptionPane.showInputDialog("Dijita tu primer numero: "));
                b = Double.parseDouble(JOptionPane.showInputDialog("Dijita tu segundo numero: "));

                if (a == 0 || b == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
                } else {
                    div = a / b;
                    JOptionPane.showMessageDialog(null, String.format("Los resultados son: " + "%.3f", div));
                }
                break;

            case 4:
                double edad1;

                edad1 =Double.parseDouble(JOptionPane.showInputDialog("Dijita Tu Edad: "));

                if (edad1 >= 18) {
                    JOptionPane.showMessageDialog(null,"Eres mayor de edad ");
                } else {
                    JOptionPane.showMessageDialog(null,"No eres mayor de edad ");
                }
                break;

            case 5:
                double x1, y;

                x1 =Double.parseDouble(JOptionPane.showInputDialog("Dijita un numero"));
                y =Double.parseDouble(JOptionPane.showInputDialog("Dijita un numero"));

                if (x1 == y) {
                    JOptionPane.showMessageDialog(null,x1+" es mayor que "+y);
                } else {
                    JOptionPane.showMessageDialog(null,y+" es mayor que "+x1);
                }
                break;

            case 6:
                for (int i=1;i<=50;i++){
                    System.out.println(i);
                }
                break;

            case 7:
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
                break;

            case 8:
                double numero;
                int factorial1;

                factorial1 = 1;

                numero=Double.parseDouble(JOptionPane.showInputDialog("Dijita un numero"));

                for (int i = 1; i <= numero; i++){
                    factorial1*=i;
                }
                break;

            case 9:
                int a1;

                a1 = Integer.parseInt(JOptionPane.showInputDialog("Dijita un numero: "));

                long factorial = 1;
                for (int i = 1; i <= a1; i++) {
                    factorial *= i;
                }
                JOptionPane.showMessageDialog(null, "El factorial de " + a1 + " es: " + factorial);
                break;

            case 10:
                int a2;
                int Resultado;
                a2 = Integer.parseInt(JOptionPane.showInputDialog("Dijita un numero: "));

                System.out.println("Tabla de multiplicar del: "+a2);
                for (int i=1;i<=10;i++){
                    Resultado=a2*i;
                    System.out.println(a2+"x"+i+"="+Resultado);
                }
                break;
        }
    }
}