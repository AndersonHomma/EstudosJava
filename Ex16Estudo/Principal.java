package exercicios.Ex16Estudo;

public class Principal {

    public static void main(String[] args) {
        Media m = new Media();

        m.Acrescenta(3);
        m.Acrescenta(5);
        m.Acrescenta(10);
        m.Acrescenta(8);

        System.out.println(m.soma);
        System.out.println(m.contador);
        System.out.println("Média: " + m.MediaAtual());
    }
    
}
