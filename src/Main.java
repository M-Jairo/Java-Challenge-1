import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String de, a;
        int opcion;
        float monto;
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
                    System.out.println("Ingrese monto a combertir: ");
                    monto = teclado.nextInt();
                    Request.api(de, a, monto);
                    break;
                case 2:
                    de = "ARS";
                    a = "USD";
                    System.out.println("Ingrese monto a combertir: ");
                    monto = teclado.nextInt();
                    Request.api(de, a, monto);
                    break;
                case 3:
                    de = "USD";
                    a = "BRL";
                    System.out.println("Ingrese monto a combertir: ");
                    monto = teclado.nextInt();
                    Request.api(de, a, monto);
                    break;
                case 4:
                    de = "BRL";
                    a = "USD";
                    System.out.println("Ingrese monto a combertir: ");
                    monto = teclado.nextInt();
                    Request.api(de, a, monto);
                    break;
                case 5:
                    de = "USD";
                    a = "COP";
                    System.out.println("Ingrese monto a combertir: ");
                    monto = teclado.nextInt();
                    Request.api(de, a, monto);
                    break;
                case 6:
                    de = "COP";
                    a = "USD";
                    System.out.println("Ingrese monto a combertir: ");
                    monto = teclado.nextInt();
                    Request.api(de, a, monto);
                    break;
                case 7:
                    break;
            }
        } while (opcion != 7);

    }
}