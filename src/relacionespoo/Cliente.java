package relacionespoo;

public class Cliente {

    private Integer documento;

    private String nombre;

    public Cliente(Integer documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    public Cliente() {
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Documento:" + documento + ", Nombre:" + nombre;
    }
    
    
    
}
