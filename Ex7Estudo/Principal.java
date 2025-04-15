package exercicios.Ex7Estudo;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList <Funcionario> funcionarios = new ArrayList<>();
        int opcao;
        String menu = """
                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                                    Menu
                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                    1 - Inserir Funcionário
                    2 - Consultar Funcionário
                    3 - Listar todos Funcionários
                    4 - Aumentar salários
                    5 - Sair
                -------------------------------------------
                """;

        do{

            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "MENU DE OPÇÕES", JOptionPane.INFORMATION_MESSAGE)); 

            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite nome do funcionário: ");
                    Float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário R$"));                
                    int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite os anos de experiência: "));

                    funcionarios.add(new Funcionario(nome, salario, anos));
                    JOptionPane.showMessageDialog(null,"Funcionário adicionado com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2:
                    if (funcionarios.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Funcionário não encontrado", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        String busca = JOptionPane.showInputDialog(null,"Nome funcionário: ", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                        StringBuilder listaFuncionarios = new StringBuilder();
                        for (Funcionario f : funcionarios){
                            if(f.nome.equalsIgnoreCase(busca)){
                                listaFuncionarios.append(f).append("\n");
                            }
                        }
                        JOptionPane.showMessageDialog(null, listaFuncionarios, "Lista de Funcionários", JOptionPane.INFORMATION_MESSAGE);
                    }

                    break;

                case 3:
                    if(funcionarios.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Funcionário não encontrado", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        StringBuilder listaFuncionarios = new StringBuilder();
                        for (Funcionario f : funcionarios){
                            listaFuncionarios.append(f).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, listaFuncionarios, "Lista de Funcionários", JOptionPane.INFORMATION_MESSAGE);

                    }
                    break;
                case 4:
                    for (Funcionario f : funcionarios){
                        f.AumentarSalario();
                    }
                    JOptionPane.showMessageDialog(null, "Salários aumentados com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    break;
            
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

        }while (opcao!=5);

    }   
    
}
