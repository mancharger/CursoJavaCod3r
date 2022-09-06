package Heranca.DesafioHeranca;

public class Ferrari extends Carro {
    
    @Override
    void acelerar(){
        velocidadeAtual += 15.00;
    }

    @Override
    void frear(){
        if(velocidadeAtual >= 15.0){
            velocidadeAtual -= 15.00;
        } else {

        }
    }
}
