package exercicio6;

public class Principal {
    
    public static void main(String[] args) {
        
        Aluno jc = new Aluno();
        jc.nota1 = 7.0;
        jc.nota2 = 5.0;
        jc.nota3 = 8.0;
        jc.nota4 = 5.0;
        jc.nota5 = 5.0;
        System.out.println("Média = " + jc.calcularMedia());
        System.out.println("Situação = " + jc.retornarSituacao());
    }
}
