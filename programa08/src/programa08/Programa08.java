package programa08;
import java.util.*;
/*Arrays
array 1 dimension = vector,lista
array 2 dimensiones=matriz,tabla
*/
public class Programa08 {
    public static void main(String[] args) {
        int []v=new int[5];//int v[10]; c++
        Scanner cin=new Scanner(System.in);
        for(int i=0;i<5;i++)
            v[i]=cin.nextInt();
        for(int i=0;i<5;i++)
            System.out.println(v[i]*2);
    }
}
