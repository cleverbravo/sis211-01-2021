package programa13;
import java.util.*;
public class Programa13 {
    public static void main(String[] args) {
        int x;
        Estudiante e;
        e=new Estudiante();
        e.nombre="pepe";
        e.ci=123456;
        System.out.println(e.nombre);
        System.out.println(e.ci);
        Scanner cin=new Scanner(System.in);
        e.nombre=cin.next();
        e.ci=cin.nextInt();        
        System.out.println("nombre="+e.nombre);
        System.out.println("ci="+e.ci);
    }
}

class Estudiante{
    String nombre;
    int ci;
}

/***************Farmacia
Mobiliario:{Muebles,Estantes,Vidrieras}
Cajeros:{}
Bioquimicos;{}
MaterialOficina:{Papeles,Boligrafos}
MaterialLimpieza:{Jabones,Limpieza} 
Tabletas:{diclofenacho}
Ampollas:{20ml ...}
Pomadas:{dolorsan}
Pildoras:{}
Jarabes:{tos...}


Cierta Atomocidad de las clases.


***************Fabricante de Muebles
Sofa:{}
Mesa:{}
Vidriera:{}
Estante:{}
Silla:{}
Cajero:{}
Botiquin:{Tabletas,Ampollas,Pomadas,Pildoras,Jarabes}


*/


        
        
