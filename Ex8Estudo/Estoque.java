package exercicios.Ex8Estudo;

public class Estoque {
    
    public Produto nomeProduto;
    public int quantidadeEstoque;


    public Estoque(Produto nome, int quantidade){
        this.nomeProduto = nome;
        this.quantidadeEstoque = quantidade;
    }

    public void adicionarEstoque( int quantidade){        
        this.quantidadeEstoque += quantidade;
    }

    public String listarProduto(){
        String lista = "Produto: " + nomeProduto.produto + "\nQuantidade: " + quantidadeEstoque;
        return lista;
    }
}
