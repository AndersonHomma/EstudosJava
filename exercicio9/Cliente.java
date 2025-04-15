package exercicio9;

public class Cliente {
    String nome;
    Endereco endereco;

    void exibir(){
        System.out.println("CLIENTE:" + nome);
        this.endereco.exibir();
    }
}
