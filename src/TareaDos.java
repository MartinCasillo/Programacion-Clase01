import java.util.Scanner;

public class TareaDos {
    public static void main(String[] args){
        int numero = 0;

        do{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese una opcion (1-Compras,2-Ventas,3-Reclamos,4-Salir)");

            numero = scanner.nextInt();

            switch (numero) {
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
        }
        while(numero != 4);
    }
}
