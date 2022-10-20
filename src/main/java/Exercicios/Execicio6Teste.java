package Exercicios;

public class Execicio6Teste {
    public static void main(String[] args) {
        Exercicio6 circulo = new Exercicio6(2,"vermelho",3.14);
        circulo.calculeArea();
        double circuloArea = circulo.calculeArea();
        System.out.println(circuloArea);
    }
}
