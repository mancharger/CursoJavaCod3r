package Heranca.DesafioHeranca;

public class TesteCarros {
    public static void main(String[] args) {
        
        Carro ferrari = new Ferrari();
        Carro civic = new Civic();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.frear();

        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.frear();

        ferrari.mostrarVelocidadeAtual();

        civic.mostrarVelocidadeAtual();
    }
}
