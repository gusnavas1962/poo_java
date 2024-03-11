package poo;
import uni1a.*;

public class PruebaAudioVisual {

	public static void main(String[] args) {
		System.out.println("Hello from Eclipse!");

        // Crear instancias adicionales de ContenidoAudiovisual
        ContenidoAudiovisual av = new ContenidoAudiovisual("Avatar", 125, "Accion");
        ContenidoAudiovisual deeter = new ContenidoAudiovisual("De aqui a la Eternindad", 90, "accion");
        ContenidoAudiovisual inception = new ContenidoAudiovisual("Inception", 148, "Sci-Fi");
        ContenidoAudiovisual starWars = new ContenidoAudiovisual("Star Wars", 135, "Fantasy");
        ContenidoAudiovisual matrix = new ContenidoAudiovisual("Matrix", 136, "Sci-Fi");

        // Mostrar los detalles de cada contenido audiovisual
        System.out.println("Detalles del contenido:");
        System.out.println("ID: " + matrix.getId());
        System.out.println("Título: " + starWars.getTitulo());
        System.out.println("Duración en minutos: " + deeter.getDuracionEnMinutos());
        System.out.println("Género: " + inception.getGenero());
        System.out.println();
	}

}
