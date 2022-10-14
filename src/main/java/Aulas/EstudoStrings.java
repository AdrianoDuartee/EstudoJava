package Aulas;

import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


public class EstudoStrings {
    public static void main(String[] args) {
        // String são cadeias de caracteres
        // "José" -> j = 0, o = 1, s = 2, é = 3
        String nome = "Pedro";
        System.out.println();

        if(nome == "Pedro") {
            System.out.println("São iguais!");
        }
        System.out.println("Digite seu sobrenome: ");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        if (sobrenome.equals ("Pereira")) {
            System.out.println("São iguais!");
        } else {
            System.out.println("São diferentes!");
        }
        //sobrenome.equalsIgnoreCase("pereira");
        //ignora maiunsculo e minusculo
        String java = "Java";
        String ja = java.substring(0,2);
        String va = java.substring(2);

        System.out.println(ja);
        System.out.println(va);

        String m1 = "hello,";
        String m2 = "world!";
        String m3 = m1.concat(m2);
        System.out.println(m3);

        System.out.println(java.length()); // quantos caracteres ela possui
        System.out.println(java.isEmpty()); // verifica se esta vazia => ""
        System.out.println(java.toUpperCase()); // Java em caixa alta
        System.out.println(java.toLowerCase()); // java em caixa baixa

        //Exemplo
        System.out.println("Digite um nome: ");
        String seuNome = entrada.nextLine();

        if (seuNome.toUpperCase().equals("JOSÉ")) {
            System.out.println("SEU NOME É JOSÉ");
        }
        String data = "13/10/2022";
        String[] valores = data.split("/"); // {"13", "10", "2022"}
        System.out.println(valores[0]);

        String email = "adrianoduarte6@gmail.com";
        String[] valoresEmail = email.split("@"); //["adrianoduarte6", "gmail.com"]
        System.out.println(valoresEmail[0]);

        String nomee = "José Souza";
        String[] nomesSeparados = nomee.split(" ");
        System.out.println(nomesSeparados[0]);

        String test = "Amanhã é sexta-feira!";
        String[] teste2 = test.split("");
        System.out.println(Arrays.toString(teste2));
    }
}
