package exercicio9;

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
    double calcularTotal(){
        return this.quantidade * this.produto.preco;
    }

    void exibir(){
        System.out.println();
        System.out.println("Produto: " + this.produto.nome);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preço unitário: R$" + this.produto.preco);
        System.out.println("Preço Total do item: R$" + this.calcularTotal());
        
    }
}
