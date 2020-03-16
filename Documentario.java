
package programaentretenimento;
public class Documentario extends ProgramaEntretenimento {
    
    String nomeD;
   String narrador;
   
    
    
   public void classificarPrograma(double classifica){
 if (classifica <=4){
     System.out.println("O Documentario " + nomeD+ " e classificado como RUIM");
 }else if (classifica > 4 && classifica <8){
       System.out.println("O Documentario " + nomeD+ " e classificado como BOM");   
 }else{
       System.out.println("O Documentario  " + nomeD+ " e classificado como OTIMO");
 } 
 }

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }
}
   
   
   
    

