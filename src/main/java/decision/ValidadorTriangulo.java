package decision;

import java.util.Scanner;

public class ValidadorTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el lado A: ");
        double ladoA = sc.nextDouble();
        System.out.print("Introduce el lado B: ");
        double ladoB = sc.nextDouble();
        System.out.print("Introduce el lado C: ");
        double ladoC = sc.nextDouble();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triángulo equilátero");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Triángulo isósceles");
            } else {
                System.out.println("Triángulo escaleno");
            }
        } else {
            System.out.println("No es un triángulo válido");
        }

        sc.close();
    }
}