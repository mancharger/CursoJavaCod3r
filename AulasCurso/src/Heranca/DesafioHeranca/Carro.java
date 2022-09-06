package Heranca.DesafioHeranca;

public class Carro {
    final Double VELOCIDADE_MAXIMA;
    Double velocidadeAtual = 0.0;
    Double delta = 5.0;

    Carro(Double velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;

    }

    void acelerar(){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }

    void frear(){
        if(velocidadeAtual >= 5.0){
            velocidadeAtual -= 5.00;
        } else {
            velocidadeAtual = 0.0;
        }
    }

    void mostrarVelocidadeAtual(){
        System.out.println("O Veiculo esta a " + velocidadeAtual  + "Km/h");
    }

}
