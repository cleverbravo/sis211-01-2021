package programa05;
import java.util.*;
/*escribir un programa para determinar si un numero es primo
Input   output
3       es primo
4       no es primo
*/
public class Programa05 {
    public static void main(String[] args) {
        //estructuras de control repetitivas:while;do-while;for;
        System.out.println("Introduzca un numero entero para verificar si es primo:");
        Scanner cin=new Scanner(System.in);
        int x=cin.nextInt(),divisores=0,i=1;
        while(i<=x){
            if(x%i==0)
                divisores++;
            i++;
        }
        if(divisores==2)
            System.out.println("es primo");
        else
            System.out.println("no es primo");
    }
}
