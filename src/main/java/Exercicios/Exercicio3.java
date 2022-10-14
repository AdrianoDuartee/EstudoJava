package Exercicios;

//3) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima quantas vezes
// que V1 e V2 possuem valores idênticos nas mesmas posições.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um tamanho: ");
        int tamanho = entrada.nextInt();

        int[] v1 = new int[tamanho];
        int[] v2 = new int[tamanho];

        System.out.println("Digite os valores de v1");
        for (int i = 0; i < tamanho; i++) {
            v1[i] = entrada.nextInt();
        }
        System.out.println("Digite os valores de v2");
        for (int i = 0; i < tamanho; i++) {
            v2[i] = entrada.nextInt();
        }

        int parecidas = 0;
        for(int i = 0; i < tamanho; i++) {
            if (v1[i] == v2[i]) {
                parecidas++;
            }
        }
        System.out.println("Foram " + parecidas + "numeros parecidos!");
    }
}
