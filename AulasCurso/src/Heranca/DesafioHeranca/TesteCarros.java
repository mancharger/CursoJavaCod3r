package Heranca.DesafioHeranca;

public class TesteCarros {
    public static void main(String[] args) {
        
        Carro ferrari = new Ferrari(350.0);
        Carro civic = new Civic(210.0);

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
