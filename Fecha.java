import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D;
        int M;
        int A;
        System.out.print("Introduce el día: ");
        D = scanner.nextInt();

        System.out.print("Introduce el mes: ");
        M = scanner.nextInt();

        System.out.print("Introduce el año: ");
        A = scanner.nextInt();

        if (esFechaValida(D, M, A)) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha es incorrecta.");
        }
    }

    public static boolean esFechaValida(int D, int M, int A) {
        if (M < 1 || M > 12) {
            return false;
        }
        if (D < 1 || D > 30) {
            return false;
        }
        if (A < 0) {
            return false;
        }
        return true;
    }
}
