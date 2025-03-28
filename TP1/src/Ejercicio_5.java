import java.util.Scanner;
public class Ejercicio_5 {
    /*Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo
debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar
la suma total de los pares ingresados.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();
        int suma = 0;
        while(num != 0){
            if (num % 2 == 0){
                suma += num;
            }
            System.out.println("Ingrese un numero: ");
            num = scanner.nextInt();
        }
        System.out.println("La suma de los números pares es: " + suma);
    }
}
