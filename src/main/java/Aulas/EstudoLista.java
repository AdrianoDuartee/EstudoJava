package Aulas;

import java.util.ArrayList;

public class EstudoLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); // Cria um novo arrayList vazio que quarda Integer
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println(numeros);

        //Adicionando elementos no array
        numeros.add(10);
        numeros.add(20);
        numeros.add(1000);
        System.out.println(numeros);
        System.out.println(numeros.get(2)); // numeros[2]
        //numeros[0] = 500
        numeros.set(0, 500);
        System.out.println(numeros);

        // Remove o elemento na posição 0
        numeros.remove(0);

        // Adiciona o elemento na posição e move os demais

        numeros.add(3, 200);
        System.out.println(numeros);

        System.out.println(numeros.size()); // array.length
        for(int i = 0; i < numeros.size(); i++) {
         System.out.println(numeros.get(i));
        }
        for(int numero : numeros){ // Para cada valor dentro do array ele executa o codigo
            System.out.print(numero);

        }
        System.out.println(numeros.contains(500)); // true = achou false = não achou
        System.out.println(numeros.indexOf(1000)); // qual a posição do 100 na lista
        System.out.println(numeros.indexOf(500)); //-1 = não achou o elemento
        System.out.println(numeros.indexOf(200)); // mostra o array do primeiro encontro
        System.out.println(numeros.lastIndexOf(200)); // mostrar o ultimo encontro

    }
}
