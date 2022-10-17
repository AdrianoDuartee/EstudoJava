package Aulas.poo;

/// intuito: testar uso da classe pessoa
public class PessoaTeste {
    public static void main(String[] args) {
        //new-> controi um NOVO objeto de Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "jose"; // obj.atributo
        pessoa1.sobrenome = "Carlos";
        pessoa1.idade = 29;
        pessoa1.peso = 55.0;
        pessoa1.altura = 1.87;

        pessoa1.dizOla();
        Pessoa pessoa2 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa("Pedro", "Gomes", 35, 1.75, 30.5);

        Pessoa recemNascido = new Pessoa("Enzo", "Pereira");
        System.out.println(recemNascido.altura);
        recemNascido.idade++; // envelhecer
        recemNascido.dizOla();

        //chama de métodos

        pessoa4.dizOla();
        pessoa4.mostraImc();
        double imcPessoa4 = pessoa4.calculaImc();
        System.out.println(imcPessoa4);

    }
}
