package Aulas.poo;

public class Calculadora {

    //atributo estatico
    public static double PI = 3.14;
    //final= impede a alteração do valor de PI

    //Método estatico
    //Não pertence ao objeto, mas sim a classe
    public static double soma(double a, double b) {
        return a +b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        double resultadoSoma = Calculadora.soma(1, 2);
        double resultadoSub = Calculadora.subtracao(10, 5);
        double resultadoMult = Calculadora.multiplicao(10, 2);
        double resultadoDiv = Calculadora.divisao(10, 5);
        System.out.println(Calculadora.PI);
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(144));
        System.out.println(Math.cbrt(8));
    }
}
