import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, soy una calculadora. Realizaré la operación que desees");
        System.out.println("Ingresa primer número");
        int num1 = sc.nextInt();
        System.out.println("Ingresa segundo número");
        int num2 = sc.nextInt();
        System.out.println("Introduce un número entre 1 y 4: \n 1 suma, 2 resta, 3 multiplicaión o 4 división");
        int operacion = sc.nextInt();

        if (operacion == 1){
            System.out.println("El resultado de la suma es " + (num1+num2));
        }
        else if (operacion == 2){
            System.out.println("El resultado de la resta es " + (num1-num2));
        }
        else if (operacion == 3){
            System.out.println("El resultado de la multiplicación es " + (num1*num2));
        }
        else if (operacion == 4){
            System.out.println("El resultado de la división es " + ((double)num1/num2));
        }
        else{
            System.out.println("Operación inválida, loser, te dije entre 1 y 4");
        }
    }
}
