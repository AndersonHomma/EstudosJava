package exercicios.Ex7Estudo;

public class Funcionario {
    
    public String nome;
    public float salario;
    public int anosExperiencia;

    public Funcionario (String nome, float salario, int anos){
        this.nome = nome;
        this.salario = salario;
        this.anosExperiencia = anos;
    }

    public void AumentarSalario(){
        if (anosExperiencia < 0 && anosExperiencia <= 2){
            this.salario += salario*0.01;
        }
        if (anosExperiencia >= 3 && anosExperiencia <= 5) {
            this.salario += salario * 0.15;
        }
        if (anosExperiencia > 5){
            this.salario += salario * 0.2;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalário: R$" + String.format("%.2f", salario) + "\nAnos de experiência: " + anosExperiencia + "\n";
    }


}
