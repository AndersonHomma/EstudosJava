package exercicio8;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Bola Quadrada";
        p1.quantidade = 0;
        p1.preco = 1000;

        Produto p2 = new Produto();
        p2.nome = "Alpiste para Papaléguas";
        p2.quantidade = 10;
        p2.preco = 25;

        Produto p3 = new Produto();
        p3.nome = "Patins a Jato ACME";
        p3.quantidade = 2;
        p3.preco = 237;        

        Venda v1 = new Venda(p1,1);
        
        if(v1.vender()){
            System.out.println("Venda realizada com sucesso!");
            System.out.println("Estoque = " + v1.produto.quantidade);
        } else {
            System.out.println("Estoque insuficiente!");
            System.out.println("Estoque = " + v1.produto.quantidade);
        }

        Venda v2 = new Venda(p2, 2);
        
        if(v2.vender()){
            System.out.println("Venda realizada com sucesso!");
            System.out.println("Estoque = " + v2.produto.quantidade);
        } else {
            System.out.println("Estoque insuficiente!");
            System.out.println("Estoque = " + v2.produto.quantidade);
        }

        Venda v3 = new Venda(p3, 4);
        
        if(v3.vender()){
            System.out.println("Venda realizada com sucesso!");
            System.out.println("Estoque = " + v3.produto.quantidade);
        } else {
            System.out.println("Estoque insuficiente!");
            System.out.println("Estoque = " + v3.produto.quantidade);
        }
    }
    
}
