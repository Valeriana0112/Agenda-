import java.util.Scanner;
public class DesviacionEstandar {
    public static void main(String[] args) {
        int numero;
        Scanner sc =new Scanner (System.in);
        System.out.println("Ingresa el valor de la media:");
        numero = sc.nextInt();
        System.out.println("Ingresa el valor de la varianza:");
        numero = sc.nextInt();
         double raizCuadrada = Math.sqrt(numero);
        System.out.println("La Desviacion Estandar es:" + raizCuadrada);
        System.exit(0);
    }
}