package ferrovia;
public class VagaoGondola extends Vagao {
    
    private String tipo;
    
    public VagaoGondola(int numero, float capCarga) {
        super(numero, capCarga);
    }

    @Override
    public String getTipo() {
        return "Gond";
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
