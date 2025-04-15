package exercicio8;

public class Venda {
    Produto produto;
    int quantidade;
    double total;

    Venda(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    boolean vender(){
        if(produto.verificarEstoque(this.quantidade)){
            //estoque suficiente
            produto.atualizarEstoque(-this.quantidade); 
            this.total = this.quantidade * produto.preco;
            return true;            
        }
        else{
            //estoque insuficiente
            this.total = 0;
            return false;
        }
    }
}
