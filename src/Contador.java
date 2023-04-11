import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro:");
            int num1 = sc.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int num2 = sc.nextInt();

            if (num1 >= num2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            for (int i = num1; i <= num2; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.err.println("Os parâmetros devem ser números inteiros");
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }
    }
}
