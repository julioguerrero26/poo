package Unidad2;

import java.util.Scanner;

public class Persona {
    private String name;
    private int age;
    private String curp;

    public Persona() {
        this.name = "";
        this.age = 0;
        this.curp = "";
    }

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        this.name = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        this.age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la CURP: ");
        this.curp = scanner.nextLine();
    }

    public void mostrarInformacion() {
        System.out.println("\nInformación de la persona:");
        System.out.println("Nombre: " + this.name);
        System.out.println("Edad: " + this.age);
        System.out.println("CURP: " + this.curp);
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.ingresarDatos();
        persona1.mostrarInformacion();
    }
}

//? Juju guerrero