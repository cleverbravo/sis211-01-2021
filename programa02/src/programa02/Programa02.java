package programa02;
import java.util.*;
public class Programa02 {
    public static void main(String[] args) {
        //estructuras selectivas:
        //if-else;switch;?;
        //escribir un programa para determinar si un numero entero leido por teclado
        //es un numero par o impar.
        int x;
        System.out.println("Introduzca un numero entero");
        Scanner cin=new Scanner(System.in);
        x=cin.nextInt();
        if(x%2==0){
            System.out.println("El valor introducido es par.");
        }
        else{
            System.out.println("El valor introducido es impar.");
        }
    }
}
