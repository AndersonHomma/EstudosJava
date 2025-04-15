package exercicios.Ex14Estudo;

public class Retangulo1 {
    int base;
    int altura;

    public Retangulo1(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public Retangulo1(){}
    
    public int retornaBase (){
        return this.base;        
    }

    public int retornaAltura(){
        return this.altura;
    }

    public int calculaArea(){
        return this.base * this.altura;
    }

    public int calculaPerimetro(){
         return 2*this.base + 2*this.altura;
    }

    @Override
    public String toString(){
        return "Área do Retângulo: " + calculaArea() + "\nPerímetro do Retângulo: " + calculaPerimetro();
    }

}
