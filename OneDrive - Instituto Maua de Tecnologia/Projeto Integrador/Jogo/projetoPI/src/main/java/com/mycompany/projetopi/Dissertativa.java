package com.mycompany.projetopi;

public class Dissertativa extends Questoes{

    private String caixaDeResposta;
    private String respostaCorreta;
    
    
    //setters e getters 
    public void setCaixaDeResposta (String caixaDeResposta){
        this.caixaDeResposta = caixaDeResposta;
    }
    public String getCaixaDeResposta(){
        return caixaDeResposta;
    }
    
    public void SetRespostaCorreta (String respostaCorreta){
        this.respostaCorreta = respostaCorreta;
    }
    public String GetRespostaCorreta(){
        return respostaCorreta;
    }
    
    //métodos- esses métodos não fazem muito sentido no programa..
    
    public void escreverTexto(){
        
    }
    public void alterarTexto(){
        
    }
    public void excluirTexto(){
}

