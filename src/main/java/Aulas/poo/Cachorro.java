package Aulas.poo;

public class Cachorro extends Pet{
    private String comidaFavorita;
    private  String raca;

    public  Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca) {

        super(nome, idade, peso);
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }
    @Override // vamos sobrescrever a ação de fazer som
    public void fazerSom(){
        System.out.println("Au auuuuuuu");
    }
    @Override
    public void brincar(){
        this.fazerSom(); // o cachorro late na hora de brincar
        super.brincar(); // está chamado o brincar() de Pet
        this.dormir(); // chama o dormi do Pet, pois não foi sobrescrito
    }
    @Override
    public void comer(String comida) {
        if(comida.equals(this.comidaFavorita)){
            super.comer(comida);
            this.setPeso(this.getPeso() + 0.2);
        } else {
            System.out.println("Quero " + comida +" não!");
        }
    }
    public void correrAtrasDaMoto(){
        this.fazerSom();
        System.out.println("Correndo atrás da moto.");
    }

    public static void main(String[] args) {
        // Testar a herança
        Pet pet1 = new Pet("Fred", 3,12.5);
        pet1.dormir();
        pet1.comer("batata");

        Cachorro batata = new Cachorro("rex", 5, 25, "Osso", "caramelo");
        batata.dormir();
        batata.fazerSom();
        batata.comer("feijão");
        batata.setPeso(20);
        batata.brincar();

    }
}
