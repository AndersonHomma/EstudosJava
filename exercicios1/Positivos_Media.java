package exercicios1;

import java.util.Scanner;

public class Positivos_Media {
    /*
        Leia 6 valores. Em seguida, mostre quantos destes valores
        digitados foram positivos. Na próxima linha,
        deve-se mostrar a média de todos os valores positivos
        digitados, com um dígito após o ponto decimal.

        Entrada
        A entrada contém 6 números que podem ser valores inteiros
        ou de ponto flutuante. Pelo menos um destes números
        será positivo.

        Saída
        O primeiro valor de saída é a quantidade de valores
        positivos. A próxima linha deve mostrar a média dos
        valores positivos digitados.

        Ex entrada: 7/-5/6/-3.4/4.6/12
        Ex saída: 4 valores positivos/7.4
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] numeros = new double[6];
        float n;
        double soma = 0;
        int qtdPos = 0;

        for (int i=0; i <=5; i++){
            System.out.printf("Digite %d° número : ", i+1);
            n = scan.nextFloat();
            numeros[i] = n;
            if(numeros[i]>0){
                soma+=numeros[i];
                qtdPos++;
            }

        }

        System.out.printf("Dos números digitados %d são posisitos.",qtdPos);
        System.out.printf("\nA média dos valores positivos é = %.1f.",soma/qtdPos);

    }
}
