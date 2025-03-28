public class Ejercicio_12 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}