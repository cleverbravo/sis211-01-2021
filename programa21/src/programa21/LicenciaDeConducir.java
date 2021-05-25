package programa21;

import java.util.*;

public class LicenciaDeConducir{
    private Persona conductor;
    private Categoria categoria;
    private Date fechaInicio,fechaFin;
    private String rutaImagen;

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    public String toString(){
        return conductor.toString()+": Categoria:"+categoria.toString()+
                "\nVigencia:"+fechaInicio.toString()+"-"+fechaFin.toString();
                
    }
}
