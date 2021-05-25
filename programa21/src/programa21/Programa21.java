package programa21;
import java.util.*;
/*
Escribir un programa para registrar licencias de conducir.
nombre completo,ci
categoria de la licencia
fecha de entrega, fecha de vencimiento
foto
*/
public class Programa21 {
    public static void main(String[] args) {
        int opcion;
        Scanner cin=new Scanner(System.in);
        do
        {
            mostrarOpciones();
            opcion=cin.nextInt();
            ejecutarOpcion(opcion);
        }while(true);
    }
    
    public static void mostrarOpciones(){
        System.out.println("1.-Registrar Licencia");
        System.out.println("2.-Registrar Persona");
        System.out.println("3.-Listar Licencias");
        System.out.println("4.-Listar Personas");
        System.out.println("5.-Salir");
    }
    
    public static void ejecutarOpcion(int opcion){
        Scanner cin=new Scanner(System.in);
        switch(opcion)
        {
            case 1:LicenciaDeConducir nuevaLicencia=new LicenciaDeConducir();
                System.out.println("Introduzca el CI:");
                String ci=cin.next();
                Persona persona=null;
                for(Persona p:Data.getData().getPersonas())
                    if(p.getCi().compareTo(ci)==0){
                        persona=p;
                        break;
                    }
                if(persona!=null){
                    System.out.println("Introduzca la Categoria de la Licencia(A=0,B=1,C=2,M=3,T=4):");
                    int categoriaInt=cin.nextInt();
                    Categoria categoria=Categoria.values()[categoriaInt];
                    Date fechaInicio=new Date();
                    Date fechaFin=new Date();
                    long incremento=31536000000l*5l;
                    fechaFin.setTime(fechaInicio.getTime()+incremento);
                    System.out.println("Introduzca la ruta de la imagen para la licencia:");
                    String rutaImagen=cin.next();
                    nuevaLicencia.setCategoria(categoria);
                    nuevaLicencia.setConductor(persona);
                    nuevaLicencia.setFechaFin(fechaFin);
                    nuevaLicencia.setFechaInicio(fechaInicio);
                    nuevaLicencia.setRutaImagen(rutaImagen);
                    Data.getData().getLicencias().add(nuevaLicencia);
                }
                else
                    System.out.println("El CI no existe");
                break;
            case 2:
                String nombre,ciPersona;
                System.out.println("Introduzca el nombre de la persona:");
                nombre=cin.next();
                System.out.println("Introduzca el CI de la persona:");
                ciPersona=cin.next();
                Persona nuevaPersona=new Persona(nombre,ciPersona);
                Data.getData().getPersonas().add(nuevaPersona);
                break;
            case 3:
                for(LicenciaDeConducir licencia:Data.getData().getLicencias()){
                    System.out.println(licencia.toString());
                }
                break;
            case 4:
                for(Persona p:Data.getData().getPersonas()){
                    System.out.println(p.toString());
                }
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Opción inválida.");
        }
    }
}
