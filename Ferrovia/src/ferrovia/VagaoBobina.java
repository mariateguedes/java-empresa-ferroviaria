package ferrovia;
public class VagaoBobina extends Vagao {
    
    private String tipo;
    
    public VagaoBobina(int numero, float capCarga) {
        super(numero, capCarga);
    }

    @Override
    public String getTipo() {
        return "Bob";
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
