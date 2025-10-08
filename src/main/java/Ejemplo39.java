import java.util.Scanner;
public class Ejemplo39 {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce 3 lados");
		int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int max;
        int lado1;
        int lado2;

        //Calcular el máximo
        max = Math.max(Math.max(a, b), c);
        
        //Comprobar si se puede formar un triágulo. No se puede formar si algún lado 
        //es mayor que la suma de los otros 2
        if (!((b + c > a ) || (a + c > b) || (a + b > c))){
            System.out.println("IMPOSIBLE");
        } else {
            //Vamos a ver qué numero de a, b o c es el mayor
            if (max == a){
                lado1 = b;
                lado2 = c;
            } else if (max ==  b){
                lado1 = a;
                lado2 = c;
            }else{
                lado1 = a;
                lado2 = b;
            }
            if (max * max < lado1 * lado1 + lado2 * lado2){
                System.out.println("ACUTÁNGULO");

            } else if (max * max == lado1 * lado1 + lado2 * lado2){
                 System.out.println("RECTÁNGULO");
            } else {
                 System.out.println("OBTUSANGULO");
            }
        }
    }
}