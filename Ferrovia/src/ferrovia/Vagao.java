package ferrovia;
public abstract class Vagao extends RecursosFerroviarios{
    
    // Atributos
    
    private int numero;
    private float capCarga;
    private String tipo;
    
    
    // Métodos

    @Override
    public String toString() {
        return "Vagao: " + "Número=" + numero + ". Capacidade de Carga: " + capCarga ;
    }
    
    

    public String getTipo() { return tipo;
 
    }

    // Métodos especiais
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Vagao(int numero, float capCarga) {
        /* Construct */
        this.numero = numero;
        this.capCarga = capCarga;
    }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public float getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(float capCarga) {
        this.capCarga = capCarga;
    }
    
    
    
}
