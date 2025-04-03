public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo(){
        System.out.println(nombre+" "+especie+" "+edad);
    }
    public void cumplirAnios(){
        edad += 1;
    }

    public static void main(String[] args) {
        Mascota mascota = new Mascota("Alfredo","Tigre gatuno",2);
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.mostrarInfo();
    }
}
