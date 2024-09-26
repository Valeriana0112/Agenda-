import java.util.Scanner;

public class Orden_Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        System.out.println("Ingresa un nùmero:");
        n1 = sc.nextInt();
        System.out.println("Ingresa otro nùmero:");
        n2 = sc.nextInt();
        System.out.println("Ingresa otro nùmero:");
        n3 = sc.nextInt();
        int orden;
        if (n1 < n2) {
            orden = n1;
            n1 = n2;
            n2 = orden;
        }
        if (n1 < n3) {
            orden = n1;
            n1 = n3;
            n3 = orden;
        }
        if (n2 < n3) {
            orden = n2;
            n2 = n3;
            n3 = orden;
        }
        System.out.println("Los numeros ordenandos de mayor a menor son:" + n1 + "," + n2 + "," + n3);
    }
}
