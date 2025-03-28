import java.util.Scanner;
public class Ejercicio_3 {
    /*Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según
la siguiente tabla:*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        if (edad < 12) {
            System.out.println("Eres un niño ");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("eres un adolescente ");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Adulto ");
        } else {
            System.out.println("Adulto mayor ");
        }
    }
}
