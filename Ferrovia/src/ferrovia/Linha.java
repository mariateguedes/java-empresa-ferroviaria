package ferrovia;
public class Linha {
    
    // Atributos
    
    private int numero;
    private double extensao;
    private String origem;
    private String destino;
    private String tipoCarga;
    private float pesoCarga;
    private String descricao;
        
    // Métodos

    @Override
    public String toString() {
        return "Linha: " + "Número: " + numero + ". Extensão: " + extensao + ". Origem: " + origem + ". Destino:" + destino + ". Tipo de Carga: " + tipoCarga + ". Peso da Carga: " + pesoCarga + ". Descrição: " + descricao + '}';
    }
    
    
    
    
    // Métodos especiais

    public Linha(int numero, double extensao, String origem, String destino, String tipoCarga, float pesoCarga, String descricao) { /* Construct */
        this.numero = numero;
        this.extensao = extensao;
        this.origem = origem;
        this.destino = destino;
        this.tipoCarga = tipoCarga;
        this.pesoCarga = pesoCarga;
        this.descricao = descricao;
    }
    
    
}
