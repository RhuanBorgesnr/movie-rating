
package programaentretenimento;
import java.util.Scanner;
public class Teste {
    
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
        
        ProgramaEntretenimento p2 = new ProgramaEntretenimento();
        Filme filme = new Filme();
        Serie serie = new Serie();
        Documentario Doc = new Documentario();  
        
      
        
            System.out.println("Nome do Programa: ");
            p2.nome = scan.nextLine();
    
            System.out.println("Categoria: ");
            p2.categoria = scan.nextLine();
   
            System.out.println("Personagem Principal: ");
            p2.personagensPrincipais = scan.nextLine();
    
            System.out.println("Faixaetaria do Programa: ");
            p2.faixaEtaria = scan.nextLine();
  
            System.out.println("Nota de Classificação: " );
            p2.notaClassificacao = scan.nextDouble();
            
            System.out.println("Duração do Programa: ");
            p2.duracao = scan.nextLine();
    
            p2.classificarPrograma(p2.notaClassificacao);  
            System.out.println(p2.toString());
    
       
            // FILME //
        
            System.out.println("Nome do Filme: ");
            filme.nomeF = scan.nextLine();
        
            System.out.println("Categoria do filme: ");
            filme.categoria = scan.nextLine();
           
            System.out.println("Personagens Principais: ");
            filme.personagensPrincipais = scan.nextLine();
             
            System.out.println("Faixetaria do filme: ");
            filme.faixaEtaria = scan.nextLine();

          
            System.out.println("Produtora do filme : ");
            filme.produtora = scan.nextLine();
        
            System.out.println("patrocinadores: ");
            filme.patrocinadores = scan.nextLine();
            
            System.out.println("Nota do Filme: ") ;
            filme.notaClassificacao = scan.nextDouble();
           
            filme.classificarPrograma(filme.notaClassificacao);
            System.out.println (filme.toString());
        
            //SERIE// 
            
        System.out.println("Nome da Serie:");
           serie.nomeS = scan.nextLine();
    
        System.out.println("Categoria: ");
            serie.categoria = scan.nextLine();
   
        System.out.println("Personagem Principal: ");
            serie.personagensPrincipais = scan.nextLine();
    
        System.out.println("Faixaetaria da Serie: ");
            serie.faixaEtaria = scan.nextLine();
  
            
        System.out.println("Nota de Classificação: " );
           serie.notaClassificacao = scan.nextDouble();
            
            
        System.out.println("Duração: ");
            serie.duracao = scan.nextLine();
        
        System.out.println("Numero de Temporadas: ");
            serie.numtemporadas = scan.nextLine();
           
        System.out.println("Quantidade de Temporada:");
             serie.qntTemporada = scan.nextLine();
       
               
        System.out.println("Quantidade de Episodios por Temporada:");   
            serie.qntEpisodioPorTemporada = scan.nextLine();
         
            
            int resultado = serie.calculaTotalEpisodios(2,1);
            System.out.println("Total de episodios da serie:" + resultado );
      
       serie.classificarPrograma(serie.notaClassificacao);  
       System.out.println(serie.toString());
            
          // DOCUMENTARIO//  
           
          System.out.println("Documentario:");
            Doc.nomeD = scan.nextLine();
            
            System.out.println("Narrador:");
            Doc.narrador = scan.nextLine();
          
            System.out.println("Faixetaria do Documentario:");
            Doc.faixaEtaria = scan.nextLine();
            
            System.out.println("Categoria do Documentario:");
            Doc.categoria = scan.nextLine();
            
            System.out.println("Duração do Documentario");
            Doc.duracao = scan.nextLine();
            
            System.out.println("Nota de Classificação:");
            Doc.notaClassificacao = scan.nextDouble();
        
              
            Doc.classificarPrograma(Doc.notaClassificacao);
            System.out.println(serie.toString());
        
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    

