package ferrovia;
public class VagaoConteineres extends Vagao {
    
    private String tipo;
    
    public VagaoConteineres(int numero, float capCarga) {
        super(numero, capCarga);
    }

    @Override
    public String getTipo() {
        return "Cont";
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
