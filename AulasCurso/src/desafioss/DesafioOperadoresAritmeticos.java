package desafioss;

public class DesafioOperadoresAritmeticos {

    public static void main(String[] args) {
        
        Double parte1 = (Math.pow(((3+2)*6), 2)) / (3 * 2);
        Double parte2 = Math.pow(((1-5) * (2-7)) / 2, 2);
    
        Double parte3 = Math.pow((parte1 - parte2), 3);
        Double resultFinal = parte3 / Math.pow(10, 3);
        System.out.println("Resultado: " + resultFinal);
        
    }
}