package SistemaDeStock;

public enum CategoriaProducto {
    ALIMENTO("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    private final String descripcion;

    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "CategoriaProducto: " +name()+
                " descripcion='" + descripcion + '\'';
    }
}
