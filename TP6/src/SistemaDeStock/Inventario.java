package SistemaDeStock;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        this.productos.add(p);
    }

    public void listarProductos(){
        for (Producto p : productos) {
            System.out.println(p);
            /*p.mostrarInfo();*/
        }
    }

    public Producto buscarProductoPorId(String id){
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)){
                return p;
            }
        }
        return null;
    }

    public void eliminarProducto(String id){
        productos.removeIf(p -> p.getId().equalsIgnoreCase(id));
    }

    /*public void actualizarProductos(String id, int cantidad){
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)){
                p.setCantidad((p.getCantidad()+cantidad));
            }
        }
    }*/

    public void actualizarProductos(String id, int cantidad){
        Producto p = buscarProductoPorId(id);
        if (p != null){
            p.setCantidad((p.getCantidad()+cantidad));
        }
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public int obtenerTotalStock(){
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        Producto productoMayor = null;
        int mayor = -1;
        for (Producto p : productos) {
            if (mayor < p.getCantidad()){
                mayor = p.getCantidad();
                productoMayor = p;
            }
        }
        return productoMayor;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        ArrayList<Producto> rango = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                rango.add(p);
            }
        }
        return rango;
    }

    public void mostrarCategotiasDisponibles(){
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c.name() + ": " + c.getDescripcion());
            /*System.out.println(c);*/
        }
    }
}
