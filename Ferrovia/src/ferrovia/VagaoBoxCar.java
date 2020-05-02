package ferrovia;
public class VagaoBoxCar extends Vagao {
    
    
    private String tipo;
    
    public VagaoBoxCar(int numero, float capCarga) {
        super(numero, capCarga);
    }

    @Override
    public String getTipo() {
        return "Box";
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
