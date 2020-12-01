package relacionespoo;

import java.util.ArrayList;
import java.util.List;

public class Prestamo {

    private Integer id;

    private Cliente cliente;

    private List<Libro> libros;

    public Prestamo() {
        this.libros = new ArrayList();
    }

    public Prestamo(Integer id, Cliente cliente, List<Libro> libros) {
        this.id = id;
        this.cliente = cliente;
        this.libros = libros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
       }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", cliente=" + cliente + ", libros=" + libros + '}';
    }
    
    
    
}   

