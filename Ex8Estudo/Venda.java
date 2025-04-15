package exercicios.Ex8Estudo;

public class Venda {
    public Produto nomeProduto;
    public int quantidadeVenda;

    public Venda (Produto nomeProduto, int quantidadeVenda){
        this.nomeProduto = nomeProduto;
        this.quantidadeVenda = quantidadeVenda;
    }

    public boolean vender (Estoque estoque, int quantidadeVenda){
        if(estoque.quantidadeEstoque >= quantidadeVenda){
            estoque.quantidadeEstoque -= quantidadeVenda;
            return true;
        }else{return false;} 
    }
}
