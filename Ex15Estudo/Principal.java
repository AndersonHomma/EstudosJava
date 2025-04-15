package exercicios.Ex15Estudo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Retangulo ret1 = new Retangulo(6, 4);

        Retangulo ret2 = new Retangulo();

        System.out.println("-*-*RETÂNGULO 2*-*-");
        System.out.println("\nDigite a base: ");
        int base = entrada.nextInt();
        System.out.println("Digite a altura: ");
        int altura = entrada.nextInt();
        ret2.base = base;
        ret2.altura = altura;
        entrada.close();

        System.out.println("-*-*RETÂNGULO 1*-*-");
        ret1.exibeArea();
        ret1.exibePerimetro();
        System.out.println("-*-*RETÂNGULO 2*-*-");
        ret2.exibeArea();
        ret2.exibePerimetro();

        if (ret1.calculaArea() > ret2.calculaArea()) {
            System.out.println("A área do Retângulo 1 é maior que o Retângulo 2");
        } else if (ret1.calculaArea() < ret2.calculaArea()) {
            System.out.println("A área do Retângulo 2 é maior que o Retângulo 1");
        } else {
            System.out.println("A área dos retângulos são iguais");
        }

        if (ret1.calculaPerimetro() > ret2.calculaPerimetro()) {
            System.out.println("O perímetro do Retângulo 1 é maior que o Retângulo 2");
        } else if (ret1.calculaPerimetro() < ret2.calculaPerimetro()) {
            System.out.println("O perímetro do Retângulo 2 é maior que o Retângulo 1");
        } else {
            System.out.println("O perímetro dos retângulos são iguais");
        }

    }
}
