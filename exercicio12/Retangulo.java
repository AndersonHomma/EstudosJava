package exercicio12;

public class Retangulo {
    
    private int base;
    private int altura;

    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int retornaBase(){
        return this.base;
    }

    public int retornaAltura(){
        return this.altura;
    }

    public int calculaArea(){        
        return this.base * this.altura;
    }

    public int calculaPerimetro(){
        return this.base * 2 + this.altura * 2;
    }

    public void exibeArea(){
        System.out.println("Área do retangulo = " + this.calculaArea());
    }

    public void exibePerimetro(){
        System.out.println("Perímetro do retangulo = " + this.calculaPerimetro());
    }
}
