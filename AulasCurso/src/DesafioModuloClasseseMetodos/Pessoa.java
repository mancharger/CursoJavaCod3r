package DesafioModuloClasseseMetodos;

public class Pessoa {
    public String nomep;
    public Double pesop;

    Pessoa(String nomep, Double pesop) {
        this.nomep = nomep;
        this.pesop = pesop;
    }

    void comer(Comida comida) {
        System.out.printf("Antes de comer: %.2f", pesop);
        this.pesop += comida.pesoc;
        System.out.printf("\nNome: %s\nDepois de comer: %.2f\n", nomep, pesop);
    }
}
