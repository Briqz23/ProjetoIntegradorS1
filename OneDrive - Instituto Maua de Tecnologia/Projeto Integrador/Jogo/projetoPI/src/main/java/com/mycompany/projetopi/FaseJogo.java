//Classe referente às fases. Tem relação com a classe Questões e com a classe Usuário.
//idFase docFase creditos


public class FaseJogo{
    private int idFase;
    
    private String docFase; //talvez não seja usada, PDF salvo localmente.

    private String creditos;
    
    //public boolean iniciarJogoFlag; //essa variável não está no diagrama. Seu método está na linha 54, também em comentário.

//setters e getters (idFase, docFase e creditos)
    
    public void setIdFase (int idFase){
        this.idFase = idFase;
    }
    public int getIdFase(){
        return idFase;
    }

    public void setDocFase(String docFase){
        this.docFase = docFase;
    }
    public String getDocFase(){
        return docFase;
    }

    public void setCreditos (String creditos){
        this.creditos = creditos;
    }
    public String getCreditos(){
        return creditos;
    }
    
   
    

    //métodos 
    
    public void passarFase(){
       
    }
    
    public void repetirFase(){
        
    }
    
    public void sairFase(){
        
    }
    
    /*
    public void iniciarJogo(iniciarJogoFlag){
        return True;
            return False;
    }
    
    public void exibirCreditos(exibirCreditosFlag){
        return True;
            return False;
    }
    
    public void selecionarUnidade(selecionarUnidadeFlag){
        return True;
            return False;
    }
    
    public void salvarJogo(salvarJogoFlag){
        return True;
            return False;
    }
    */

}