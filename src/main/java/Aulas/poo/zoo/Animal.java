package Aulas.poo.zoo;

public interface Animal {
    void dormir(); // desfinição do metodo apenas
    void fazerSom();
    void comer(String comida);
}

class Gato implements Animal {
    @Override
    public void dormir() {
        System.out.println("zzzzz Miau");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public  void comer(String comida) {
        if (comida.equals("peixe")) {
            System.out.println("hummm gosto de peixe");
        } else {
            System.out.println("Só como peixe");
        }
    }
}

class Galinha implements Animal {
    @Override
    public void  dormir () {
        System.out.println("co co zzzzzzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("co co co co co");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Hummmmm co co " + comida);
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("Milho");

        gato.comer("Peixe");
        gato.dormir();
        gato.fazerSom();

        // Interface não consigo criar um objeto
        //Animal novoAnimal = new Animal(),
        Animal animalGalinha = new Galinha();
        Animal animalGatinho = new Gato();
        System.out.println("===POLIMORFISMO===");
        animalGalinha.fazerSom();
        animalGatinho.fazerSom();
    }
}
