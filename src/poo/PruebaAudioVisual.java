package poo;
import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from AWS Cloud9!");

        // Crear instancias de las subclases
        Pelicula avatar = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        SerieDeTV got = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        Documental cosmos = new Documental("Cosmos", 45, "Science", "Astronomy");

        // Mostrar los detalles de cada contenido audiovisual
        mostrarDetalles(avatar);
        mostrarDetalles(got);
        mostrarDetalles(cosmos);
    }

    // Método para mostrar los detalles de un ContenidoAudiovisual
    public static void mostrarDetalles(ContenidoAudiovisual contenido) {
        System.out.println("Detalles del contenido:");
        System.out.println("ID: " + contenido.getId());
        System.out.println("Título: " + contenido.getTitulo());
        System.out.println("Duración en minutos: " + contenido.getDuracionEnMinutos());
        System.out.println("Género: " + contenido.getGenero());
        if (contenido instanceof Pelicula) {
            Pelicula pelicula = (Pelicula) contenido;
            System.out.println("Estudio: " + pelicula.getEstudio());
        } else if (contenido instanceof SerieDeTV) {
            SerieDeTV serie = (SerieDeTV) contenido;
            System.out.println("Temporadas: " + serie.getTemporadas());
        } else if (contenido instanceof Documental) {
            Documental documental = (Documental) contenido;
            System.out.println("Tema: " + documental.getTema());
        }
               
        System.out.println();
    }
}