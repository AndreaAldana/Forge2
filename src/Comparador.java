import java.util.Scanner;

public class Comparador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int x = sc.nextInt();
        if(x>0){
            System.out.println("El valor es mayor a 0");

        }else{
            System.out.println("El valor es menor o igual a 0");

        }
    }
}
