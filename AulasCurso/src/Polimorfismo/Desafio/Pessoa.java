package Polimorfismo.Desafio;

public class Pessoa {
    private Double peso;

    public Pessoa(Double peso){
        setPeso(peso);
    }

    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        if(peso >= 0){
            this.peso = peso; 
        }
    }
}
