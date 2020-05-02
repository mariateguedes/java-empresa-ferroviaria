
package ferrovia;
import static java.lang.System.console;
import java.util.Scanner; 
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.function.Consumer;

 

public class Ferrovia {
        public static void main(String[] args) {
            
            
            
                Scanner in = new Scanner(System.in); 
            
                ArrayList<EstacaoFerroviaria> Estacoes = new ArrayList<>();
                ArrayList<Linha> Linhas = new ArrayList<>();
                ArrayList<Trem> Trens = new ArrayList<>();
                ArrayList<Locomotiva> Locomotivas = new ArrayList<>();
                ArrayList<VagaoLiquido> VagoesLiquidos = new ArrayList<>();
                ArrayList<VagaoBobina> VagoesBobinas = new ArrayList<>();
                ArrayList<VagaoGondola> VagoesGondolas = new ArrayList<>();
                ArrayList<VagaoConteineres> VagoesConteineres = new ArrayList<>();
                ArrayList<VagaoBoxCar> VagoesBoxCar = new ArrayList<>();
                ArrayList<VagaoHighCube> VagoesHighCube = new ArrayList<>();
                
        
            int menu = 0;      
            
        do {
        
        switch(menu) {   
            
            default:  /* Menu Principal */
                
                System.out.println("---------------RFFSA FERROVIAS---------------");
                System.out.println("Digite 1: Estações Ferroviárias.");
                System.out.println("Digite 2: Linhas Ferroviárias.");
                System.out.println("Digite 3: Trens.");
                System.out.println("Digite 4: Locomotivas.");
                System.out.println("Digite 5: Vagões.");
                System.out.println("Digite 6: Outras opções.");
                                
                menu = in.nextInt();
        
            case 0:  /* Menu Principal */
                                       
                System.out.println("---------------RFFSA FERROVIAS---------------");
                System.out.println("Digite 1: Estações Ferroviárias");
                System.out.println("Digite 2: Linhas Ferroviárias.");
                System.out.println("Digite 3: Trens.");
                System.out.println("Digite 4: Locomotivas.");
                System.out.println("Digite 5: Vagões.");
                System.out.println("Digite 6: Outras opções.");
                              
                menu = in.nextInt();
        
                 break;
        
            case 1: /* Estação Ferroviária */
    
                System.out.println("Digite 1: Para criar uma nova Estação.");
                System.out.println("Digite 2: Para visualizar Estações disponíveis:");
                int menu1 = in.nextInt();
                
                do {
                switch(menu1) { 
                        
                    case 1:
                    System.out.println("Sigla da Estação Ferroviária: ");
                    String sigla = in.next();
                    
                    System.out.println("Descrição: ");
                    String descricao = in.next();
                    
                    EstacaoFerroviaria Estacao = new EstacaoFerroviaria(sigla, descricao);
                    Estacao.setSigla(sigla);
                    Estacao.setDescricao(descricao);
                    Estacoes.add(Estacao);
                    
                    System.out.println("Digite 0 para retornar ao menu inicial.");
                    menu = in.nextInt(); 
                    menu1 = 3;
                    break;
                                       
                
                    case 2:
                    
                    System.out.println("Quantidade de estações disponíveis: " + Estacoes.size());
                        
                    for (int i = 0; i < Estacoes.size(); i++) {
                                            EstacaoFerroviaria estacao = Estacoes.get(i);
                                            System.out.println(estacao.toString());
                                            
                                }
                    
                    System.out.println("Digite 0 para retornar ao menu inicial.");
                    menu = in.nextInt(); 
                    menu1 = 3;
                    break;
                    
                }
                } while (menu1 != 3);
                
                break;
                
            case 2:  /* Linhas */
                
                System.out.println("Digite 1: Para adicionar uma nova linha.");                      
                System.out.println("Digite 2: Para visualizar linhas disponíveis:");
                
                int menulinhas = in.nextInt();
                
                do {
                switch(menulinhas) { 
                    
                    case 1:
                        
                            if (Estacoes.isEmpty()) {
                                System.out.println("Você deve adicionar uma Estação antes de criar uma linha");
                                
                                System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menulinhas = 3;
                            }
                            
                            
                            
                            else {
                                
                                System.out.println("Número: ");
                                int numero = in.nextInt();
                                
                                System.out.println("Extensão: ");
                                double extensao = in.nextDouble();
                                
                                System.out.println("Cidade de origem: ");
                                String origem = in.next();
                                
                                
                                
                                System.out.println("Cidade de destino: ");
                                String destino = in.next();
                                
                                
                                
                                if (destino.equals(origem)) {
                                    System.out.println("Cidade de origem e destino devem ser diferentes.");
                                    System.out.println("Digite novamente a cidade de destino: ");
                                    destino = in.next();
                                    
                                }
                                System.out.println("Tipo de carga: ");
                                String tipoCarga = in.next();
                                
                                System.out.println("Peso da carga: ");
                                float pesoCarga = in.nextFloat();
                                
                                System.out.println("Descrição: ");
                                String descricao = in.next();
                                
                                Linha linha = new Linha(numero, extensao, origem, destino, tipoCarga, pesoCarga, descricao);
                                Linhas.add(linha);
                                
                                System.out.println("Escolha a estação em que a linha " + numero + " será adicionada: ");
                                
                                for (int i = 0; i < Estacoes.size(); i++) {
                                            EstacaoFerroviaria estacao = Estacoes.get(i);
                                            System.out.println("Estação " + i + ": " + estacao.toString());
                                            
                                }
                                System.out.println("Estação número: ");
                                int numlinha = in.nextInt();
                                System.out.println("A linha " + numero + " foi adicionada com êxito à estação " + numlinha + ".");
                                
                                System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menulinhas = 3;
                            }
                        
                        break;
                        
                    case 2:
                        
                        System.out.println("Quantidade de linhas disponíveis: " + Linhas.size());
                        
                        for (int i = 0; i < Linhas.size(); i++) {
                            Linha linha = Linhas.get(i);
                            System.out.println(linha.toString());
                                            
                                }
                        System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menulinhas = 3;
                        
                        break;
                
                }
                } while (menulinhas != 3);
                break;    
                
            case 3:  /* Trens */
                
                System.out.println("Digite 1: Para adicionar um novo trem.");
                System.out.println("Digite 2: Para visualizar trens disponíveis:");
                
                int menutrens = in.nextInt();
                
                do{
                switch(menutrens)  {
                    case 1:
                        
                        System.out.println("Escolha o tipo de trem a ser criado: ");
                        System.out.println("Digite 1: Criar trem utilizando Vagão para graneis líquidos.");
                        System.out.println("Digite 2: Criar trem utilizando Vagão para transporte de bobinas.");
                        System.out.println("Digite 3: Criar trem utilizando Vagão tipo Gôndola.");
                        System.out.println("Digite 4: Criar trem utilizando Vagão Plataforma para Conteineres.");
                        System.out.println("Digite 5: Criar trem utilizando Vagão All Door Box Car.");
                        System.out.println("Digite 6: Criar trem utilizando Vagão High Cube.");
                        
                        int menutipotrem = in.nextInt();
                        
                            do {
                            switch(menutipotrem) {
                                
                                case 1:    /* Trem para graneis líquidos */
                                    
                                    if (VagoesLiquidos.size() < 1) {
                                        System.out.println("Não há vagões disponíveis para serem adicionados no novo trem.");
                                    }      
                                    
                                    else if (Locomotivas.size() < 1) {
                                        System.out.println("Não há locomotivas disponíveis para serem adicionados no novo trem.");
                                    }
                                    else if (Locomotivas.size() < 1 && VagoesLiquidos.size() < 1) {
                                        System.out.println("Não há locomotivas e vagóes disponíveis para serem adicionados no novo trem.");
                                    }
                                    else if (Estacoes.size() < 2) {
                                        System.out.println("Pelo menos duas estações devem estar adicionadas para que um trem possa ser adicionado.");   
                                    }                  
                                    else {
                                        
                                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                                        LocalDateTime now = LocalDateTime.now();
                                        
                                        System.out.println("Nome: ");
                                        String nome = in.next();
                                        
                                        System.out.println("Prefixo do trem: ");                  
                                        String preftrem = in.next();
                                        
                                        
                                        Trem trem = new Trem(preftrem, LocalDateTime.now());
                                        Trens.add(trem);
                                        
                                        
                                        System.out.println("Estações disponíveis: ");
                                         for (int i = 0; i < Estacoes.size(); i++) {
                                            EstacaoFerroviaria Estacao = Estacoes.get(i);
                                            System.out.println("Estacão: " + i);
                                            System.out.println("Sigla: " + Estacao.getSigla());
                                            System.out.println("Descrição: " + Estacao.getDescricao());
                                            
                                        }
                                         
                                         System.out.println("Escolha o número da estação de origem: ");
                                         int estorigem = in.nextInt();
                                         System.out.println("Escolha o número da estação de destino: ");
                                         int estdestino = in.nextInt();
                                                 
                                                                               
                                        Locomotiva locos = Locomotivas.get(0);
                                        VagaoLiquido vagliq = VagoesLiquidos.get(0);
                                        trem.adicionarRecFerrovLocomotiva(locos);
                                        trem.adicionarRecFerrovVagao(vagliq);
                                         
                                        VagoesLiquidos.remove(0);  
                                        Locomotivas.remove(0);
                                        
                                        System.out.println("Trem adicionado com sucesso.");
                                        
                                    }
                                    
                                                                        
                                    System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menutipotrem = 7;
                                    
                                    break;
                                    
                                case 2:     /* Trem para transporte de bobinas. */
                                    
                                    if (VagoesBobinas.size() < 1) {
                                        System.out.println("Não há vagões disponíveis para serem adicionados no novo trem.");
                                    }      
                                    
                                    else if (Locomotivas.size() < 1) {
                                        System.out.println("Não há locomotivas disponíveis para serem adicionados no novo trem.");
                                    }
                                    else if (Locomotivas.size() < 1 && VagoesBobinas.size() < 1) {
                                        System.out.println("Não há locomotivas e vagóes disponíveis para serem adicionados no novo trem.");
                                    }
                                    else if (Estacoes.size() < 2) {
                                        System.out.println("Pelo menos duas estações devem estar adicionadas para que um trem possa ser adicionado.");   
                                    } 
                                    else {
                                        
                                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                                        LocalDateTime now = LocalDateTime.now();
                                        
                                        System.out.println("Nome: ");
                                        String nome = in.next();
                                        
                                        System.out.println("Prefixo do trem: ");                  
                                        String preftrem = in.next();
                                        
                                        
                                        Trem trem = new Trem(preftrem, LocalDateTime.now());
                                        Trens.add(trem);
                                        
                                        
                                        System.out.println("Estações disponíveis: ");
                                         for (int i = 0; i < Estacoes.size(); i++) {
                                            EstacaoFerroviaria Estacao = Estacoes.get(i);
                                            System.out.println("Estacão: " + i);
                                            System.out.println("Sigla: " + Estacao.getSigla());
                                            System.out.println("Descrição: " + Estacao.getDescricao());
                                            
                                        }
                                         
                                         System.out.println("Escolha o número da estação de origem: ");
                                         int estorigem = in.nextInt();
                                         System.out.println("Escolha o número da estação de destino: ");
                                         int estdestino = in.nextInt();
                                                 
                                                                               
                                        Locomotiva locos = Locomotivas.get(0);
                                        VagaoBobina vagbob = VagoesBobinas.get(0);
                                        trem.adicionarRecFerrovLocomotiva(locos);
                                        trem.adicionarRecFerrovVagao(vagbob);
                                         
                                        VagoesBobinas.remove(0);  
                                        Locomotivas.remove(0);
                                        
                                        System.out.println("Trem adicionado com sucesso.");
                                    }   
                                    
                                    System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menutipotrem = 7;
                                    
                                    break;
                                    
                                case 3:     /* Trem tipo Gôndola.  */
                                    
                                    if (VagoesGondolas.size() < 1) {
                                        System.out.println("Não há vagões disponíveis para serem adicionados no novo trem.");
                                    }      
                                    
                                    else if (Locomotivas.size() < 1) {
                                        System.out.println("Não há locomotivas disponíveis para serem adicionados no novo trem.");
                                    }
                                    else if (Locomotivas.size() < 1 && VagoesGondolas.size() < 1) {
                                        System.out.println("Não há locomotivas e vagóes disponíveis para serem adicionados no novo trem.");
                                    }
                                    else if (Estacoes.size() < 2) {
                                        System.out.println("Pelo menos duas estações devem estar adicionadas para que um trem possa ser adicionado.");   
                                    } 
                                    else {
                                        
                                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                                        LocalDateTime now = LocalDateTime.now();
                                        
                                        System.out.println("Nome: ");
                                        String nome = in.next();
                                        
                                        System.out.println("Prefixo do trem: ");                  
                                        String preftrem = in.next();
                                        
                                        
                                        Trem trem = new Trem(preftrem, LocalDateTime.now());
                                        Trens.add(trem);
                                        
                                        
                                        System.out.println("Estações disponíveis: ");
                                         for (int i = 0; i < Estacoes.size(); i++) {
                                            EstacaoFerroviaria Estacao = Estacoes.get(i);
                                            System.out.println("Estacão: " + i);
                                            System.out.println("Sigla: " + Estacao.getSigla());
                                            System.out.println("Descrição: " + Estacao.getDescricao());
                                            
                                        }
                                         
                                         System.out.println("Escolha o número da estação de origem: ");
                                         int estorigem = in.nextInt();
                                         System.out.println("Escolha o número da estação de destino: ");
                                         int estdestino = in.nextInt();
                                                 
                                                                               
                                        Locomotiva locos = Locomotivas.get(0);
                                        VagaoGondola vaggond = VagoesGondolas.get(0);
                                        trem.adicionarRecFerrovLocomotiva(locos);
                                        trem.adicionarRecFerrovVagao(vaggond);
                                         
                                        VagoesGondolas.remove(0);  
                                        Locomotivas.remove(0);
                                        
                                        System.out.println("Trem adicionado com sucesso.");
                                    } 
                                    
                                    System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menutipotrem = 7;
                                    
                                    
                                    break;
                                    
                                case 4:     /* Vagão Plataforma para Conteineres. */
                                    
                                    if (VagoesConteineres.size() < 1) {
                                        System.out.println("Não há vagões disponíveis para serem adicionados no novo trem.");
                                    }      
                                    
                                    else if (Locomotivas.size() < 1) {
                                        System.out.println("Não há locomotivas disponíveis para serem adicionados no novo trem.");
                                    }
                                    else if (Locomotivas.size() < 1 && VagoesConteineres.size() < 1) {
                                        System.out.println("Não há locomotivas e vagóes disponíveis para serem adicionados no novo trem.");
                                    }
                                    else if (Estacoes.size() < 2) {
                                        System.out.println("Pelo menos duas estações devem estar adicionadas para que um trem possa ser adicionado.");   
                                    } 
                                    else {
                                        
                                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                                        LocalDateTime now = LocalDateTime.now();
                                        
                                        System.out.println("Nome: ");
                                        String nome = in.next();
                                        
                                        System.out.println("Prefixo do trem: ");                  
                                        String preftrem = in.next();
                                        
                                        
                                        Trem trem = new Trem(preftrem, LocalDateTime.now());
                                        Trens.add(trem);
                                        
                                        
                                        System.out.println("Estações disponíveis: ");
                                         for (int i = 0; i < Estacoes.size(); i++) {
                                            EstacaoFerroviaria Estacao = Estacoes.get(i);
                                            System.out.println("Estacão: " + i);
                                            System.out.println("Sigla: " + Estacao.getSigla());
                                            System.out.println("Descrição: " + Estacao.getDescricao());
                                            
                                        }
                                         
                                         System.out.println("Escolha o número da estação de origem: ");
                                         int estorigem = in.nextInt();
                                         System.out.println("Escolha o número da estação de destino: ");
                                         int estdestino = in.nextInt();
                                                 
                                                                               
                                        Locomotiva locos = Locomotivas.get(0);
                                        VagaoConteineres vagcont = VagoesConteineres.get(0);
                                        trem.adicionarRecFerrovLocomotiva(locos);
                                        trem.adicionarRecFerrovVagao(vagcont);
                                         
                                        VagoesConteineres.remove(0);  
                                        Locomotivas.remove(0);
                                        
                                        System.out.println("Trem adicionado com sucesso.");
                                    } 
                                    
                                    System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menutipotrem = 7;
                                    
                                    
                                    break;
                                    
                                case 5:    /* Vagão All Door Box Car. */
                                    
                                    if (VagoesBoxCar.size() < 1) {
                                        System.out.println("Não há vagões disponíveis para serem adicionados no novo trem.");
                                    }      
                                    
                                    else if (Locomotivas.size() < 1) {
                                        System.out.println("Não há locomotivas disponíveis para serem adicionados no novo trem.");
                                    }
                                    else if (Locomotivas.size() < 1 && VagoesBoxCar.size() < 1) {
                                        System.out.println("Não há locomotivas e vagóes disponíveis para serem adicionados no novo trem.");
                                    }
                                    else if (Estacoes.size() < 2) {
                                        System.out.println("Pelo menos duas estações devem estar adicionadas para que um trem possa ser adicionado.");   
                                    } 
                                    else {
                                        
                                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                                        LocalDateTime now = LocalDateTime.now();
                                        
                                        System.out.println("Nome: ");
                                        String nome = in.next();
                                        
                                        System.out.println("Prefixo do trem: ");                  
                                        String preftrem = in.next();
                                        
                                        
                                        Trem trem = new Trem(preftrem, LocalDateTime.now());
                                        Trens.add(trem);
                                        
                                        
                                        System.out.println("Estações disponíveis: ");
                                         for (int i = 0; i < Estacoes.size(); i++) {
                                            EstacaoFerroviaria Estacao = Estacoes.get(i);
                                            System.out.println("Estacão: " + i);
                                            System.out.println("Sigla: " + Estacao.getSigla());
                                            System.out.println("Descrição: " + Estacao.getDescricao());
                                            
                                        }
                                         
                                         System.out.println("Escolha o número da estação de origem: ");
                                         int estorigem = in.nextInt();
                                         System.out.println("Escolha o número da estação de destino: ");
                                         int estdestino = in.nextInt();
                                                 
                                                                               
                                        Locomotiva locos = Locomotivas.get(0);
                                        VagaoBoxCar vagbox = VagoesBoxCar.get(0);
                                        trem.adicionarRecFerrovLocomotiva(locos);
                                        trem.adicionarRecFerrovVagao(vagbox);
                                         
                                        VagoesBoxCar.remove(0);  
                                        Locomotivas.remove(0);
                                        
                                        System.out.println("Trem adicionado com sucesso.");
                                    } 
                                    
                                    System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menutipotrem = 7;
                                    
                                    
                                    break;
                                    
                                case 6:     /* Vagão High Cube. */
                                    
                                    if (VagoesHighCube.size() < 1) {
                                        System.out.println("Não há vagões disponíveis para serem adicionados no novo trem.");
                                    }      
                                    
                                    else if (Locomotivas.size() < 1) {
                                        System.out.println("Não há locomotivas disponíveis para serem adicionados no novo trem.");
                                    }
                                    else if (Locomotivas.size() < 1 && VagoesHighCube.size() < 1) {
                                        System.out.println("Não há locomotivas e vagóes disponíveis para serem adicionados no novo trem.");
                                    }
                                    else if (Estacoes.size() < 2) {
                                        System.out.println("Pelo menos duas estações devem estar adicionadas para que um trem possa ser adicionado.");   
                                    } 
                                    else {
                                        
                                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                                        LocalDateTime now = LocalDateTime.now();
                                        
                                        System.out.println("Nome: ");
                                        String nome = in.next();
                                        
                                        System.out.println("Prefixo do trem: ");                  
                                        String preftrem = in.next();
                                        
                                        
                                        Trem trem = new Trem(preftrem, LocalDateTime.now());
                                        Trens.add(trem);
                                        
                                        
                                        System.out.println("Estações disponíveis: ");
                                         for (int i = 0; i < Estacoes.size(); i++) {
                                            EstacaoFerroviaria Estacao = Estacoes.get(i);
                                            System.out.println("Estacão: " + i);
                                            System.out.println("Sigla: " + Estacao.getSigla());
                                            System.out.println("Descrição: " + Estacao.getDescricao());
                                            
                                        }
                                         
                                         System.out.println("Escolha o número da estação de origem: ");
                                         int estorigem = in.nextInt();
                                         System.out.println("Escolha o número da estação de destino: ");
                                         int estdestino = in.nextInt();
                                                 
                                                                               
                                        Locomotiva locos = Locomotivas.get(0);
                                        VagaoHighCube vaghigh = VagoesHighCube.get(0);
                                        trem.adicionarRecFerrovLocomotiva(locos);
                                        trem.adicionarRecFerrovVagao(vaghigh);
                                         
                                        VagoesHighCube.remove(0);  
                                        Locomotivas.remove(0);
                                        
                                        System.out.println("Trem adicionado com sucesso.");
                                    } 
                                    
                                    System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menutipotrem = 7;
                                    
                                    
                                    break;
                                                 
                                
                            }  
                            } while (menutipotrem != 7);
                        
                                                
                        break;
                        
                    case 2:
                        
                        System.out.println("Trens disponíveis: ");
                        for (int i = 0; i < Trens.size(); i++) {
                            Trem trem = Trens.get(i);
                            System.out.print("Trem " + i + ":");
                            System.out.println(trem.toString());
                                            
                        }
                        
                        System.out.println("Digite 0 para retornar ao menu inicial.");
                        menu = in.nextInt();
                        
                        break;                    
                    
                }   
                } while (menu != 0);
                
                break;
                             
                
            case 4: /* Locomotivas */
                
                System.out.println("Digite 1: Para adicionar uma nova locomotiva.");
                System.out.println("Digite 2: Para visualizar locomotivas disponíveis:");
                
                int menulocomotivas = in.nextInt();
                
                do{
                switch(menulocomotivas) {
                    
                    case 1:
                            System.out.println("------Adicionando nova Locomotiva------");
                            System.out.println("Digite o número da locomotiva: ");
                            int numeroloc = in.nextInt();
                            System.out.println("Digite a capacidade de tração: ");
                            int captracao = in.nextInt();
                            System.out.println("Digite a capacidade de peso: ");
                            int cappeso = in.nextInt();
                            System.out.println("Digite o comprimento: ");
                            int comploc = in.nextInt();
                            
                            Locomotiva Loc = new Locomotiva(numeroloc, captracao, cappeso, comploc);
                            Locomotivas.add(Loc);
                            
                            System.out.println("Digite 0 para retornar ao menu inicial.");
                            menu = in.nextInt(); 
                            menulocomotivas = 3;
                            
                        
                            break;
                            
                    case 2:
                            System.out.println("Quantidade de locomotivas disponíveis: " + Locomotivas.size());
                        
                            for (int i = 0; i < Locomotivas.size(); i++) {
                                            Locomotiva loc = Locomotivas.get(i);
                                            System.out.println(loc.toString());
                                            
                                }
                    
                            System.out.println("Digite 0 para retornar ao menu inicial.");
                            menu = in.nextInt(); 
                            menulocomotivas = 3;
                   
                        
                            break;
                    
                }
                } while(menulocomotivas != 3);
                
                break;       
                
            case 5: /* Vagoes */
                
                System.out.println("Digite 1: Para criar um novo vagão.");
                System.out.println("Digite 2: Para visualizar vagões disponíveis:");
                int menuvagoes = in.nextInt();
                
                do {
                switch(menuvagoes) { 
                    
                    case 1: 
                        System.out.println("Qual tipo de vagão deseja criar? ");
                        System.out.println("Digite 1: Para criar um Vagão para graneis líquidos.");
                        System.out.println("Digite 2: Para criar um Vagão para transporte de bobinas.");
                        System.out.println("Digite 3: Para criar um Vagão tipo Gôndola.");
                        System.out.println("Digite 4: Para criar um Vagão Plataforma para Conteineres.");
                        System.out.println("Digite 5: Para criar um Vagão All Door Box Car.");
                        System.out.println("Digite 6: Para criar um Vagão High Cube.");
                        
                        int menutipovagao = in.nextInt();
                        
                            do {
                            switch(menutipovagao) {
                                
                                case 1:    /* Vagão para graneis líquidos */
                                    
                                    System.out.println("Digite o número do vagão: ");
                                    int numerol = in.nextInt();
                                    
                                    System.out.println("Digite a capacidade de carga do vagão: ");
                                    float capCargal = in.nextFloat();
                                    
                                    VagaoLiquido VagaoL = new VagaoLiquido(numerol, capCargal);
                                    VagoesLiquidos.add(VagaoL);
                                                                        
                                    System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menutipovagao = 7;
                                    
                                    break;
                                    
                                case 2:     /* Vagão para transporte de bobinas. */
                                    
                                    System.out.println("Digite o número do vagão: ");
                                    int numerob = in.nextInt();
                                    
                                    System.out.println("Digite a capacidade de carga do vagão: ");
                                    float capCargab = in.nextFloat();
                                    
                                    VagaoBobina VagaoB = new VagaoBobina(numerob, capCargab);
                                    VagoesBobinas.add(VagaoB);
                                    
                                    System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menutipovagao = 7;
                                    
                                    break;
                                    
                                case 3:     /* Vagão tipo Gôndola.  */
                                    
                                    System.out.println("Digite o número do vagão: ");
                                    int numerog = in.nextInt();
                                    
                                    System.out.println("Digite a capacidade de carga do vagão: ");
                                    float capCargag = in.nextFloat();
                                    
                                    VagaoGondola VagaoG = new VagaoGondola(numerog, capCargag);
                                    VagoesGondolas.add(VagaoG);
                                    
                                    System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menutipovagao = 7;
                                    
                                    
                                    break;
                                    
                                case 4:     /* Vagão Plataforma para Conteineres. */
                                    
                                    System.out.println("Digite o número do vagão: ");
                                    int numeroc = in.nextInt();
                                    
                                    System.out.println("Digite a capacidade de carga do vagão: ");
                                    float capCargac = in.nextFloat();
                                    
                                    VagaoConteineres VagaoC = new VagaoConteineres(numeroc, capCargac);
                                    VagoesConteineres.add(VagaoC);
                                    
                                    System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menutipovagao = 7;
                                    
                                    
                                    break;
                                    
                                case 5:    /* Vagão All Door Box Car. */
                                    
                                    System.out.println("Digite o número do vagão: ");
                                    int numerobc = in.nextInt();
                                    
                                    System.out.println("Digite a capacidade de carga do vagão: ");
                                    float capCargabc = in.nextFloat();
                                    
                                    VagaoBoxCar VagaoBC = new VagaoBoxCar(numerobc, capCargabc);
                                    VagoesBoxCar.add(VagaoBC);
                                    
                                    System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menutipovagao = 7;
                                    
                                    
                                    break;
                                    
                                case 6:     /* Vagão High Cube. */
                                    
                                    System.out.println("Digite o número do vagão: ");
                                    int numerohc = in.nextInt();
                                    
                                    System.out.println("Digite a capacidade de carga do vagão: ");
                                    float capCargahc = in.nextFloat();
                                    
                                    VagaoHighCube VagaoHC = new VagaoHighCube(numerohc, capCargahc);
                                    VagoesHighCube.add(VagaoHC);
                                    
                                    System.out.println("Digite 0 para retornar ao menu inicial.");
                                    menu = in.nextInt(); 
                                    menutipovagao = 7;
                                    
                                    
                                    break;
                                
                                            
                                
                            }  
                            } while (menutipovagao != 7);  /* Não sei se aqui é 3 mesmo  */
                        
                        
                        
                        break;  /* Break do case 1 do Menu dos Vagões  */
                        
                    case 2:
                              
                        System.out.println("Quantidade de vagões disponíveis: ");
                        System.out.println("Vagão para graneis líquidos: " + VagoesLiquidos.size());
                        for (int i = 0; i < VagoesLiquidos.size(); i++) {
                                            VagaoLiquido vl = VagoesLiquidos.get(i);
                                            System.out.println(vl.toString());
                                            
                        }
                        System.out.println("Vagão para transporte de bobinas: " + VagoesBobinas.size());
                        System.out.println("Vagão tipo Gôndola: " + VagoesGondolas.size());
                        System.out.println("Vagão Plataforma para Conteineres: " + VagoesConteineres.size());
                        System.out.println("Vagão All Door Box Car: " + VagoesBoxCar.size());
                        System.out.println("Vagão High Cube: " + VagoesHighCube.size());
                        
                        
                        System.out.println("Digite 0 para retornar ao menu inicial.");
                        menu = in.nextInt(); 
                        menu1 = 3;
                        break;
                    
                    
                    
                }
                } while (menu != 0);    
                break;   
                   
        
            case 6: /*  Outras opções  */
                
                System.out.println("Digite 1: Para adicionar novos vagões aos trens já disponíveis.");
                System.out.println("Digite 2: Para visualizar recursos de cada trem.");
                int menuopcoes = in.nextInt();
                
                do {
                switch(menuopcoes) {
                
                    case 1:
                    
                    System.out.println("Trens disponíveis: ");
                    for (int i = 0; i < Trens.size(); i++) {
                                            Trem trem = Trens.get(i);
                                            System.out.print("Trem " + i + ":");
                                            System.out.println(trem.toString());
                                            
                    }
                    System.out.println("Número do trem escolhido: ");
                    int numtrem = in.nextInt();
                    
                    System.out.print("Trem escolhido: ");
                    System.out.println(Trens.get(numtrem));
                    
                    Trem trem01 = Trens.get(numtrem);
                    
                    
                    int cont = 0;
                    int i = 0;
                    String resp = "S";                    
                    int numloc = 0;
                    
                    for (Object obj : trem01.RecFerrov) {
                        i++;
                        if (obj instanceof Vagao) {
                            cont = cont + 1;
                        }
                        else {
                            
                            numloc = i;
                            
                        }
                    }
                    
                    
                    if (trem01.RecFerrov.size() >= 15) {
                        System.out.println("Esse trem já está cheio. Não é possível adicionar novos recursos.");
                    }
                    
                    else {
                        
                        if (cont%4 == 0) {
                            
                            System.out.println("Uma nova locomotiva deve ser adicionada pra continuar adicionando vagões.");
                            System.out.println("Deseja adicionar uma nova locomotiva ao trem? S/N");
                            resp = in.next();
                        
                                if (resp.equals("S")) {
                                    if (Locomotivas.size() >= 1) {
                                        trem01.adicionarRecFerrovLocomotiva(Locomotivas.get(0));
                                        Locomotivas.remove(0);
                                        System.out.println("Locomotiva adicionada com sucesso.");
                                    }
                                else {
                                    System.out.println("Você deve adicionar novas locomotivas ao sistema antes de colocá-las no trem.");
                                }
                                                       
                            }
                            
                        }
                        
                        else {
                         
                        String tipovag = "Sem Tipo";
                        
                        for (Object obj : trem01.RecFerrov) {
                        
                            if (obj instanceof Vagao) {
                                tipovag = ((Vagao) obj).getTipo();
                            }
                                                 
                        }
                        
                        if (tipovag == "Liquido") {
                            
                            if (VagoesLiquidos.size() == 0) {
                                System.out.println("Não há vagão para ser adicionado. ");
                            }
                            else {
                                trem01.adicionarRecFerrovVagao(VagoesLiquidos.get(0));
                                VagoesLiquidos.remove(0); 
                                
                                float cargatot = 0;
                                float pesotot = 0;
                                int num = 0;
                    
                                for (Object obj : trem01.RecFerrov) {
                        
                                    if (obj instanceof Locomotiva) {
                                    pesotot = ((Locomotiva) obj).getCapPeso();
                                    num = 0;
                                    cargatot = 0;
                                    }       
                        
                                    else if (obj instanceof Vagao) {
                                                     
                                    num = num + 1;
                                    
                                    
                            
                                    cargatot = cargatot + ((Vagao) obj).getCapCarga();
                                    
                                    
                                            
                                    }
                        
                        
                                }
                                
                                
                                if (cargatot >= pesotot) {
                                    
                                    System.out.println("Uma nova locomotiva deve ser adicionada pra continuar adicionando vagões.");
                                    System.out.println("Deseja adicionar uma nova locomotiva ao trem? S/N");
                                    resp = in.next();
                        
                                        if (resp.equals("S")) {
                                            if (Locomotivas.size() >= 1) {
                                            trem01.adicionarRecFerrovLocomotiva(Locomotivas.get(0));
                                            Locomotivas.remove(0);
                                            System.out.println("Locomotiva adicionada com sucesso.");
                                        }
                                            else {
                                                System.out.println("Você deve adicionar novas locomotivas ao sistema antes de colocá-las no trem.");
                                            }
                                                       
                                        }       
                                
                                }
                                
                                else {
                                    System.out.println("Vagão adicionado com sucesso.");
                                }    
                            }    
                        }
                        else if (tipovag == "Bob") {
                            
                            if (VagoesBobinas.size() == 0) {
                                System.out.println("Não há vagão para ser adicionado. ");
                            }
                            else {
                                trem01.adicionarRecFerrovVagao(VagoesBobinas.get(0));
                                VagoesBobinas.remove(0); 
                                
                                float cargatot = 0;
                                float pesotot = 0;
                                int num = 0;
                    
                                for (Object obj : trem01.RecFerrov) {
                        
                                    if (obj instanceof Locomotiva) {
                                    pesotot = ((Locomotiva) obj).getCapPeso();
                                    num = 0;
                                    cargatot = 0;
                                    }       
                        
                                    else if (obj instanceof Vagao) {
                                                     
                                    num = num + 1;
                                    
                                    
                            
                                    cargatot = cargatot + ((Vagao) obj).getCapCarga();
                                    
                                    
                                            
                                    }
                        
                        
                                }
                                
                                
                                if (cargatot >= pesotot) {
                                    
                                    System.out.println("Uma nova locomotiva deve ser adicionada pra continuar adicionando vagões.");
                                    System.out.println("Deseja adicionar uma nova locomotiva ao trem? S/N");
                                    resp = in.next();
                        
                                        if (resp.equals("S")) {
                                            if (Locomotivas.size() >= 1) {
                                            trem01.adicionarRecFerrovLocomotiva(Locomotivas.get(0));
                                            Locomotivas.remove(0);
                                            System.out.println("Locomotiva adicionada com sucesso.");
                                        }
                                            else {
                                                System.out.println("Você deve adicionar novas locomotivas ao sistema antes de colocá-las no trem.");
                                            }
                                                       
                                        }       
                                
                                }
                                
                                else {
                                    System.out.println("Vagão adicionado com sucesso.");
                                }    
                            }
                        }
                        else if (tipovag == "Gond") {
                            
                            if (VagoesGondolas.size() == 0) {
                                System.out.println("Não há vagão para ser adicionado. ");
                            }
                            else {
                                trem01.adicionarRecFerrovVagao(VagoesGondolas.get(0));
                                VagoesGondolas.remove(0); 
                                
                                float cargatot = 0;
                                float pesotot = 0;
                                int num = 0;
                    
                                for (Object obj : trem01.RecFerrov) {
                        
                                    if (obj instanceof Locomotiva) {
                                    pesotot = ((Locomotiva) obj).getCapPeso();
                                    num = 0;
                                    cargatot = 0;
                                    }       
                        
                                    else if (obj instanceof Vagao) {
                                                     
                                    num = num + 1;
                                    
                                    
                            
                                    cargatot = cargatot + ((Vagao) obj).getCapCarga();
                                    
                                    
                                            
                                    }
                        
                        
                                }
                                
                                
                                if (cargatot >= pesotot) {
                                    
                                    System.out.println("Uma nova locomotiva deve ser adicionada pra continuar adicionando vagões.");
                                    System.out.println("Deseja adicionar uma nova locomotiva ao trem? S/N");
                                    resp = in.next();
                        
                                        if (resp.equals("S")) {
                                            if (Locomotivas.size() >= 1) {
                                            trem01.adicionarRecFerrovLocomotiva(Locomotivas.get(0));
                                            Locomotivas.remove(0);
                                            System.out.println("Locomotiva adicionada com sucesso.");
                                        }
                                            else {
                                                System.out.println("Você deve adicionar novas locomotivas ao sistema antes de colocá-las no trem.");
                                            }
                                                       
                                        }       
                                
                                }
                                
                                else {
                                    System.out.println("Vagão adicionado com sucesso.");
                                }    
                            }
                        }
                        else if (tipovag == "Cont") {
                            
                            if (VagoesConteineres.size() == 0) {
                                System.out.println("Não há vagão para ser adicionado. ");
                            }
                            else {
                                trem01.adicionarRecFerrovVagao(VagoesConteineres.get(0));
                                VagoesConteineres.remove(0); 
                                
                                float cargatot = 0;
                                float pesotot = 0;
                                int num = 0;
                    
                                for (Object obj : trem01.RecFerrov) {
                        
                                    if (obj instanceof Locomotiva) {
                                    pesotot = ((Locomotiva) obj).getCapPeso();
                                    num = 0;
                                    cargatot = 0;
                                    }       
                        
                                    else if (obj instanceof Vagao) {
                                                     
                                    num = num + 1;
                                    
                                    
                            
                                    cargatot = cargatot + ((Vagao) obj).getCapCarga();
                                    
                                    
                                            
                                    }
                        
                        
                                }
                                
                                
                                if (cargatot >= pesotot) {
                                    
                                    System.out.println("Uma nova locomotiva deve ser adicionada pra continuar adicionando vagões.");
                                    System.out.println("Deseja adicionar uma nova locomotiva ao trem? S/N");
                                    resp = in.next();
                        
                                        if (resp.equals("S")) {
                                            if (Locomotivas.size() >= 1) {
                                            trem01.adicionarRecFerrovLocomotiva(Locomotivas.get(0));
                                            Locomotivas.remove(0);
                                            System.out.println("Locomotiva adicionada com sucesso.");
                                        }
                                            else {
                                                System.out.println("Você deve adicionar novas locomotivas ao sistema antes de colocá-las no trem.");
                                            }
                                                       
                                        }       
                                
                                }
                                
                                else {
                                    System.out.println("Vagão adicionado com sucesso.");
                                }    
                            }
                        }
                        else if (tipovag == "Box") {
                            
                            if (VagoesBoxCar.size() == 0) {
                                System.out.println("Não há vagão para ser adicionado. ");
                            }
                            else {
                                trem01.adicionarRecFerrovVagao(VagoesBoxCar.get(0));
                                VagoesBoxCar.remove(0); 
                                
                                float cargatot = 0;
                                float pesotot = 0;
                                int num = 0;
                    
                                for (Object obj : trem01.RecFerrov) {
                        
                                    if (obj instanceof Locomotiva) {
                                    pesotot = ((Locomotiva) obj).getCapPeso();
                                    num = 0;
                                    cargatot = 0;
                                    }       
                        
                                    else if (obj instanceof Vagao) {
                                                     
                                    num = num + 1;
                                    
                                    
                            
                                    cargatot = cargatot + ((Vagao) obj).getCapCarga();
                                    
                                    
                                            
                                    }
                        
                        
                                }
                                
                                
                                if (cargatot >= pesotot) {
                                    
                                    System.out.println("Uma nova locomotiva deve ser adicionada pra continuar adicionando vagões.");
                                    System.out.println("Deseja adicionar uma nova locomotiva ao trem? S/N");
                                    resp = in.next();
                        
                                        if (resp.equals("S")) {
                                            if (Locomotivas.size() >= 1) {
                                            trem01.adicionarRecFerrovLocomotiva(Locomotivas.get(0));
                                            Locomotivas.remove(0);
                                            System.out.println("Locomotiva adicionada com sucesso.");
                                        }
                                            else {
                                                System.out.println("Você deve adicionar novas locomotivas ao sistema antes de colocá-las no trem.");
                                            }
                                                       
                                        }       
                                
                                }
                                
                                else {
                                    System.out.println("Vagão adicionado com sucesso.");
                                }    
                            }
                        }
                        else if (tipovag == "High") {
                            
                            if (VagoesHighCube.size() == 0) {
                                System.out.println("Não há vagão para ser adicionado. ");
                            }
                            else {
                                trem01.adicionarRecFerrovVagao(VagoesHighCube.get(0));
                                VagoesHighCube.remove(0); 
                                
                                float cargatot = 0;
                                float pesotot = 0;
                                int num = 0;
                    
                                for (Object obj : trem01.RecFerrov) {
                        
                                    if (obj instanceof Locomotiva) {
                                    pesotot = ((Locomotiva) obj).getCapPeso();
                                    num = 0;
                                    cargatot = 0;
                                    }       
                        
                                    else if (obj instanceof Vagao) {
                                                     
                                    num = num + 1;
                                    
                                    
                            
                                    cargatot = cargatot + ((Vagao) obj).getCapCarga();
                                    
                                    
                                            
                                    }
                        
                        
                                }
                                
                                
                                if (cargatot >= pesotot) {
                                    
                                    System.out.println("Uma nova locomotiva deve ser adicionada pra continuar adicionando vagões.");
                                    System.out.println("Deseja adicionar uma nova locomotiva ao trem? S/N");
                                    resp = in.next();
                        
                                        if (resp.equals("S")) {
                                            if (Locomotivas.size() >= 1) {
                                            trem01.adicionarRecFerrovLocomotiva(Locomotivas.get(0));
                                            Locomotivas.remove(0);
                                            System.out.println("Locomotiva adicionada com sucesso.");
                                        }
                                            else {
                                                System.out.println("Você deve adicionar novas locomotivas ao sistema antes de colocá-las no trem.");
                                            }
                                                       
                                        }       
                                
                                }
                                
                                else {
                                    System.out.println("Vagão adicionado com sucesso.");
                                }    
                            }
                        }
                            
                        }
                           
                    }
                        
                                                         
                                        
                    System.out.println("Digite 0 para retornar ao menu inicial.");
                        menu = in.nextInt(); 
                        menuopcoes = 3;
                        
                        break;
                        
                    case 2:
                        
                        System.out.println("Trens disponíveis: ");
                        for (int a = 0; a < Trens.size(); a++) {
                                            Trem trem = Trens.get(a);
                                            System.out.print("Trem " + a + ":");
                                            System.out.println(trem.toString());
                                            
                        }
                        System.out.println("Número do trem escolhido: ");
                        int numtrem1 = in.nextInt();
                    
                        System.out.print("Trem escolhido: ");
                        System.out.println(Trens.get(numtrem1));
                    
                        Trem trem02 = Trens.get(numtrem1);
                        
                        System.out.println("Recursos Ferroviários do trem " + numtrem1 + ":");
                        
                        for (Object obj : trem02.RecFerrov) {
                            System.out.println(obj);
                        }
                        
                        System.out.println("Digite 0 para retornar ao menu inicial.");
                        menu = in.nextInt(); 
                        menuopcoes = 3;
                        
                        break;
                   
                }
                } while (menu != 0);
                
        break;
                            
                              
        }
        } while (menu >= 0);    
                   
              
                
} 
}
    
        

