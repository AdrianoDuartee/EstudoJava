package Aulas.poo;

import java.time.LocalDate;
// Encapsulamento =>
// Escolhe quais atributos/métodos serão visiveis fora da classe
public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Felipe", "Jose", LocalDate.of(1993, 5, 25),1.85, 95.0);

        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getNomeCompleto());
    }
}
