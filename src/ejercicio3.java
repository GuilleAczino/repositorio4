import java.util.Scanner;

public class ejercicio3{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese numero del cual quiere el factorial: ");
        int numero=a.nextInt();
        System.out.println("El factorial de " + numero + " es: " +factorial(numero)); // Salida: El factorial de 5 es: 120
    }

    public static int factorial(int x){
        if (x == 0) {
            return 1;
        } else {
            // Paso recursivo: n! = n * (n-1)!
            return x * factorial(x - 1);
        }
    }
}
