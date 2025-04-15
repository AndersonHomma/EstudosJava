package exercicio5;

public class Principal {
    
    public static void main(String[] args) {
        
        System.out.println("CALCULADORA 1");
        Calculadora calculadora1 = new Calculadora();
        calculadora1.numero1 = 1;
        calculadora1.numero2 = 1;

        System.out.println("Soma = " + calculadora1.somar());
        System.out.println("Subtração = " + calculadora1.subtrair());
        System.out.println("Multiplicação = " + calculadora1.multiplicar());
        calculadora1.numero2 = 0;
        System.out.println("Divisão = " + calculadora1.dividir());       

        System.out.println("CALCULADORA 2");
        Calculadora calculadora2 = new Calculadora(10,2);
        System.out.println("Soma = " + calculadora2.somar());
        
        System.out.println("CALCULADORA 3");
        Calculadora calculadora3 = new Calculadora(10);
        calculadora3.numero2 = 2;
        System.out.println("Soma = " + calculadora3.somar());

    }
}

