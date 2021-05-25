package programa21;
import java.util.*;
public class Data {
    //singleton
    private static Data _data;
    public static Data getData(){
        if(_data==null)
            _data=new Data();
        return _data;
    }
    
    private ArrayList<LicenciaDeConducir> licencias;
    private ArrayList<Persona> personas;
    public Data(){
        licencias=new ArrayList();
        personas=new ArrayList();        
        //hardcoding
        personas.add(new Persona("clever","12345"));
        personas.add(new Persona("pepe","54321"));
        personas.add(new Persona("maria","147852"));
        personas.add(new Persona("blanca","369852"));
        LicenciaDeConducir a=new LicenciaDeConducir();
        a.setCategoria(Categoria.A);
        a.setConductor(personas.get(0));
        a.setFechaInicio(new Date());
        Date fin=new Date();
        fin.setTime(new Date().getTime()+1000l*60*60*24*365*5);
        a.setFechaFin(fin);
        a.setRutaImagen("d:/foto.jpg");
        LicenciaDeConducir b=new LicenciaDeConducir();
        b.setCategoria(Categoria.A);
        b.setConductor(personas.get(3));
        b.setFechaInicio(new Date());
        b.setFechaFin(fin);
        b.setRutaImagen("d:/foto.jpg");
        licencias.add(a);
        licencias.add(b);
    }
    public ArrayList<LicenciaDeConducir> getLicencias(){
        return licencias;
    }
    public ArrayList<Persona> getPersonas(){
        return personas;
    }
}
