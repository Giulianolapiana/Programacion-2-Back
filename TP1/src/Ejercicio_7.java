import java.util.Scanner;
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        nota = -1;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("⚠   Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("✅   Nota guardada correctamente: " + nota);
    }
}