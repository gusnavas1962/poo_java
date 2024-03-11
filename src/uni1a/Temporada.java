package uni1a;

public class Temporada {
    private int numero;
    private int episodios;

    public Temporada(int numero, int episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getEpisodios(){
        return this.episodios;
    }
    
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
}