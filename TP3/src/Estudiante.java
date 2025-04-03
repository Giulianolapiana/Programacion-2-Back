import java.util.Scanner;
public class Estudiante {
    //ponemos el contructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    private String nombre;
    private String apellido;
    private String curso;

    public double getCalificacion() {
        return calificacion;
    }

    private double calificacion;

    public void mostrarInfo(){
        System.out.println(apellido+" "+nombre+" "+curso+" "+calificacion);
    }
    public void subirCalificacion(double puntos){
        if (calificacion + puntos > 10){
            calificacion = 10;
        }else {
            calificacion += puntos;
        }
    }
    public void bajarCalificacion(double puntos){
        if (calificacion - puntos < 0){
            calificacion = 0;
        }else{
            calificacion -= puntos;
        }
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("JJ", "Lopez", "B", 7);

        estudiante.mostrarInfo();

        estudiante.subirCalificacion(2.0);
        estudiante.mostrarInfo(); // Debería ser 9.5


        // Disminuir la calificación
        estudiante.bajarCalificacion(4.0);
        estudiante.mostrarInfo(); // Debería ser 6

        if (estudiante.getCalificacion() < 6){
            System.out.println("Estamos en la B");
        }
    }

}
