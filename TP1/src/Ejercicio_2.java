import java.util.Scanner;
public class Ejercicio_2 {
    /*Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el
mayor.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();
        int mayor = num1;
        if (num1 < num2){
            mayor = num2;
        }
        if (mayor < num3){
            mayor = num3;
        }
        System.out.println("El mayor es: "+ mayor);
    }
}
