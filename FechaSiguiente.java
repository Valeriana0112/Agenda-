import java.util.Scanner;

public class FechaSiguiente {
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
            int[] siguienteFecha = obtenerFechaSiguiente(D, M, A);
            System.out.println("La fecha del día siguiente es: " + siguienteFecha[0] + "/" + siguienteFecha[1] + "/"
                    + siguienteFecha[2]);
        } else {
            System.out.println("La fecha introducida es incorrecta.");
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

    public static int[] obtenerFechaSiguiente(int dia, int mes, int año) {
        dia++;
        if (dia > 30) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }
        return new int[] { dia, mes, año };
    }
}
