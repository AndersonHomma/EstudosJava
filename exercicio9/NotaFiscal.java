package exercicio9;

public class NotaFiscal {
    Cliente cliente;
    Venda venda1;
    Venda venda2;
    Venda venda3;
    Venda venda4;
    Venda venda5;
    double total;
     

    void exibir(){
        System.out.println("=== NOTA FISCAL ===");
        this.cliente.exibir();
        System.out.println("--- ITENS ---");
        exibirItem(venda1);
        exibirItem(venda2);
        exibirItem(venda3);
        exibirItem(venda4);
        exibirItem(venda5);
        System.out.println("--- TOTAL DA NOTA FISCAL---");
        System.out.println("R$" + total);
    }
    
    void exibirItem(Venda venda){
        
        if(venda != null){
            if(venda.vender()){
                venda.exibir();
                total += venda.calcularTotal();
            }
        }
    }

}
