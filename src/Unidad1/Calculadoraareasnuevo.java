package Unidad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadoraareasnuevo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de figuras: ");
        int numeroFiguras = scanner.nextInt();
        double areaTotal = 0.0;
        List<Double> areas = new ArrayList<>();

        for (int i = 1; i <= numeroFiguras; i++) {
            System.out.println("\nFigura #" + i);
            System.out.print("Ingrese el tipo de figura (circulo, rectangulo, triangulo): ");
            String tipoFigura = scanner.next().toLowerCase();

            switch (tipoFigura) {
                case "circulo":
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    double areaCirculo = calcularAreaCirculo(radio);
                    areas.add(areaCirculo);
                    areaTotal += areaCirculo;
                    break;

                case "rectangulo":
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaRectangulo = scanner.nextDouble();
                    double areaRectangulo = calcularAreaRectangulo(baseRectangulo, alturaRectangulo);
                    areas.add(areaRectangulo);
                    areaTotal += areaRectangulo;
                    break;

                case "triangulo":
                    System.out.print("Ingrese la base del triángulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    double areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
                    areas.add(areaTriangulo);
                    areaTotal += areaTriangulo;
                    break;

                default:
                    System.out.println("Tipo de figura no válido. Intente nuevamente.");
                    i--;
                    break;
            }
        }

        System.out.println("\nTabla de áreas de las figuras:");
        System.out.println("+------------+------------+");
        System.out.println("| Figura #   | Área       |");
        System.out.println("+------------+------------+");
        for (int i = 0; i < areas.size(); i++) {
            System.out.printf("| %-10d | %-10.2f |\n", (i + 1), areas.get(i));
        }
        System.out.println("+------------+------------+");

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