package proyecto2revocalo;
//Clase Elector, con todos sus atributos, getters y setters

import java.io.Serializable;

public class Elector implements Serializable{
    private String nombre;
    private String fechaNac;
    private float latitud;
    private float longitud;
    
    public String getNombre(){
        return nombre;
    }
   
    public void setNombres(String nombres){
        this.nombre = nombres;
    }
    
    public String getFechaNac(){
        return fechaNac;
    }
    
    public void setFechaNac(String fechaNac){
        this.fechaNac = fechaNac;
    }
    
    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }
    
}
