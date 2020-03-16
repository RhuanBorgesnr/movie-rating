package programaentretenimento;
public class Serie extends ProgramaEntretenimento {
    
   String nomeS;
   String numtemporadas;
   String qntTemporada ;
   String qntEpisodioPorTemporada;
   
    
    public void classificarPrograma(double classifica){
 if (classifica <=4){
     System.out.println("A Serie " + this.nomeS + " e classificado como RUIM");
 }else if (classifica > 4 && classifica <8){
       System.out.println("A Serie " + nomeS + " e classificado como BOM");   
 }else{
       System.out.println("A serie " + nomeS+ " e classificado como OTIMO");
 }  
 }
         
    
    public int calculaTotalEpisodios(int qntTemporada, int qntEpisodioPorTemporada){
      return qntTemporada * qntEpisodioPorTemporada;
      
    }
         
    public String getNomeS() {
        return nomeS;
    }

    public void setNomeS(String nomeS) {
        this.nomeS = nomeS;
    }

    public String getNumtemporadas() {
        return numtemporadas;
    }

    public void setNumtemporadas(String numtemporadas) {
        this.numtemporadas = numtemporadas;
    }

    public String getQntTemporada() {
        return qntTemporada;
    }

    public void setQntTemporada(String qntTemporada) {
        this.qntTemporada = qntTemporada;
    }

    public String getQntEpisodioPorTemporada() {
        return qntEpisodioPorTemporada;
    }

    public void setQntEpisodioPorTemporada(String qntEpisodioPorTemporada) {
        this.qntEpisodioPorTemporada = qntEpisodioPorTemporada;
    }

    void calculaTotalEpisodios() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}