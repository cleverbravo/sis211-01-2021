package programa14;
import java.util.*;
//Registrar los datos de 5 estudiantes (nombres,ci,p1,p2,p3)
//mostrar por pantalla la lista de los estudiantes: Nombre,CI,Promedio Parciales
public class Programa14 {
    public static void main(String[] args) {
        Estudiante e[]=new Estudiante[5];
        for(int i=0;i<e.length;i++)
        {
            e[i]=new Estudiante();
            e[i].leerDatos();
            
        }
        for(int i=0;i<e.length;i++)
            e[i].mostrarDatos();
    }
}
class Estudiante{
    String nombre;
    int ci,p1,p2,p3;
    public void leerDatos(){
        Scanner cin=new Scanner(System.in);
        System.out.println("Introduzca el nombre del estudiante:");
        nombre=cin.next();
        System.out.println("Introduzca el CI del estudiante:");
        ci=cin.nextInt();
        System.out.println("Introduzca los 3 parciales del estudiante:");
        p1=cin.nextInt();
        p2=cin.nextInt();
        p3=cin.nextInt();
    }
    public void mostrarDatos(){
        System.out.println("Nombre:"+nombre);
        System.out.println("CI:"+ci);
        /*System.out.println("P1:"+p1);
        System.out.println("P2:"+p2);
        System.out.println("P3:"+p3);*/
        System.out.println("Promedio:"+promedioParciales());
    }
    public double promedioParciales(){
        return (p1+p2+p3)/3.0;
    }
}

