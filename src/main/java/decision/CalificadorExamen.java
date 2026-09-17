package decision;

import java.util.Scanner;

public class CalificadorExamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota (0-10): ");
        double nota = sc.nextDouble();
        System.out.print("¿Has entregado todas las prácticas? (si/no): ");
        String practicas = sc.next();

        if (nota < 5) {
            System.out.println("Suspenso");
        } else if (practicas.equalsIgnoreCase("no")) {
            System.out.println("Suspenso por prácticas pendientes");
        } else if (nota < 7) {
            System.out.println("Aprobado");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }

        sc.close();
    }
}