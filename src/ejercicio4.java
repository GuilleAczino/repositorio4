import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese numero base: ");
        int n=a.nextInt();
        MostrarNumeros(n);
    }

    public static int MostrarNumeros(int a){
       if(a==0) {
           return 0;
       }else{
           System.out.println(a);
           return MostrarNumeros(a - 1);
       }
    }
}
