package ferrovia;
public class VagaoLiquido extends Vagao {
    
    // Atributos
    
    private int numero;
    private float capCarga;
    private String tipo;
        
    // Métodos

    
    
    // Métodos especiais
    
    public VagaoLiquido(int numero, float capCarga) {
        super(numero, capCarga);
    }
    


    @Override
    public String getTipo() {
        return "Liquido";
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
