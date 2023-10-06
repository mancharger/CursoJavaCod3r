package Excecao.personalizadaB;

public class StringVaziaException extends Exception {

    private String nomeDoAtributo;

    StringVaziaException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo '%s' está vazio", nomeDoAtributo);
    }


}