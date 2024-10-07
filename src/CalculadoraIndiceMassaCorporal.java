import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalculadoraIndiceMassaCorporal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Peso: ");
        int peso = sc.nextInt();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double imc = peso/(altura*altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal.");

        }
        if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal.");

        }

        if (imc >= 25 && imc < 30) {
            System.out.println("Acima do peso ideal.");

        }
        if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I.");

        }
        if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau II");

        }

        if (imc >= 40) {
            System.out.println("Obesidade grau III");

        }



        System.out.println("Fim do programa ");


    }
}