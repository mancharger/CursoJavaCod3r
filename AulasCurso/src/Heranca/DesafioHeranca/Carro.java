package Heranca.DesafioHeranca;

public class Carro {
    Double velocidadeAtual = 0.0;


    void acelerar(){
        velocidadeAtual += 5.00;
    }

    void frear(){
        if(velocidadeAtual >= 5.0){
            velocidadeAtual -= 5.00;
        } else {

        }
    }

    void mostrarVelocidadeAtual(){
        System.out.println("O Veiculo esta a " + velocidadeAtual  + "Km/h");
    }

}
