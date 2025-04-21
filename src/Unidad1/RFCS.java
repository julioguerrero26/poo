package Unidad1;

import java.util.*;

public class RFCS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> rfcByMonth = new HashMap<>();
        String[] months = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};

        for (String month : months) {
            rfcByMonth.put(month, new ArrayList<>());
        }

        System.out.println("Ingrese 15 RFC's:");
        for (int i = 0; i < 15; i++) {
            String rfc;
            while (true) {
                System.out.print("RFC " + (i + 1) + ": ");
                rfc = scanner.nextLine().trim();
                if (rfc.length() == 12 && rfc.matches("[A-Z0-9]{12}")) {
                    break;
                }
                System.out.println("RFC inválido. Debe contener exactamente 12 caracteres alfanuméricos.");
            }

            String month = rfc.substring(5, 7);
            if (rfcByMonth.containsKey(month)) {
                rfcByMonth.get(month).add(rfc);
            } else {
                System.out.println("RFC con mes inválido: " + rfc);
            }
        }

        scanner.close();

        System.out.println("\nCantidad de RFCs por mes:");
        for (String month : months) {
            System.out.println("Mes " + month + ": " + rfcByMonth.get(month).size());
        }
    }
}

//? Juju Guerrero