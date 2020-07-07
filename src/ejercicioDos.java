import java.util.Scanner;

public class ejercicioDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anho = sc.nextInt();

        if(anho>2005){
            System.out.println("Aún no han pasado ni 15 años");
        }
        else if (anho == 2020){
            System.out.println("Es el mismo año");
        }else{
            System.out.println("Han pasado al menos 15 años");
        }
    }
}
