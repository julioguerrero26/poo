package Unidad1;

import java.util.Scanner;

public class CalculadoraAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de figuras: ");
        int numeroFiguras = scanner.nextInt();
        double areaTotal = 0.0;

        for (int i = 1; i <= numeroFiguras; i++) {
            System.out.println("\nFigura #" + i);
            System.out.print("Ingrese el tipo de figura (circulo, rectangulo, triangulo): ");
            String tipoFigura = scanner.next().toLowerCase();

            switch (tipoFigura) {
                case "circulo":
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    areaTotal += calcularAreaCirculo(radio);
                    break;

                case "rectangulo":
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaRectangulo = scanner.nextDouble();
                    areaTotal += calcularAreaRectangulo(baseRectangulo, alturaRectangulo);
                    break;

                case "triangulo":
                    System.out.print("Ingrese la base del triángulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    areaTotal += calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
                    break;

                default:
                    System.out.println("Tipo de figura no válido. Intente nuevamente.");
                    i--;
                    break;
            }
        }

        System.out.printf("\nEl área total de las figuras es: %.2f\n", areaTotal);
        scanner.close();
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}

//? Juju Guerrero