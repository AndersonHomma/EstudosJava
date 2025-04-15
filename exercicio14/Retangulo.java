package exercicio14;

public class Retangulo {
    
    private float base;
    private float altura;

    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    public Retangulo(float altura){
        this.base = 5.0f;
        this.altura = altura;
    }

    public float retornaBase(){
        return this.base;
    }

    public float retornaAltura(){
        return this.altura;
    }

    public float calculaArea(){        
        return this.base * this.altura;
    }

    public float calculaPerimetro(){
        return this.base * 2 + this.altura * 2;
    }

    public void exibeArea(){
        System.out.println("Área do retangulo = " + this.calculaArea());
    }

    public void exibePerimetro(){
        System.out.println("Perímetro do retangulo = " + this.calculaPerimetro());
    }
}
