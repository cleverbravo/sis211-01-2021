package programa07;
import java.util.*;
/*escribir un programa para determinar si un numero es primo
Input   output
3       es primo
4       no es primo
*/
public class Programa07 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero entero para verificar si es primo:");
        Scanner cin=new Scanner(System.in);
        int x=cin.nextInt(),divisores=0;
        for(int i=1;i<=x;i++){
            if(x%i==0)
                divisores++;
        }
        if(divisores==2)
            System.out.println("es primo");
        else
            System.out.println("no es primo");
    }
}
