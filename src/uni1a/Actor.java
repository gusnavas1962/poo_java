package uni1a;

public class Actor {
    private String nombre;

    public Actor(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}