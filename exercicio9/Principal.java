package exercicio9;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Bola Quadrada";
        p1.quantidade = 8;
        p1.preco = 1000;

        Produto p2 = new Produto();
        p2.nome = "Alpiste para Papaléguas";
        p2.quantidade = 10;
        p2.preco = 25;

        Produto p3 = new Produto();
        p3.nome = "Patins a Jato ACME";
        p3.quantidade = 5;
        p3.preco = 237;

        NotaFiscal nf = new NotaFiscal();
        nf.cliente = new Cliente();
        nf.cliente.nome = "JC";
        nf.cliente.endereco = new Endereco();
        nf.cliente.endereco.rua = "Rua dos Bobos";
        nf.cliente.endereco.numero = 0;
        
        nf.venda1 = new Venda(p1,1);
        nf.venda2 = new Venda(p2, 2);
        nf.venda3 = new Venda(p3, 4);
        nf.exibir();
    }
    
}
