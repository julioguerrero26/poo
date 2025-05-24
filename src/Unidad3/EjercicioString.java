package Unidad3;

public class EjercicioString {
    public static void main (String[]args){
        String[][] arr = new String[2][2];

        arr[0][0] = "juju";
        arr[0][1] = "lalito";
        arr[1][0] = "ali";
        arr[1][1] = "jose";

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
