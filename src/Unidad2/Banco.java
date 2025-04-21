package Unidad2;

import javax.swing.JOptionPane;

public class Banco {
    private int saldo;

    public Banco() {
        saldo = 0;
    }

    public void depositar(int cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            JOptionPane.showMessageDialog(null, "Depósito realizado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(int cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            JOptionPane.showMessageDialog(null, "Retiro realizado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes o cantidad inválida.");
        }
    }

    public void mostrarSaldo() {
        JOptionPane.showMessageDialog(null, "Su saldo actual es: " + saldo);
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        boolean salir = false;

        String titular = JOptionPane.showInputDialog("Digite su nombre:");
        String numeroCuentaStr = JOptionPane.showInputDialog("Digite su número de cuenta:");
        int numeroDeCuenta = Integer.parseInt(numeroCuentaStr);

        JOptionPane.showMessageDialog(null, "Bienvenido " + titular + " con número de cuenta: " + numeroDeCuenta);

        while (!salir) {
            String[] opciones = {"Mostrar saldo", "Depositar", "Retirar", "Salir"};
            int opcion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción:",
                "Menú del Banco",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            switch (opcion) {
                case 0:
                    banco.mostrarSaldo();
                    break;

                case 1:
                    String cantidadDepositoStr = JOptionPane.showInputDialog("Ingrese la cantidad a depositar:");
                    try {
                        int cantidadDeposito = Integer.parseInt(cantidadDepositoStr);
                        banco.depositar(cantidadDeposito);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
                    }
                    break;

                case 2:
                    String cantidadRetiroStr = JOptionPane.showInputDialog("Ingrese la cantidad a retirar:");
                    try {
                        int cantidadRetiro = Integer.parseInt(cantidadRetiroStr);
                        banco.retirar(cantidadRetiro);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
                    }
                    break;

                case 3:
                case -1:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    salir = true;
                    break;
            }
        }
    }
}