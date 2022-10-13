public class EstudosEnums {
    public static void main(String[] args) {
        // Enums são estrutura com constantes definidas
        // Dias da semana, meses do ano, turnos do dia, estações
        //Niveis ( junior, pleno, senior), feriados nacionais
        enum DiaDaSemana {
            SEGUNDA,
            TERÇA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO,
        }

        DiaDaSemana hoje = DiaDaSemana.QUINTA;
        System.out.println(hoje);

        enum NivelDev {JUNIOR, PLENO, SENIOR }
        NivelDev nivel = NivelDev.PLENO;
        NivelDev nivel2 = NivelDev.valueOf("JUNIOR"); // o valor de name precisa ser JUNIOR, PLENO ou SENIOR

        switch (nivel) {
            case JUNIOR:
                System.out.println("Seu nivel é Junior");
                break;
            case PLENO:
                System.out.println("Seu nivel é PLENO");
                break;
            case SENIOR:
                System.out.println("Seu nivel é SENIOR");
                break;
        }
        // VERSÃO ENHANCED
        switch(nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }
    }
}
