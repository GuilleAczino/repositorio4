import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num=a.nextInt();
        if(entero(num)){
            System.out.println("¿Es par? true");
        }else {
            System.out.println("¿Es par? false");
        }
    }

   public static boolean entero(int x){
        if(x%2==0){
            return true;
        }
        else {
            return false;
        }
    }

}
