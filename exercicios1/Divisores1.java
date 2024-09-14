package exercicios1;

import java.util.Scanner;

public class Divisores1 {

    /*
        Ler um número inteiro N e calcular todos os seus divisores.
        Ex entrada: 6

        Entrada
        O arquivo de entrada contém um valor inteiro.

        Saída
        Escreva todos os divisores positivos de N, um valor por linha.
        Ex saída: 1/2/3/6
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num=0;

        System.out.println("Digite um número:");
        num = scan.nextInt();

        for(int i=1; i<=num; i++){
            if(num%i ==0){
                System.out.println(i);
            }
        }

    }
}
