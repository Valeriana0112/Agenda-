import java.util.Scanner;

public class Diferencia_de_fechas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia1;
        int mes1;
        int año1;
        int dia2;
        int mes2;
        int año2;
        System.out.print("Introduce el día de la primera fecha: ");
        dia1 = scanner.nextInt();

        System.out.print("Introduce el mes de la primera fecha: ");
        mes1 = scanner.nextInt();

        System.out.print("Introduce el año de la primera fecha: ");
        año1 = scanner.nextInt();

        System.out.print("Introduce el día de la segunda fecha: ");
        dia2 = scanner.nextInt();

        System.out.print("Introduce el mes de la segunda fecha: ");
        mes2 = scanner.nextInt();

        System.out.print("Introduce el año de la segunda fecha: ");
        año2 = scanner.nextInt();

        if (esFechaValida(dia1, mes1, año1) && esFechaValida(dia2, mes2, año2)) {
            int diferenciaDias = calcularDiferenciaDias(dia1, mes1, año1, dia2, mes2, año2);
            System.out.println("La diferencia en días entre las dos fechas es: " + diferenciaDias);
        } else {
            System.out.println("Una o ambas fechas introducidas son incorrectas.");
        }
    }

    public static boolean esFechaValida(int dia, int mes, int año) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > 30) {
            return false;
        }
        if (año < 0) {
            return false;
        }
        return true;
    }

    public static int calcularDiferenciaDias(int dia1, int mes1, int año1, int dia2, int mes2, int año2) {
        int totalDias1 = dia1 + (mes1 - 1) * 30 + (año1 * 360);
        int totalDias2 = dia2 + (mes2 - 1) * 30 + (año2 * 360);
        return Math.abs(totalDias2 - totalDias1);
    }
}
