import java.util.Scanner;

public class Numero_de_cifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número:");
        int numero = scanner.nextInt();
        // Se establece las condiciones con if y else
        if (numero >= 0 && numero <= 9) {
            System.out.println("El número tiene 1 cifra.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El número tiene 2 cifras.");
        } else if (numero >= 100 && numero <= 999) {
            System.out.println("El número tiene 3 cifras.");
        } else if (numero >= 1000 && numero <= 9999) {
            System.out.println("El número tiene 4 cifras.");
        } else {

        }
    }
}
