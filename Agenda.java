import java.util.Scanner;
public class Agenda
{
	public static void main(String[] args) {
		String nombre;
		int telefono;
		int edad;
	Scanner sc =new Scanner (System.in);
		for(int i=0;i<=5;i++) {
		   System.out.println("Introducir nombre");
		   nombre= sc.nextLine();
		   System.out.println("Introducir teléfono"); 
		   telefono= sc.nextInt();
		   System.out.println("Introducir edad");
		   edad = sc.nextInt();
		   System.out.println("Contacto");
		   System.out.println("Nombre:"+ nombre);
		   System.out.println("Teléfono:" + telefono);
		   System.out.println("Edad:" + edad);
           System.exit(0);
		}
	}
}