package uni1a;

public class Investigador {
    private String nombre;

    public Investigador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
	// Agregar método toStringCSV a la clase Investigador
	//  @Override
	public String toStringCSV() {
		return nombre;
	}
}