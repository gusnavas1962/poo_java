package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }

        //Crear instancias de actores
        Controlador controlador = new Controlador();
        Actor actor1 = new Actor("Tom Hanks");
        Actor actor2 = new Actor("Scarlett Johansson");
        Actor actor3 = new Actor("Leonardo DiCaprio");
        Actor actor4 = new Actor("Jennifer Lawrence");
        Actor actor5 = new Actor("Chris Evans");

        //Crear instancias de películas y agregar actores
        ContenidoAudiovisual pelicula1 = new Pelicula("Forrest Gump", 142, "Drama", "Paramount Pictures");
        pelicula1.agregaDatoAdicional(actor1.getNombre());
        pelicula1.agregaDatoAdicional(actor2.getNombre());

        Pelicula pelicula2 = new Pelicula("Avengers: Endgame", 181, "Acción", "Marvel Studios");
        pelicula2.agregarActor(actor3);
        pelicula2.agregarActor(actor4);

        Pelicula pelicula3 = new Pelicula("Inception", 148, "Sci-Fi", "Warner Bros.");
        pelicula3.agregarActor(actor3);
        pelicula3.agregarActor(actor5);

        Pelicula pelicula4 = new Pelicula("The Dark Knight", 152, "Acción", "Warner Bros.");
        pelicula4.agregarActor(actor3);
        pelicula4.agregarActor(actor5);

        Pelicula pelicula5 = new Pelicula("La La Land", 128, "Musical", "Summit Entertainment");
        pelicula5.agregarActor(actor4);

        Pelicula pelicula6 = new Pelicula("The Shawshank Redemption", 142, "Drama", "Columbia Pictures");
        pelicula6.agregarActor(actor1);

        Pelicula pelicula7 = new Pelicula("Titanic", 195, "Romance", "Paramount Pictures");
        pelicula7.agregarActor(actor4);
        pelicula7.agregarActor(actor3);

        Pelicula pelicula8 = new Pelicula("Joker", 122, "Drama", "Warner Bros.");
        pelicula8.agregarActor(actor3);

        Pelicula pelicula9 = new Pelicula("Interstellar", 169, "Sci-Fi", "Paramount Pictures");
        pelicula9.agregarActor(actor3);
        pelicula9.agregarActor(actor4);

	    Pelicula pelicula10 = new Pelicula("The Godfather", 175, "Crime", "Paramount Pictures");
	    pelicula10.agregarActor(actor1);

	    //Crear un controlador y agregar las películas
	    //Controlador controlador = new Controlador();
      	controlador.agregarContenido(pelicula1);
      	controlador.agregarContenido(pelicula2);
      	controlador.agregarContenido(pelicula3);
      	controlador.agregarContenido(pelicula4);
      	controlador.agregarContenido(pelicula5);
      	controlador.agregarContenido(pelicula6);
      	controlador.agregarContenido(pelicula7);
      	controlador.agregarContenido(pelicula8);
      	controlador.agregarContenido(pelicula9);
      	controlador.agregarContenido(pelicula10);

      	//Mostrar los detalles de cada contenido audiovisual
      	controlador.mostrarDetallesContenidos();

      	//Escribir los datos en un archivo CSV
      	controlador.escribirCSV();
    }
}