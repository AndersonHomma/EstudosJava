package exercicio16;

public class Principal {
    
    public static void main(String[] args) {
        
        Media m = new Media();

        m.Acrescenta(3);
        System.out.println("Média = " + m.MediaAtual());
        m.Acrescenta(5);
        System.out.println("Média = " + m.MediaAtual());
        m.Acrescenta(10);
        System.out.println("Média = " + m.MediaAtual());
        m.Acrescenta(8);
        System.out.println("Média = " + m.MediaAtual());
        
    }
}
