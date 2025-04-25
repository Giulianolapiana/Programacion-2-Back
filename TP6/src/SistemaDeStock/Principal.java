package SistemaDeStock;

public class Principal {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();//creamos el inventario
        // cargamos productos
        Producto p = new Producto("1234","julian",2.2,4,CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("P002", "Notebook Lenovo", 2500, 1000, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Zapatillas", 180000, 20, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P077", "Zazaza", 222, 0, CategoriaProducto.ALIMENTO);
        // cargamos inventario

        inventario.agregarProducto(p);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);

        System.out.println("📦 Inventario de productos:");
        inventario.listarProductos();
        System.out.println("\n🔍 Buscar producto por ID :");
        Producto buscado = inventario.buscarProductoPorId("1234");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        System.out.println(" -------------- eliminar producto --------------- ");
        //eliminar producto
        inventario.eliminarProducto("1234");
        inventario.listarProductos();
        System.out.println(" ------------ actualizar stock----------------- ");
        //actualizar stock
        inventario.actualizarProductos("P077",999);
        inventario.listarProductos();
        System.out.println(" ----------------------------- ");

        System.out.println("\n📂 Filtrar por categoría ELECTRONICA:");
        for (Producto pp : inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA)) {
            pp.mostrarInfo();
        }

        System.out.println(" ------------ obtener total stock ----------------- ");
        System.out.println(inventario.obtenerTotalStock());

        System.out.println(" ------------ obtener producto con mayor sock ----------------- ");
        System.out.println(inventario.obtenerProductoConMayorStock());

        System.out.println("\n💰 Filtar Productos por precio ");
        for (Producto pp : inventario.filtrarProductosPorPrecio(1000, 3000)) {
            pp.mostrarInfo();
        }

        System.out.println(" ------------ mostrar categorias de producto ----------------- ");
        inventario.mostrarCategotiasDisponibles();
    }
}
