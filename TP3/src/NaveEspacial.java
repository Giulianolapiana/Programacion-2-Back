public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar(){

    }
    public void avanzar(int distancia){
        if (combustible-distancia > 0){
            combustible -= distancia;
        }else {
            System.out.println("no se puede recorrer esa distancia");
        }
    }
    public void recargarCombustible(int cantidad){
        if (combustible+cantidad < 100){
            combustible += cantidad;
        }else {
            combustible = 100;
        }
    }
    public void mostar(){
        System.out.println(nombre+" "+combustible);
    }

    public static void main(String[] args) {
        NaveEspacial naveEspacial = new NaveEspacial("maiameee",50);
        naveEspacial.avanzar(60);
        naveEspacial.recargarCombustible(40);
        naveEspacial.avanzar(60);
        naveEspacial.mostar();

    }
}
