import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Opcion 1");
            System.out.println("Opcion 2");
            System.out.println("Opcion 3");
            System.out.println("Opcion 4");
            System.out.println("Opcion 5");
            System.out.println("Opcion 6");
            System.out.println("Opcion 7");
            System.out.println("Seleccione opcion: ");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("a");
                    break;
                case 2:
                    System.out.println("a");
                    break;
                case 3:
                    System.out.println("a");
                    break;
                case 4:
                    System.out.println("a");
                    break;
                case 5:
                    System.out.println("a");
                    break;
                case 6:
                    System.out.println("a");
                    break;
                case 7:
                    break;
            }
        } while (opcion != 7);

    }
}