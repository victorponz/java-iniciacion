package decision;

import java.util.Scanner;

public class DescuentosTienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el importe de la compra: ");
        double importe = sc.nextDouble();
        System.out.print("¿Eres socio? (si/no): ");
        String esSocio = sc.next();
        double descuento = 0;

        if (esSocio.equalsIgnoreCase("si")) {
            if (importe > 100) {
                descuento = 0.15;
            } else if (importe > 50) {
                descuento = 0.10;
            }
        } else {
            if (importe > 50) {
                descuento = 0.05;
            }
        }

        double importeFinal = importe - (importe * descuento);
        System.out.printf("Importe final: %.2f€%n", importeFinal);

        sc.close();
    }
}