/**
 * Class Pelicula
 */
package uni1a;
import java.util.ArrayList;
import java.util.stream.Collectors;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private ArrayList<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }
    
    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    // Modificar el método mostrarDetalles en la clase Pelicula para que use toStringCSV
    @Override
    public void mostrarDetalles() {
        System.out.println(toStringCSV());
    }

    // Modificar el método toStringCSV en la clase Pelicula
    @Override
    public String toStringCSV() {
       String actoresCSV = actores.stream().map(Actor::toStringCSV).collect(Collectors.joining(";"));
       return super.toStringCSV() + "," + estudio + "," + actoresCSV;
    }
    @Override
    public void agregaDatoAdicional(String dato){
    	agregarActor(new Actor(dato));
    }

}