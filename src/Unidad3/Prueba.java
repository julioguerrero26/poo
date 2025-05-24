package Unidad3;

public class Prueba {
    public static void main (String[]args){
        int[][] arr;

        //! [cantidad de renglones] [cantidad de columnas]
        arr = new int[3][3];

        //? renglon 1
        arr[0][0] = 3;
        arr[0][1] = 4;
        arr[0][2] = 5;

        //? renglon 2
        arr[1][0] = 8;
        arr[1][1] = 7;
        arr[1][2] = 9;

        //? renglon 3
        arr[2][0] = 3;
        arr[2][1] = 7;
        arr[2][2] = 4;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}