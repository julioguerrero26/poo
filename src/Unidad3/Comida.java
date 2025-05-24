package Unidad3;

import javax.swing.*;

public class Comida {
    public static void main (String[]args){

        String[][] Comidas = {

                {"Avena","Cereal","Huevo","Yogourt","Fruta","Pan tostado con aguacate","Hotcakes"},
                {"Pollo","Sandwich","Verduras","Atun","Bistec","Chapiñones","Espagueti"},
                {"Burritos","Quesadillas","Estofado","Picadillo","Lasaña","Ensalada","pizza"}

        };

        String ComidaLunes = Comidas[1][0];
        String ComidaMiercoles = Comidas[2][3];

        System.out.println("La cena del lunes es: "+ComidaLunes);
        System.out.println("La comida del miercoles es: "+ComidaMiercoles);
    }
}
