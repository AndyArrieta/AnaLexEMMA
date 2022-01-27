
package Modelo;

public class Ciudad {
    private String codigo;
    private String nombre;
    private Aeropuerto aeropuerto;
    private Pais pais;

    public Ciudad(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Ciudad() {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }

    public Pais getPais() {
        return pais;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    public Aeropuerto getAeropuertos(String codCiudad){
        Aeropuerto aeropuerto=null;
       aeropuerto.getCiudad().getCodigo().equals(codCiudad);        
        return aeropuerto;
    }
}
