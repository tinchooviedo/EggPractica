package relacionespoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Libro> libros = crearLibros(); // Creamos una lista y llamamos la funcion asi la lista recibe la lista llenada en la funcion

        for (Libro libro : libros) {
            System.out.println(libro);
        }

        Cliente cliente = crearCliente();

        System.out.println(cliente);

        Prestamo prestamo = crearPrestamo(libros, cliente);

        System.out.println(prestamo);

    }

    public static ArrayList<Libro> crearLibros() { // Metodo que crea el Libro y lo agrega a una lista

        ArrayList<Libro> libros = new ArrayList(); // Creamos la lista

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String respuesta = "";
        do {

            Libro libro = new Libro(); // Creamos el objero libro

            System.out.println("Ingrese el isbn del libro");
            Long isbn = scan.nextLong();
            libro.setIsbn(isbn);
            System.out.println("Ingrese el titulo del libro");
            String titulo = scan.next();
            libro.setTitulo(titulo);
            System.out.println("Ingrese la cantidad de ejemplares del libro");
            Integer ejemplares = scan.nextInt();
            libro.setEjemplares(ejemplares);

            libro.setEjemplaresPrestados(0);

            libros.add(libro);

            System.out.println("Quiere crear otro libro ?");
            respuesta = scan.next();

        } while (respuesta.equalsIgnoreCase("Si"));

        return libros; // devuelve la lista para cuando llamemos la funcion
    }

    public static Cliente crearCliente() {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        Cliente cliente = new Cliente();

        System.out.println("Ingrese su documento");
        Integer documento = scan.nextInt();
        cliente.setDocumento(documento);

        System.out.println("Ingrese su nombre");
        String nombre = scan.next();
        cliente.setNombre(nombre);

        return cliente;
    }

    public static Prestamo crearPrestamo(ArrayList<Libro> libros, Cliente cliente) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        Prestamo prestamo = new Prestamo();

        System.out.println("Ingrese el id del prestamo");
        Integer id = scan.nextInt();
        prestamo.setId(id);

        prestamo.setCliente(cliente);

        for (Libro libro : libros) {
            int prestados = libro.getEjemplaresPrestados() + 1;
            libro.setEjemplaresPrestados(prestados);
        }

        prestamo.setLibros(libros);

        return prestamo;
    }

    public static void devolucion(Prestamo prestamo) {

        for (Libro libro : prestamo.getLibros()) {

            int prestados = libro.getEjemplaresPrestados() - 1;

            libro.setEjemplaresPrestados(prestados);

        }

    }

}
