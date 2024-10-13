import java.util.Scanner;

//3.11. Estrutura condicional switch

public class AvaliacaoAtendimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Avalie o nosso atendimento (1 a 5): ");
        int nota = sc.nextInt();

        String descricaoNota;

        switch (nota) {
            case 1:
                descricaoNota = "Muito ruim";
                break;
            case 2:
                descricaoNota = "Ruim";
                break;
            case 3:
                descricaoNota = "Razoável";
                break;


            case 4:
                descricaoNota = "Muito bom";
                break;
            case 5:
                descricaoNota = "Excelente";
                break;
            default:
                descricaoNota = "Opção Inválida";
                break;

        }
    }
}
