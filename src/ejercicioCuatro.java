import java.util.Scanner;

public class ejercicioCuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana");
        String dia = sc.nextLine().toLowerCase();

        if(dia.equals("sabado") || dia.equals("domingo")){
            System.out.println("Es fin de semana!!");
        }
        else{
            System.out.println("Es día de semana");
        }
    }
}
