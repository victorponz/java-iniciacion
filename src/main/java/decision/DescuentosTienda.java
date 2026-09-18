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
            // Fijaos que primero empezamos por el de más valor porque estamos usando > (mayor)
            if (importe > 100) {
                descuento = 0.15;
            } else if (importe > 50) {
                descuento = 0.10;
            }
            /* Esta sería la versión de menor a mayor
            if (importe <= 50) {
                descuento = 0;
            }else if (importe <= 100) {
                descuento = 0.1;
            }else{
                descuento = 0.15;
            }
            */
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