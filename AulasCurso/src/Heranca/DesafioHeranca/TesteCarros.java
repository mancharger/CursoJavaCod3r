package Heranca.DesafioHeranca;

public class TesteCarros {
    public static void main(String[] args) {
        
        Ferrari ferrari = new Ferrari(350.0);
        ferrari.ligarTurbo();

        Carro civic = new Civic(210.0);

        ferrari.acelerar();
        System.out.println("Ferrari: " + ferrari.mostrarVelocidadeAtual());
        ferrari.acelerar();
        System.out.println("Ferrari: " + ferrari.mostrarVelocidadeAtual());
        ferrari.acelerar();
        System.out.println("Ferrari: " + ferrari.mostrarVelocidadeAtual());
        ferrari.frear();
        System.out.println("Ferrari: " + ferrari.mostrarVelocidadeAtual());

        civic.acelerar();
        System.out.println("Civic: " + civic.mostrarVelocidadeAtual());
        civic.acelerar();
        System.out.println("Civic: " + civic.mostrarVelocidadeAtual());
        civic.acelerar();
        System.out.println("Civic: " + civic.mostrarVelocidadeAtual());
        civic.frear();
        System.out.println("Civic: " + civic.mostrarVelocidadeAtual());


    }
}
