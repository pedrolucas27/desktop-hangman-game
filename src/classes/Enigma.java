package classes;

import java.util.ArrayList;


public class Enigma {
    private int nivel;
    private String enunciado;
    private String resposta;
    private int qtdL_resposta= 0;
    private Dica dica;
    
    public Enigma(){
        dica = new Dica();
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public int getQtdL_resposta() {
        return qtdL_resposta;
    }

    public void setQtdL_resposta(int qtdL_resposta) {
        this.qtdL_resposta = qtdL_resposta;
    }

    public Dica getDica() {
        return dica;
    }

    public void setDica(Dica dica) {
        this.dica = dica;
    }
    
    
}
