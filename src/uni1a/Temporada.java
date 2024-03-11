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
    
    public static Temporada temporadaNuevaPara2Numeros(String datos) {
        // Creamos un ArrayList para almacenar los números separados
       // ArrayList<Integer> numeros = new ArrayList<>();
        Temporada tempo=null; 
        // Dividimos la cadena de entrada en dos partes utilizando el guion como separador
        String[] partes = datos.split("-");
        
        // Convertimos las partes a números enteros y las agregamos al ArrayList
        try {
            int numero1 = Integer.parseInt(partes[0]);
            int numero2 = Integer.parseInt(partes[1]);
            tempo = new Temporada(numero1, numero2);
//            numeros.add(numero1);
//            numeros.add(numero2);
            
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            // Manejamos posibles errores de conversión o acceso a índices inválidos
            System.err.println("Error al separar y convertir los números: " + e.getMessage());
        }
        
        return tempo;
    }
    
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
}