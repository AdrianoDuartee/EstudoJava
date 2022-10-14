package Exercicios;



//1) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: (switch-case)

//        1 – Adição
//        2 – Subtração
//        3 – Multiplicação
//        4 – Divisão


import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1 - Adição\n2 - Subitração\n3 - Multiplicação\n4 - Divisão");
        System.out.println("Digite uma opção (1 a 4): ");
        int opcao = entrada.nextInt();

        System.out.println("Digite o primeiro valor: ");
        double valor1 = entrada.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = entrada.nextDouble();

        switch (opcao) {
            case 1 -> {
                System.out.println("O resultado da soma é" + (valor1 + valor2));
            }
            case 2 -> {
                System.out.println("O resultado da subtração é" + (valor1 - valor2));System.out.println();
            }
            case 3 -> {
                System.out.println("O resultado da multiplicação é" + (valor1 * valor2));
            }
            case 4 -> {
                System.out.println("O resultado da divisão é" + (valor1 / valor2));
            }
            default -> {
                System.out.println("Você digitou a opção errada!");
            }
        }

    }
}
