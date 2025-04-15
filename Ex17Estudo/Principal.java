package exercicios.Ex17Estudo;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Media m = new Media();
        String resposta;

        do{
            System.out.println("Digite o 1ª Nota: ");
            float n1 = scan.nextFloat();
            System.out.println("Digite o 2ª Nota: ");
            float n2 = scan.nextFloat();
            System.out.println("Digite o 3ª Nota: ");
            float n3 = scan.nextFloat();
            System.out.println("Digite o 4ª Nota: ");
            float n4 = scan.nextFloat();
            
            m.Acrescenta(n1);
            m.Acrescenta(n2);
            m.Acrescenta(n3);
            m.Acrescenta(n4);

            System.out.println(m.soma);
            System.out.println(m.contador);
            System.out.println("Média: " + m.MediaAtual());
            
            System.out.println("\nDeseja Continuar (S/N): ");
            resposta = scan.next();
            
        }while(resposta.equalsIgnoreCase("S"));
        scan.close();

        
    }
    
}
