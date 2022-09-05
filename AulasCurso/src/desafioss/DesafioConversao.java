package desafioss;

import javax.swing.JOptionPane;

public class DesafioConversao {
    public static void main(String[] args) {

        String salario1 = JOptionPane.showInputDialog("Digite o primeira Salario");
        String salario2 = JOptionPane.showInputDialog("Digite o segundo Salario");
        String salario3 = JOptionPane.showInputDialog("Digite o terceiro Salario");

        salario1 = salario1.replaceAll(",", ".");
        salario2 = salario2.replaceAll(",", ".");
        salario3 = salario3.replaceAll(",", ".");

        Double salanumero1 = Double.parseDouble(salario1);
        Double salanumero2 = Double.parseDouble(salario2);
        Double salanumero3 = Double.parseDouble(salario3);

        Double soma = ((salanumero1 + salanumero2 + salanumero3)/3.0);
        JOptionPane.showMessageDialog(null,soma);

    }
}