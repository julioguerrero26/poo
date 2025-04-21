package Unidad2;

import javax.swing.JOptionPane;

public class SalaDeJuegos {
    public static void main(String[] args) {

        try {
            String input = JOptionPane.showInputDialog(null, "Ingrese su edad:");

            if (input == null || input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se ingresó ninguna edad");
                return;
            }

            //? Convierte el String a Int
            int edad = Integer.parseInt(input.trim());

            //! operador ternario
            String mensaje = edad <= 0 ? "Error la edad no puede ser "+edad : edad <= 4 ? "El precio es Gratis" : edad <= 18 ? "El precio es $5" : "El precio es $10";

            JOptionPane.showMessageDialog(null,mensaje);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido para la edad");
        }
    }
}