package Unidad3;

public class ArregloMulti {
    public static void main (String[]args){

        int[][] arr = { { 1, 2 }, { 3, 4 } };

        arr[0][0] = 3;
        arr[0][1] = 4;
        arr[1][0] = 8;
        arr[1][1] = 7;

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
