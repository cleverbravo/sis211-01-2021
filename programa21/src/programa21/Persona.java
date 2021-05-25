package programa21;

public class Persona{
    private String nombreCompleto,ci;
    public Persona(String nombreCompleto,String ci){
        this.nombreCompleto=nombreCompleto;
        this.ci=ci;
    }
    //encapsular nombreCompleto
    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto=nombreCompleto;
    }
    public String getNombreCompleto(){
        return nombreCompleto;
    }
    //encapsular el ci
    public void setCi(String ci){
        this.ci=ci;
    }
    public String getCi(){
        return ci;
    }
    public String toString(){
        return nombreCompleto+": "+ci;
    }
}
