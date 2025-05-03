import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int[] array=new int[5];
        int num;
        for(int i=0;i<5;i++){
            System.out.println("Ingrese un numero: ");
            num=a.nextInt();
            array[i]=num;
        }
        System.out.println("El numero mayor de los 5 es: "+BuscarMayor(array));
    }

    public static int BuscarMayor(int[] array){
        int mayor=0;
        for(int i=0;i<5;i++){
            if(mayor<array[i]){
                mayor=array[i];
            }
            }
        return mayor;
    }
}
