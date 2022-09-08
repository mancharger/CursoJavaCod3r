package Polimorfismo.Desafio;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Comida arroz = new Arroz(0.25);
        Comida feijao = new Feijao(0.1);

        System.out.println(convidado.getPeso());

        convidado.comer(arroz);
        convidado.comer(feijao);

        System.out.println(convidado.getPeso());

        Comida sorvete = new Sorvete(0.4);

        convidado.comer(sorvete);
        System.out.println(convidado.getPeso());
    }
}