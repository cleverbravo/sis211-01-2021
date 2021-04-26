package programa17;
//Registrar los datos estudiantes (nombres,ci,p1,p2,p3)
//mostrar por pantalla la lista de los estudiantes: Nombre,CI,Promedio Parciales

import java.util.*;

//en orden descendente por el promedio
//mostrar por pantalla la lista de los estudiantes: Nombre,CI,Promedio Parciales
//en orden ascendente por el nombre
//Utilizar el siguiente menu:
//1.- Registrar nuevo estudiante
//2.- Mostrar los promedios en orden descendente
//3.- Mostrar la lista por nombres en orden ascendente
//4.- Fin
public class Programa17 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        ArrayList<Estudiante> estudiantes=new ArrayList();
        do{
            System.out.println("1.- Registrar nuevo estudiante");
            System.out.println("2.- Mostrar los promedios en orden descendente");
            System.out.println("3.- Mostrar la lista por nombres en orden ascendente");
            System.out.println("4.- Fin");
            System.out.println("Introduzca una opcion");
            int opcion=cin.nextInt();
            switch(opcion){
                case 1:
                    Estudiante nuevoEstudiante=new Estudiante();
                    nuevoEstudiante.leerDatos();
                    estudiantes.add(nuevoEstudiante);
                    break;
                case 2:
                    estudiantes.sort( (e1,e2)-> (int)(e2.promedioParciales()*100)-(int)(e1.promedioParciales()*100)  );
                    for(int i=0;i<estudiantes.size();i++)
                        estudiantes.get(i).mostrarDatos();
                    break;
                case 3:
                    estudiantes.sort( (e1,e2)-> e1.nombre.compareTo(e2.nombre));
                    for(int i=0;i<estudiantes.size();i++)
                        estudiantes.get(i).mostrarDatos();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default: System.out.println("Introduzca una opcion valida");
            }
        }while(true);
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
