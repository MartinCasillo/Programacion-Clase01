import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema");

        int opcion = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una opcion (1-Compras,2-Ventas,3-Reclamos,4-Salir)");

        opcion = scanner.nextInt();

        System.out.println("Su opción es: " + opcion );
    }
}