package exercicio5;

public class Calculadora {
    
    public int numero1;
    public int numero2;

    public Calculadora(){

    }
    public Calculadora(int numero1){
        this.numero1 = numero1;
    }

    public Calculadora(int numero1, int numero2){
        this(numero1);
        this.numero2 = numero2;
    }

    public int somar(){        
        return numero1 + numero2;        
    }

    public int subtrair(){
        return numero1 - numero2;
    }

    public int multiplicar(){
        return numero1 * numero2;
    }

    public float dividir(){
        if(numero2 != 0){
            return numero1 / numero2;            
        }
        return 0;
    }

}
