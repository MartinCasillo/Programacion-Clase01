import java.util.Scanner;

public class Tarea {
    public static void main(String[] args){
        int opcion = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una opcion (1-Compras,2-Ventas,3-Reclamos,4-Salir)");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Usted ingreso a Compras");
                break;
            case 2:
                System.out.println("Usted ingreso a Ventas");
                break;
            case 3:
                System.out.println("Usted ingreso a Reclamos");
                break;
            case 4:
                System.out.println("Usted salio del programa");
                break;
        };

        System.out.println("Su opción es: " + opcion );
    }
}
