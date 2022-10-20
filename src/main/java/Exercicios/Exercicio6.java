package Exercicios;
//1) Crie uma classe Circulo que possui:
//        * Atributos: raio, cor.
//        * Construtores:
//        - Cria circulos com base no parâmetro raio do construtor;
//        - Cria círculos de raio 1;
//        * Métodos:
//        - calcularArea() => deve retornar double (PI * RAIO * RAIO)
//        - calcularCircunferencia => deve retornar double (2 * PI * RAIO)
//        - mudarRaio(double novoRaio) => deve alterar o valor do raio

public class Exercicio6 {
        double raio;
        String cor;

        double pi;

        Exercicio6(int raio, String cor, double pi) {
            this.raio = raio;
            this.cor = cor;
            this.pi = pi;
        }
        double calculeArea () {
            double area = this.pi * Math.pow(this.raio,2);
            return area;
        }


    }