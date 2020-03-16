package programaentretenimento;
public class Filme extends ProgramaEntretenimento {
 
   
   String nomeF;
   String produtora;
   String patrocinadores; 
   
    
    
    public void classificarPrograma(double classifica){
   if (classifica <=4){
     System.out.println("O Filme " + nomeF + " e classificado como RUIM");
 }else if (classifica > 4 && classifica <8){
       System.out.println("O Filme " + nomeF + " e classificado como BOM");   
 }else  {
       System.out.println("O Filme " + nomeF + " e classificado como OTIMO");
 }  
 }

    public String getNomeF() {
        return nomeF ;
    }

    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getPatrocinadores() {
        return patrocinadores;
    }

    public void setPatrocinadores(String patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    void classificarPrograma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
