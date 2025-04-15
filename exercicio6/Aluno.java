package exercicio6;

public class Aluno {
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double nota5;

    public double calcularMedia(){
        double media = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
        return media;
    }

    public String retornarSituacao(){
        if(calcularMedia() >= 7){
            return "APROVADO";
        }
        else {
            return "REPROVADO";
        }
    }
    
}
