package programa04;
import java.util.*;
/*Escribir un programa para sumar, restar, multiplicar o dividir dos valores enteros
de acuerdo al operador introducido
Input           Output
4 + 5           9
4 / 5           0.8
*/
public class Programa04 {
    public static void main(String[] args) {
        System.out.println("introduzca una operacion aritmetica entre dos valores (4 / 5)"
                +" separados por un espacio");
        int a,b;
        Scanner cin=new Scanner(System.in);
        a=cin.nextInt();
        
        char operacion=cin.next().charAt(0);
        b=cin.nextInt();
        switch(operacion){
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);
                break;
            case '*':System.out.println(a*b);
                break;
            case '/':System.out.println(a/(double)b);
                break;
        }
    }
}
