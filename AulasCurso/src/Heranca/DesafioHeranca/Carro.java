package Heranca.DesafioHeranca;

public class Carro {
    final Double VELOCIDADE_MAXIMA;
    Double velocidadeAtual = 0.0;
    private Double delta = 5.0;

    Carro(Double velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;

    }

    void acelerar(){
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta();
        }
    }

    void frear(){
        if(velocidadeAtual >= 5.0){
            velocidadeAtual -= 5.00;
        } else {
            velocidadeAtual = 0.0;
        }
    }

    String mostrarVelocidadeAtual(){
        return "O Veiculo esta a " + velocidadeAtual  + "Km/h";
    }

    public Double getDelta() {
        return delta;
    }

    public void setDelta(Double delta) {
        this.delta = delta;
    }

}
