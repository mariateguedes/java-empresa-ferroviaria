package ferrovia;

public class Locomotiva extends RecursosFerroviarios{
    
    // Atributos
    private int numero;
    private float capTracao;
    private float capPeso;
    private float comprimento;
        
    
    // Métodos

    @Override
    public String toString() {
        return "Locomotiva: " + "Número: " + numero + ". Capacidade de Tração: " + capTracao + ". Capacidade de Peso: " + capPeso + ". Comprimento: " + comprimento ;
    }
    
    
    
    // Métodos especiais

    public Locomotiva(int numero, float capTracao, float capPeso, float comprimento) {
        this.numero = numero;
        this.capTracao = capTracao;
        this.capPeso = capPeso;
        this.comprimento = comprimento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getCapTracao() {
        return capTracao;
    }

    public void setCapTracao(float capTracao) {
        this.capTracao = capTracao;
    }

    public float getCapPeso() {
        return capPeso;
    }

    public void setCapPeso(float capPeso) {
        this.capPeso = capPeso;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    
       
        
        
               
        
        
        
}
    

   

    
    
    
    

