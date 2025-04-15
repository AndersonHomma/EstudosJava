package exercicios.Ex8Estudo;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        String nomeProduto = JOptionPane.showInputDialog("Digite nome do produto:");
        int quantidadeProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade do produto"));
        Double precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite preço do produto:"));
        Produto p1 = new Produto(nomeProduto, quantidadeProduto, precoProduto);

        Estoque e1 = new Estoque(p1, quantidadeProduto);
        String lista1 = e1.listarProduto();
        JOptionPane.showMessageDialog(null, lista1, "Lista Estoque", JOptionPane.INFORMATION_MESSAGE);

        int quantVenda = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja vender: "));
        Venda v1 = new Venda(p1, quantVenda);

        if (v1.vender(e1, quantVenda)) {
            JOptionPane.showMessageDialog(null, "Produto vendido com sucesso", "Mensagem",
                    JOptionPane.INFORMATION_MESSAGE);
            String listaAtualizada = e1.listarProduto();
            JOptionPane.showMessageDialog(null, listaAtualizada, "Lista Estoque", JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "Produto sem estoque", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
