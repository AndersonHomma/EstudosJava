package exercicio14;

public class Principal {
    public static void main(String[] args) {
        
        Retangulo ret = new Retangulo(5,  3);

        System.out.println("Base = " + ret.retornaBase());
        System.out.println("Altura = " + ret.retornaAltura());
        ret.exibeArea();
        ret.exibePerimetro();

        Retangulo ret2 = new Retangulo(2.5f, 3.2f);
        System.out.println("Base = " + ret2.retornaBase());
        System.out.println("Altura = " + ret2.retornaAltura());
        ret.exibeArea();
        ret.exibePerimetro();
        
        Retangulo ret3 = new Retangulo(3.0f);
        System.out.println("Base = " + ret3.retornaBase());
        System.out.println("Altura = " + ret3.retornaAltura());
        ret.exibeArea();
        ret.exibePerimetro();
    }
}
