package exercicios.Ex12Estudo;

public class Retangulo1 {
    int base;
    int altura;

    public Retangulo1(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public int retornaBase (){
        return this.base;        
    }

    public int retornaAltura(){
        return this.altura;
    }

    public void calculaArea(){
        System.out.println("Área: " + this.base * this.altura);
    }

    public void calculaPerimetro(){
         System.out.println("Perímetro: " + (2*this.base + 2*this.altura));
    }
}
