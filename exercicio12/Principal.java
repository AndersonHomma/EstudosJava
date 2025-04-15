package exercicio12;

public class Principal {
    public static void main(String[] args) {
        
        Retangulo ret = new Retangulo(5,  3);

        System.out.println("Base = " + ret.retornaBase());
        System.out.println("Altura = " + ret.retornaAltura());
        ret.exibeArea();
        ret.exibePerimetro();

    }
}
