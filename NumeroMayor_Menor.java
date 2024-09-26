import java.util.Scanner;

public class NumeroMayor_Menor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Introduce un nùmero entero");
        n1 = teclado.nextInt();
        System.out.println("Introduce otro numero entero");
        n2 = teclado.nextInt();
        if (n1 == n2)
            System.out.println("Los numero son iguales");
        else {

            if (n1 > n2)
                System.out.println("El " + n1 + " es mayor que " + n2);
            else
                System.out.println("El " + n2 + " es mayor que  " + n1);

        }
    }
}
