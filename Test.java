import java.util.Scanner;
import java.util.scanner;
class Test {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        int x;
        do {
             int r = 1;
             System.out.println("Operaciones");
             System.out.println();
             System.out.println("Elige una opcion");
             System.out.println("1.Area del triangulo");
             System.out.println("2.Perimetro de un cuadrado");
             System.out.println("3.Circunferencia de un circulo");
             System.out.println("o.cerrar");
             x = sc.nextInt();
             if (x== 1) {
                System.out.println("Ingresa un numero entero:");
                int y = sc.nextInt();
                System.out.println("Ingresa otro numero entero:");
                int z = sc.nextInt();
                double area=(y *z )/2;
                System.out.println("Resultado:"+ area);
             } else if (x == 2) {
                System.out.println("Ingresa un numero entero:");
                int a = sc.nextInt();
                System.out.println("Ingresa otro numero entero:");
                int b = sc.nextInt();
                double area = a * b;
                System.out.println("Resultado"+ area);
             } else if (x ==3) {
                System.out.println("Ingresa un numero entero:");
                int d = sc.nextInt();
                double circunferencia = 2 * Math.PI *d;
                System.out.println("Resultado:" + circunferencia);
             }
             System.out.println();
            } while (x!=0);
             }
            }


        
        


    
