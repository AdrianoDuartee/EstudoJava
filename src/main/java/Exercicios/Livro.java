package Exercicios;

public class Livro {
    private String nome;
    private Autor autor;
    private double preco;

    public Livro( String nome, Autor autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public static void main(String[] args) {
        Autor jk = new Autor("JK", "JK@gmail.com");
        Livro pedraFilosofal = new Livro("Harry Potter ea Pedra Filosofal", jk,40.50);

        System.out.println(pedraFilosofal.autor.getNome());
        System.out.println(pedraFilosofal.autor.getEmail());

        Livro camaraSecrata = jk.escreverLivro("Harry Potter e a Camara Secreta", 30.5);

        System.out.println(camaraSecrata.autor.getNome());

        Livro prisioneiroAzk = jk.escreverLivro("Harry Potter e o prisioneiro de Azkaban", 50.9);
        System.out.println(prisioneiroAzk.autor.getNome());



    }
}
