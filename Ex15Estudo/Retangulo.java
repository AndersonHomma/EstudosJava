package exercicios.Ex15Estudo;

public class Retangulo {
    int base;
    int altura;

    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(){}
    
    public int retornaBase (){
        return this.base;        
    }

    public int retornaAltura(){
        return this.altura;
    }

    public void exibeArea(){
        System.out.println("Área: " + this.base * this.altura);
    }

    public void exibePerimetro(){
         System.out.println("Perímetro: " + (2*this.base + 2*this.altura));
    }

    public int calculaArea(){
        return base * altura;
    }

    public int calculaPerimetro(){
        return base * 2 + altura * 2;
    }
}
