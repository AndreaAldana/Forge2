import java.util.Scanner;

public class ejercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer texto");
        String texto1 = sc.nextLine();
        System.out.println("Ingrese segundo texto");
        String texto2 = sc.nextLine();

        if (texto1.length() > texto2.length()) {
            System.out.println("El texto con mayor cantidad de carácteres es " + texto1);
        }
        else if (texto2.length() > texto1.length()){
            System.out.println("El texto con mayor cantidad de carácteres es " + texto2);
        }
        else {
            System.out.println("Contienen la misma cantidad de carácteres");

        }
    }

}
