import java.util.Scanner;

public class CaixaLoja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Preço dos Produtos: ");
        double precoProduto = entrada.nextDouble();


        System.out.print("Cobrar Frete? ");
        boolean cobrarFrete = entrada.nextBoolean();

        double valorFrete = 0;

        if (cobrarFrete) {
            System.out.print("Valor do Frete: ");
           valorFrete = entrada.nextDouble();
        }

        double valorTotal = precoProduto + valorFrete;
        System.out.printf("Valor Total: R$ %.2f", valorTotal);
    }
}
