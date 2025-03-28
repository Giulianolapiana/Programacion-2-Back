public class Ejercicio_13 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);

        // Modificar el precio de un producto específico
        precios[2] = 129.99; // Modificando el tercer producto

        System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0);
    }

    public static void mostrarPrecios(double[] precios, int index) {
        if (index < precios.length) {
            System.out.println("Precio: $" + precios[index]);
            mostrarPrecios(precios, index + 1); // Llamada recursiva
        }
    }
}