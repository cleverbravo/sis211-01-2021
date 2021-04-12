package programa03;
import java.util.*;
//escribir un programa para determinar si un numero entero leido por teclado
//es un numero par o impar.
public class Programa03 {
    public static void main(String[] args) {
        int x;
        System.out.println("Introduzca un numero entero");
        Scanner cin=new Scanner(System.in);
        x=cin.nextInt();
        System.out.println("El valor introducido es "+(x%2==0?"par":"impar"));
    }
}
