public class Variaveis {
    public static void main(String[] args) {
        System.out.println("Hello, world!"); // equivale ao console.log
        //variavel no Java
        //fortemente tipado e estaticamente tipado
        int idade = 20; //inteiro (2B)
        double salario = 4500.99; // dupla precisão
        float nota = 7.5f; //sufixo para float
        long populacaoTerra = 7_900_000_000l; //numeros longos
        boolean tarefaConcluida = true; // (true/false)
        int i= 1, j = 0, k = 1000; //multiplas variaveis
        String nomeCompleto = "Adriano Duarte"; // sempre aspas duplas

        int test = 10;
        test = 9; // reatribuição de variaveis

        final int test2 = 200; // impossivel mudar o valor
        //test = 1000;

        // Operadores
        int a = 10;
        int b = 5;

        int soma = a + b; // 15
        int subtracao = a - b; //5
        int multiplicacao = a * b; //50
        int divisao = a / b; // 2
        System.out.println("O resultado da soma é " + soma); // "o resultado da soma é 15"
        // A DIVISÃO ENTRE DOIS INTEIROS RESLTA EM INTEIRO
        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;
        double resultado = sete / dois; // 3.0
        System.out.println(resultado);
        double resultado2 = sete / dois2;
        System.out.println(resultado2); // 3.5

        //Math
        double x = Math.sqrt(144); // 12
        double y = Math.pow(5, 2);
        System.out.println(Math.PI);

        //Casting ! = converter a variável
        int pi2 = (int) Math.PI;
        System.out.println(pi2);

        double resultado3 = sete/ (double) dois; // 7 / 2.0 = 3.5

        //Operaadores
        int valor = 5;
         valor++;
         valor--;

         valor += 10; // valor = valor + 10;

        // Operadores relacionais
        boolean teste1 = 5 > 1; // true
        boolean teste2 = 5 < 1; // false
        boolean teste4 = 5 == 5; // true
        boolean teste5 = 5 != 1; // true
        boolean teste6 = 6 >= 6; // true
        boolean teste7 = 5 <= 9; // true

        //Operadores logicos
        boolean teste8= true && false; // false
        boolean teste9 = true || false; // true
        boolean teste10 = (5 > 10) && (10 < 5); // false
        boolean teste11 = (10 >=0)|| (1 < 5); // true
        boolean teste12 = (5 > 1); // true
        boolean teste13 = !teste12; // false

    }
}
