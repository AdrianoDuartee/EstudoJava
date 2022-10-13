import java.time.LocalDate;

public class EstudosDatas {
    public static void main(String[] args) {
        //dia - mes - ano
        // localDate armazena qual que da ta como dia, mes e ano.
        LocalDate hoje = LocalDate.now(); //pegar data atual
        System.out.println(hoje);
        LocalDate natal = LocalDate.of(2022, 12, 25);
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal)); // verifica se a data é depois da especificada
        System.out.println(hoje.isBefore(natal)); // verifica se a data é antes da especificada
        int ano = hoje.getYear(); // o ano da data
        int mes = hoje.getMonthValue(); // o numero do mês
        int dia = hoje.getDayOfMonth(); // o numero do dia do mês

        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear(); //subtrai o dia do natal pelo dia de hoje
        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);

        System.out.println("Faltam " + diasParaNatal + "dias p/ natal!!!!");

    }
}
