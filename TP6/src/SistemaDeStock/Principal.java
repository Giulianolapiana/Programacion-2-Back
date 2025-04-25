package SistemaDeStock;

public class Principal {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();//creamos el inventario
        // cargamos productos
        Producto p = new Producto("1234","julian",2.2,4,CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("P002", "Notebook Lenovo", 250000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Zapatillas", 18000, 20, CategoriaProducto.ROPA);
        // cargamos inventario

        inventario.agregarProducto(p);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);

        System.out.println("📦 Inventario de productos:");
        inventario.listarProductos();
        System.out.println("\n🔍 Buscar producto por ID :");
        Producto buscado = inventario.buscarProductoPorId("1234");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        System.out.println(" ----------------------------- ");
        //eliminar producto
        inventario.eliminarProducto("1234");
        inventario.listarProductos();
        System.out.println(" ----------------------------- ");
        //actualizar stock
        inventario.actualizarProductos("P003",999);
        inventario.listarProductos();
        System.out.println(" ----------------------------- ");
    }
}
