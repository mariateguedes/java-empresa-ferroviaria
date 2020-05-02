package ferrovia;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Trem extends RecursosFerroviarios{
    
    // Atributos
    private String prefixo;
    private String nome;
    private LocalDateTime Datahora;
    private EstacaoFerroviaria estOrigem;
    private EstacaoFerroviaria estdestino;
    ArrayList<RecursosFerroviarios> RecFerrov;

 
    
    // Construct

    @Override
    public String toString() {
        return "Prefixo: " + prefixo + ". Data/Hora: " + Datahora ;
    }
    
    
    
    public Trem(String prefixo, LocalDateTime datahora) {
        this.RecFerrov = new ArrayList<>();
        this.prefixo = prefixo;
        this.Datahora = datahora;
           
            
    }
    
    // Métodos

   
    
    public void adicionarRecFerrovVagao(Vagao recferrov) {
        RecFerrov.add(recferrov);
    }
    
    public void adicionarRecFerrovLocomotiva(Locomotiva recferrov) {
        RecFerrov.add(recferrov);
    }
    
    public void contarrecferrov() {
        RecFerrov.size();
    }
      
    // Métodos especiais

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    
    public EstacaoFerroviaria getEstOrigem() {
        return estOrigem;
    }

    public void setEstOrigem(EstacaoFerroviaria estOrigem) {
        this.estOrigem = estOrigem;
    }

    public EstacaoFerroviaria getEstdestino() {
        return estdestino;
    }

    public void setEstdestino(EstacaoFerroviaria estdestino) {
        this.estdestino = estdestino;
    }

   


    public ArrayList<RecursosFerroviarios> getRecFerrov() {
        return RecFerrov;
    }

    public void setRecFerrov(ArrayList<RecursosFerroviarios> RecFerrov) {
        this.RecFerrov = RecFerrov;
    }

    public LocalDateTime getDatahora() {
        return Datahora;
    }

    public void setDatahora(LocalDateTime datahora) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                                        LocalDateTime now = LocalDateTime.now();
        this.Datahora = datahora;
    }
    
    
      
      
           
        
    }
  
