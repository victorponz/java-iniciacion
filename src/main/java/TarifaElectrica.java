import java.util.Scanner;

public class TarifaElectrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el consumo mensual (kWh): ");
        double consumo = sc.nextDouble();
        double total;

        if (consumo <= 100) {
            total = consumo * 0.10;
        } else if (consumo <= 300) {
            total = 100 * 0.10 + (consumo - 100) * 0.15;
        } else {
            total = 100 * 0.10 + 200 * 0.15 + (consumo - 300) * 0.20;
        }

        System.out.printf("Importe a pagar: %.2f€%n", total);

        sc.close();
    }
}