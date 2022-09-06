package Heranca.DesafioHeranca;

public class Ferrari extends Carro {
    
    Ferrari(Double velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 15.0;
    }

    @Override
    void acelerar(){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }

    @Override
    void frear(){
        if(velocidadeAtual >= 15.0){
            velocidadeAtual -= 15.00;
        } else {
            velocidadeAtual = 0.0;
        }
    }
}
