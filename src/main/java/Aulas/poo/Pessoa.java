package Aulas.poo;

public class Pessoa {
    /// Propriedades/atributos de uma Pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    Pessoa () { // construtor da classe
        //this -> representa o objeto
        this.nome = "Jose";
        this.sobrenome = "Carlos";
        this.idade = 29;
        this.peso = 55.0;
        this.altura = 1.87;

    }

    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    Pessoa (String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.peso = 2.0;
        this.altura = 0.5;
    }

    //Ações de uma pessoa (métodos)
    //<tipo_retorno> nomeDoMetodo(PARAMETRO){}
    void dizOla() { //método que não retorna nada

        System.out.println("Olá, tudo bem? Meu nome é " + this.nome);
    }

    void mostraImc() {
        double imc = this.peso / (this.altura * this.altura);
        System.out.println("O meu IMC é " + imc);
    }

    double calculaImc () { // Deve retorna um valor
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }
    void comer(String comida) {
        System.out.println("Estou comendo " + comida);
    }
}
