package Unidad1;
import javax.swing.*;

public class Solicitud {
    public  static void main (String[]args){
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
    }
}