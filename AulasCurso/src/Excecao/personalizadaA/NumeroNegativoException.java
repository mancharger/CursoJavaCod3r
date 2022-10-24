package Excecao.personalizadaA;

public class NumeroNegativoException extends RuntimeException {

    private String nomeDoAtributo;

    NumeroNegativoException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s está negativo", nomeDoAtributo);
    }



}