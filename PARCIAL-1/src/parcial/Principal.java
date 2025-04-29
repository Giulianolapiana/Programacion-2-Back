package parcial;

import java.time.LocalDate;
import java.util.Date;


public class Principal {
    public static void main(String[] args) {
        Autor a1 = new Autor("Juan","chileno", LocalDate.now());
        Autor a2 = new Autor("jj lopez","argentino",LocalDate.ofYearDay(1999,2));
        Genero genero = new Genero("ficcion", "una novela argentina");
        Editorial editorial = new Editorial("HTML","Librosarg.com",new Direccion("don bosco",234,"ciudad","2033"));
        Libro libro = new Libro("Donquijote",1988,genero,editorial);
        libro.agregarAutor(a1);
        libro.agregarAutor(a2);
        System.out.println(libro);

        //agrega ejemplares al libro
        Genero genero2 = new Genero("aventura", "una novela chilena");
        Ejemplar ejemplar = new Ejemplar("12345",EstadoEjemplar.EXTRAVIADO,new Publicacion("holasoygerman",1888,genero2));
        Ejemplar ejemplar2 = new Ejemplar("9876",EstadoEjemplar.DISPONIBLE,new Publicacion("boca",1902,genero2));

        //Instanciá una Revista con al menos un ejemplar.

        Revista revista = new Revista("ggg",123,genero2,2,44);

        //Creá una Biblioteca y registrá estas publicaciones.
        Usuario usuario = new Usuario("giuliano","lapiana","44444444");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarPublicacion(new Publicacion("hola",1999,genero));
        biblioteca.agregarUsuarios(usuario);

        // Crear usuario
        Usuario usuario = new Usuario("Ana", "Pérez", "40111222");

        // Crear préstamo y línea de préstamo
        Prestamo prestamo = new Prestamo(LocalDate.now(), null);
        prestamo.agregarLineaPrestamo(ejemplar);  // ejemplar del libro
        // Asignar préstamo al usuario
        usuario.getPrestamos().add(prestamo);
        // Registrar usuario en la biblioteca
        biblioteca.agregarUsuarios(usuario);
       //por hacer
        usuario.mostrarHistorialPrestamos();

    }
}
