package Excecao;

public class ChecadavsNaoChecada {
    public static void main(String[] args) {
        try {
            geraErro1();
            } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        try {
            geraErro2();   
            } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("fim");
    }

    //Não checada ou não verificada
    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro bem legal #01");
    }

    //Exceção checada ou verificada
    //Precisamos deixar claro que esse método lança um exceção
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro bem legal #02");
    }
}