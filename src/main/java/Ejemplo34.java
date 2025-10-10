import java.util.Scanner;

public class Ejemplo34 {
    public static void main(String[] args)
    {
        int multiplicando;
        int multiplicador;
        int resultado = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba dos números");
        multiplicando = sc.nextInt();
        multiplicador = sc.nextInt();

        //Vamos sumando n veces el multiplicador, y lo acumulamos en resultado, que se inicializa a 0
        // en la multiplicación de 10 * 5, 10 es el multiplicando y 5 es el multiplicador
        for (int i = 1; i <= multiplicador; i++){
            resultado += multiplicando;
        }
        System.out.println(resultado);
	}

}