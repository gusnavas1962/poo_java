//Clase Controlador (Controlador)
package uni1a;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Controlador {
 private ArrayList<ContenidoAudiovisual> contenidos = new ArrayList<>();
// private ContenidoAudiovisual[] contenidos;

 public Controlador() {
	 ArrayList<ContenidoAudiovisual> contenidos = new ArrayList<>();

	 
     contenidos.add(new Pelicula("Avatar", 125, "Accion", "20th Century Studios")); 
 //    contenidos[0] = ;
 //    contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
 //    contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
    
 }

 public void mostrarDetallesContenidos() {
     for (ContenidoAudiovisual contenido : contenidos) {
         contenido.mostrarDetalles();
     }
 }
  
 public void agregarContenido(ContenidoAudiovisual contenido) {
	 contenidos.add(contenido);

 }


 
 // Agregar un método en la clase Controlador para escribir los datos en un archivo CSV
 public void escribirCSV() {
     try (PrintWriter writer = new PrintWriter(new FileWriter("peliculas.csv"))) {
         for (ContenidoAudiovisual contenido : contenidos) {
             writer.println(contenido.toStringCSV());
     }
     } catch (IOException e) {
         e.printStackTrace();
     }
 }

}