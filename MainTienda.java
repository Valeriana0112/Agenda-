import java.util.Scanner;

public class MainTienda {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("introduzce nombre del producto ");
        String nombre = reader.next();
        System.out.println("introduzce tu precio");
        int precio = reader.nextInt();
        System.out.println("introduce cantidad");
        int cantidad = reader.nextInt();
        int total;
        total = precio;
        int cambio;
        cambio = precio - cantidad;
        Producto p1 = new Producto();
        p1.nombre = nombre;
        p1.precio = precio;
        p1.cantidad = cantidad;
        p1.cambio = cambio;
        p1.total = total;
        p1.mostrarNombre();
        p1.mostrarPrecio();
        p1.mostrarCantidad();
        p1.mostrarCambio();
        p1.mostrarTotal();
    }
}