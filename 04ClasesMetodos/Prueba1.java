   import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        int total;

        do {

            try {

                System.out.print("Introduce numero 1: ");
                numero1 = sc.nextInt();

                System.out.print("Introduce numero 2: ");
                numero2 = sc.nextInt();

            } catch (Exception ex) {

                System.out.println("No es un numero. Toma como valor 0. Repite");

                numero1 = 0;
                numero2 = 0;
                sc.nextLine();
            }

            total = numero1 + numero2;

            System.out.println("Total: " + total);

        } while (total <= 0);

    }
}