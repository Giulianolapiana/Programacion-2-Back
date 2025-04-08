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
    //actalizar salario #1
    public void actualizarSalario(double porcentaje){
        this.salario += this.salario * (porcentaje / 100);
    }
    public void actualizarSalario(int cantidadFija){
        this.salario += cantidadFija;
    }


    @Override
    public String toString() {
        return "Empleado [ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: " + salario + "]";
    }

    public static int totalEmpleados() {
        return totalEmpleados;
    }

    public static void main(String[] args) {
        Empleado emp1 = new Empleado(1, "JJ Lopez", "Entrenador", 50000);
        Empleado emp2 = new Empleado("Nico","Decendio");
        Empleado emp3 = new Empleado("River","Decendio2");
        Empleado emp4 = new Empleado(4, "JJ", "Entrenador", 500);

        emp1.actualizarSalario(10.0);
        emp2.actualizarSalario(555);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(Empleado.totalEmpleados());
    }
}
