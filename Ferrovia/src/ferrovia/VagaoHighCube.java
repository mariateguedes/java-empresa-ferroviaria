package ferrovia;
public class VagaoHighCube extends Vagao {
    
    
    private String tipo;
    
    public VagaoHighCube(int numero, float capCarga) {
        super(numero, capCarga);
    }

    @Override
    public String getTipo() {
        return "High";
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
