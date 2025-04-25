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

}
