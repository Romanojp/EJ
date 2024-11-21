import java.util.Scanner;

public class HorarioFuncionamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um dia da semana (seg, ter, qua,etc...): ");
        String dia = entrada.nextLine();

        String horarioFuncionamento = switch (dia){
            case "seg" -> "fechado";
            case "ter","qua","qui","sex" -> "08:00 ás 18:00";
            case "sab", "dom" -> "08:00 ás 12:00";
            default -> "Dia Inválido";


        };


/*
       String horarioFuncionamento;
        switch (dia) {
            case "seg" -> horarioFuncionamento = " Fechado";
            case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 ás 18:00";
            case "sab", "dom" -> horarioFuncionamento = "08:00 ás 12:00";
            default -> horarioFuncionamento = "Dia Inválido";
        }
*/
        System.out.printf("Horario de Funcionamento:  %s%n", horarioFuncionamento);
    }
}
