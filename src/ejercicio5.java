import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese su cedula: ");
        String cedula=a.nextLine();
        if(cedula.length()==8){
            if(VerificarCedula(cedula)){
                System.out.println("La cedula es vialida");
            }else{
                System.out.println("La cedula no es valida");
            }
        }
    }
    public static boolean VerificarCedula(String cedula){
        char numv=cedula.charAt(7);
        int numveri=Character.getNumericValue(numv);
        int n0= Character.getNumericValue(cedula.charAt(0))*2;
        int n1= Character.getNumericValue(cedula.charAt(1))*9;
        int n2= Character.getNumericValue(cedula.charAt(2))*8;
        int n3= Character.getNumericValue(cedula.charAt(3))*7;
        int n4= Character.getNumericValue(cedula.charAt(4))*6;
        int n5= Character.getNumericValue(cedula.charAt(5))*3;
        int n6= Character.getNumericValue(cedula.charAt(6))*4;
        int n7=n6+n5+n4+n3+n2+n1+n0;
        int n8=(n7%10)-10;
        if(n7%10==0){
            if(numveri==2){
                return true;
            }else{
                return false;
            }
        }
        if(n8 == numveri){
            return true;

        }else{
            return false;
        }
    }
}

