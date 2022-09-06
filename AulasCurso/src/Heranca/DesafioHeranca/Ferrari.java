package Heranca.DesafioHeranca;

public class Ferrari extends Carro {
    
    Ferrari(Double velocidadeMaxima){
        super(velocidadeMaxima);
    }

    @Override
    void acelerar(){
        velocidadeAtual += 15.00;
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
