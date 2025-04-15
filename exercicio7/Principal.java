package exercicio7;

public class Principal {
    
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        func1.salario = 1000;
        func1.experiencia = 1;
        func1.aumentarSalario();
        System.out.println(func1.salario);
        Funcionario func2 = new Funcionario();
        func2.salario = 1000;
        func2.experiencia = 4;
        func2.aumentarSalario();
        System.out.println(func2.salario);
        Funcionario func3 = new Funcionario();
        func3.salario = 1000;
        func3.experiencia = 7;
        func3.aumentarSalario();
        System.out.println(func3.salario);
    }
}
