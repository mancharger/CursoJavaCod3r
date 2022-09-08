package Polimorfismo.Desafio;

public class Comida {
    private Double peso;

    public Comida(Double peso){
        setPeso(peso);
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