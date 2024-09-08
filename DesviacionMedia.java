import java.util.Scanner;

public class DesviacionMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números:");
        int n = scanner.nextInt();
        double[] numeros = new double[n];
        double suma = 0;

        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextDouble();
            suma += numeros[i];
        }

        double media = suma / n;
        double sumaDesviaciones = 0;

        for (int i = 0; i < n; i++) {
            sumaDesviaciones += Math.abs(numeros[i] - media);
        }

        double desviacionMedia = sumaDesviaciones / n;
        System.out.println("La desviación media es: " + desviacionMedia);
    }
}
