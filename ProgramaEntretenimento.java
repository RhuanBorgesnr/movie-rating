
package programaentretenimento;
public class ProgramaEntretenimento {

 String nome;
 String categoria;
 String personagensPrincipais;
 String faixaEtaria;
 double notaClassificacao;
 String duracao;
    

    
    
    //METODO PARA CLASSIFICAR PROGRAMA 
 public void classificarPrograma(double classifica){
   if (classifica <=4){
     System.out.printf("O Programa " + nome + " e classificado como RUIM");
 }else if (classifica > 4 && classifica <8){
       System.out.printf("O Programa " + nome + " e classificado como BOM");   
 }else  {
       System.out.printf("O Programa " + nome + " e classificado como OTIMO");
 }  
 }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPersonagensPrincipais() {
        return personagensPrincipais;
    }

    public void setPersonagensPrincipais(String personagensPrincipais) {
        this.personagensPrincipais = personagensPrincipais;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public double getNotaClassificacao() {
        return notaClassificacao;
    }

    public void setNotaClassificacao(double notaClassificacao) {
        this.notaClassificacao = notaClassificacao;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    
    }
    }
