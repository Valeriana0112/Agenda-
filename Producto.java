public class Producto{
    String nombre;
    int precio;
    int cantidad;
    int cambio;
    int total;
    public void mostrarNombre() {
        System.out.println("Producto: " + this.nombre);
    }
    public void mostrarPrecio() {
        System.out.println("Precio: " + this.precio);
    }
    public void mostrarCantidad() {
        System.out.println("Cantidad a recibir: " + this.cantidad);
    }
    public void mostrarCambio() {
        System.out.println("Cambio: "+ this.cambio);
    }
    public void mostrarTotal() {
        System.out.println("Total: " + this.total);
    }
}