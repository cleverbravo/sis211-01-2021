package programa19;
import java.util.*;
public class Programa19 {
    public static void mostrar(ArrayList<Double> a){
        int posicion=0;
        for(;posicion<a.size();posicion++)//reading
            System.out.println("lista["+posicion+"]="+a.get(posicion));
    }
    public static void main(String[] args) {
        ArrayList<Double> lista=new ArrayList();        
        lista.add(8.03);
        lista.add(5.5);
        lista.add(6.8);
        lista.add(7.0);
        
        mostrar(lista);
        
        //lista.remove(3);//eliminar por posicion
        Double aux=7.0;
        lista.remove(aux);//eliminar por valor
        
        mostrar(lista);
        //6 a
        //7 b
        lista.sort( (a,b)-> (int)((a-b)*1000) );
        
        mostrar(lista);//orden ascendente
    }
}