package ED_T6_RA04;

/**
 *
 * @author Felipe Navarro
 */
public class Tarea6EDClase {

    private final double descuentoSinProductos = 0.95;
    private final double descuentoMultiplesProductos = 0.8;
    private double precioTotal;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double descuento;
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        descuento = calcularDescuentoNumeroProductos(numProductos);
        precioTotal = precioProducto * descuento;
        System.out.println("El total a pagar es:" + precioTotal);
        System.out.println("Enviado");
    }

    public double calcularDescuentoNumeroProductos(int numProductos) {
        double descuento;

        if (numProductos != 0) {
            descuento = descuentoMultiplesProductos;
        } else {
            descuento = descuentoSinProductos;
        }
        return descuento;
    }
}
