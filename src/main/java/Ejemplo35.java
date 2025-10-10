import java.util.Scanner;

public class Ejemplo35 {
    public static void main(String[] args)
    {
        int dividendo;
        int divisor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números");
        dividendo = sc.nextInt();
        divisor = sc.nextInt();

        // al dividendo le vamos restando el divisor siempre que el dividendo sea mayor que el divisor;
        // 10 % 2 -> 10 - 2 = 8 -> 8-2 = 6 -> 6 - 2 = 4 -> 4 - 2 = 2->2 - 2 = 0; Por tanto, el resto es 0
        // 7 % 2 -> 7 - 2 = 5 -> 5 - 2 = 3 -> 3 - 2 = 1; Por tanto, el resto es 1
        do{
            dividendo -= divisor;
        }while(dividendo >= divisor);

        System.out.println(dividendo);
	}

}