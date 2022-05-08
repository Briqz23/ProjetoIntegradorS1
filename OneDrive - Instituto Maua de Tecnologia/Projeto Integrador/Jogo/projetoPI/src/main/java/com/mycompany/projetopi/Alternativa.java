package com.mycompany.projetopi;

//classe Alternativa, classe-filha de Questoes.
public class Alternativa extends Questoes {
    
    
    private boolean alternativaCorreta;
    private String textoAlternativa;
    private int respostaCorreta;
    
    //setters e getters
    
    public void setAlternativaCorreta(boolean AlternativaCorreta){
        this.alternativaCorreta = alternativaCorreta;
    }
    public boolean getAlternativaCorreta(){
        return alternativaCorreta;
    }
    
    public void setTextoAlternativa(String textoAlternativa){
        this.textoAlternativa = textoAlternativa;
    }
    public String getTextoAlternativa(){
        return textoAlternativa;
    }
    
    public void respostaCorreta(int respostaCorreta){
        this.respostaCorreta = respostaCorreta;
    }
    public int setRespostaCorreta(){
        return respostaCorreta;
    }
    
    //métodos
    public void selecionarAlternativa(){
        
    }
            
}

