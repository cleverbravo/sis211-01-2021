package programa09;
import java.util.*;
public class Programa09 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String nombre;
        System.out.println("Introduzca un nombre:");
        nombre=cin.next();
        System.out.println("hola "+nombre);
        System.out.println(nombre.charAt(3));
        System.out.println("comparando:"+nombre.compareTo("CLEVER"));
        for(int i=0;i<nombre.length();i++)
            System.out.println(nombre.charAt(nombre.length()-1-i));
        nombre=nombre+"apellido"+(2+4);
        System.out.println("hola "+nombre);
    }
}
