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
        System.out.println(numveri);
        int n0=cedula.charAt(0)*2;
        int n1=cedula.charAt(1)*9;
        int n2=cedula.charAt(2)*8;
        int n3=cedula.charAt(3)*7;
        int n4=cedula.charAt(4)*6;
        int n5=cedula.charAt(5)*3;
        int n6=cedula.charAt(6)*4;
        int n7=n6+n5+n4+n3+n2+n1+n0;
        int n8=(n7%10)-10;
        if(n7%10==0){
            if(numveri==2){
                System.out.println("si");
                return true;
            }else{
                System.out.println("no");
                return false;
            }
        }
        if(n8 == numveri){
            System.out.println("SI");
            return true;
        }else{
            System.out.println("NO");
            return false;
        }
    }
}

