package exercicios.Ex14Estudo;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        Retangulo1 r1 = new Retangulo1();

        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base: "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));

        r1.base = base;
        r1.altura = altura;
        

        JOptionPane.showMessageDialog(null, r1.toString(), "RETÂNGULO", JOptionPane.INFORMATION_MESSAGE);
        

    }
}
