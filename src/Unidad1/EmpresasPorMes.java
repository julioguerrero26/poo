package Unidad1;

public class EmpresasPorMes {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        String[] rfcs = new String[]{
                "ABC240101234",
                "DEF240201654",
                "GHI240301DFT",
                "JKL240401IT5",
                "MN0240501KDF",
                "PQR240601ABC",
                "STU240701DEF",
                "VQX240801UC3",
                "YZA240901235",
                "BCD241001750",
                "EFG241101356",
                "HIJ241201EU9",
                "KLM240101BAZ",
                "NOP240201BBV",
                "QRS240301AZT",
        };

        int[] months = new int[12]; // 0 = enero, 11 = diciembre

        for (String rfc : rfcs) {
            String monthStr = rfc.substring(5, 7);
            int month = Integer.parseInt(monthStr);

            if (month >= 1 && month <= 12) {
                months[month - 1]++;
            }
        }

        for (int i = 0; i < 12; i++) {
            System.out.println("En el mes " + (i + 1) + ", se registraron " + months[i] + " RFC's");
        }

        long endTime = System.nanoTime();
        double totalTimeSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("El código se ejecutó en " + totalTimeSeconds + " segundos");
    }
}

//? Juju Guerrero