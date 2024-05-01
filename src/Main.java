import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String de;
        String a;
        int opcion;
        do {
            System.out.println("Opcion 1 Dolar a Peso arg");
            System.out.println("Opcion 2 Peso arg a Dolar");
            System.out.println("Opcion 3 Dolar a Real Brasilero");
            System.out.println("Opcion 4 Real Brasilero a Dolar" );
            System.out.println("Opcion 5 Dolar a Peso Colombiano");
            System.out.println("Opcion 6 Peso Colombiano a Dolar");
            System.out.println("Opcion 7 Salir");
            System.out.println("Seleccione opcion: ");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    de = "USD";
                    a = "ARS";
                    Request.api(de, a);
                    break;
                case 2:
                    de = "ARS";
                    a = "USD";
                    Request.api(de, a);
                    break;
                case 3:
                    de = "BRL";
                    a = "USD";
                    Request.api(de, a);
                    break;
                case 4:
                    de = "USD";
                    a = "BRL";
                    Request.api(de, a);
                    break;
                case 5:
                    de = "USD";
                    a = "COP";
                    Request.api(de, a);
                    break;
                case 6:
                    de = "COP";
                    a = "USD";
                    Request.api(de, a);
                    break;
                case 7:
                    break;
            }
        } while (opcion != 7);

    }
}