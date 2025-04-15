package exercicio9;

public class Produto {
    String nome;
    int quantidade;
    double preco;
    
    boolean verificarEstoque(int quantidade){
        if(this.quantidade >= quantidade){
            return true;
        }else{
            return false;
        }
    }

    void atualizarEstoque(int quantidade){
        this.quantidade += quantidade;
    }
}
