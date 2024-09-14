package exercicios1;

import java.util.Scanner;

public class Numeros_Positivos {
    /*
        Faça um programa que leia 6 valores. Estes valores
        serão somente negativos ou positivos
        (desconsidere os valores nulos).
        A seguir, mostre a quantidade de valores positivos
        digitados.
        Ex entrada:7/-5/6/-3.4/4.6/12
        Ex saída: 4 valores positivos
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
        System.out.printf("\nA média dos valores positivos é = %1f.",soma/qtdPos);


    }


}
