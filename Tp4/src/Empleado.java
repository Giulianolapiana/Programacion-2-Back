public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    // primer constructor
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    // segundo constructor
    public Empleado(String nombre, String puesto){
        this.id = ++totalEmpleados; // Genera un id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000; // Salario por defecto
    }


}
