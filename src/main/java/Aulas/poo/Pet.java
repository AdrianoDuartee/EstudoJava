package Aulas.poo;

public class Pet {
    private String nome;
    private int idade;
    //nas subclasses o atributo/metodo private
    //não é acessível
    // protected => permite acesso direto na subclasses
    protected double peso;

    public Pet(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void fazerSom() {
        System.out.println("...");
    }

    public void comer(String comida) {
        System.out.println("estou mesndo " + comida);
    }
    public void dormir() {
        System.out.println("zzzzzzzzzz");
    }
    public void brincar() {
        System.out.println("Estou brincando...");
    }
    public double getPeso() {
        return this.peso;
    }
    public void setPeso(double novoPeso) {
        this.peso = novoPeso;
    }
}
