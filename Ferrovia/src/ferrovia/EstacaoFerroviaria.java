package ferrovia;

import java.util.ArrayList;

public class EstacaoFerroviaria {
    
    // Atributos
    
    private String sigla;
    private String descricao;
    ArrayList<Locomotiva> LocomotivasEstacionadas; 
    ArrayList<Vagao> VagoesEstacionados;
    
    // Métodos

    @Override
    public String toString() {
        return "Sigla: " + sigla + ". Descricao: " + descricao ;
    }

    
    
    
    public void estacionarLocomotiva(Locomotiva locomotiva){
        LocomotivasEstacionadas.add(locomotiva);
        
    }
    
    public void estacionarVagao(Vagao vagao) {
        VagoesEstacionados.add(vagao);
    
    }
    
    public void numerarLocomotivasEstacionadas(){
        System.out.println(LocomotivasEstacionadas.size());
      
    }
    public void numerarVagoesEstacionados(){
        System.out.println(VagoesEstacionados.size());   
    }
    
    // Métodos especiais
    
    
    public EstacaoFerroviaria(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.LocomotivasEstacionadas = new ArrayList<Locomotiva>();  /* Toda vez que uma Estação Ferroviária for instanciada, será criada uma nova lista com as locomotivas que estão estacionadas. */
        this.VagoesEstacionados = new ArrayList<Vagao>();
        
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }    

    public ArrayList<Locomotiva> getLocomotivasEstacionadas() {
        return LocomotivasEstacionadas;
    }

    public void setLocomotivasEstacionadas(ArrayList<Locomotiva> LocomotivasEstacionadas) {
        this.LocomotivasEstacionadas = LocomotivasEstacionadas;
    }

    public ArrayList<Vagao> getVagoesEstacionados() {
        return VagoesEstacionados;
    }

    public void setVagoesEstacionados(ArrayList<Vagao> VagoesEstacionados) {
        this.VagoesEstacionados = VagoesEstacionados;
    }
       
 

   
    
    
    
    



    
    
    
    
    
}
