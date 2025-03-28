import java.util.Scanner;
public class Ejercicio_4 {
    /*Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double num = scanner.nextDouble();
        System.out.println("Ingrese la categoria: ");
        scanner.nextLine();
        String categoria = scanner.nextLine();
        switch (categoria){
            case "A":
                num = num*0.9;
                break;
            case "B":
                num = num*0.85;
                break;
            case "C":
                num = num*0.8;
                break;
        }
        System.out.println(num);
    }
}
