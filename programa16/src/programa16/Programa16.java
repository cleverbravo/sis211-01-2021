package programa16;
import java.util.*;
public class Programa16 {
    public static void main(String[] args) {
        ArrayList<Integer> v=new ArrayList();
        v.add(5);
        v.add(1);
        v.add(0);
        v.add(-5);
        v.add(50);
        v.add(15);
        v.add(7);
        Collections.sort(v);
        System.out.println("size="+v.size());
        for(int i=0;i<v.size();i++)
            System.out.println(v.get(i));
        Collections.sort(v,Collections.reverseOrder());
        System.out.println("inverso");
        for(int i=0;i<v.size();i++)
            System.out.println(v.get(i));
        v.remove(0);
        System.out.println("Se elimino el valor en la posicion 0");
        for(int i=0;i<v.size();i++)
            System.out.println(v.get(i));
        System.out.println(v.contains(8));
        System.out.println(v.contains(7));
        //funcion lambda
        System.out.println("Ordenado con lambda");
        v.sort(    (a,b)->b-a       );
        for(int i=0;i<v.size();i++)
            System.out.println(v.get(i));
        
    }
}

