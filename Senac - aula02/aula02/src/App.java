import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        /*
         * ======================================================================
         * INPUT DOS NUMEROS
         * ======================================================================
         */

        System.out.println("Digite 1 número: ");
        Float num1 = scanner.nextFloat();
        System.out.println("Digite outro numero: ");
        Float num2 = scanner.nextFloat();

        /*
         * ======================================================================
         * APRESENTAÇÃO DAS OPERAÇÕES
         * ======================================================================
         */

        System.out.println("==========================================");
        System.out.println("Operações Aritméticas:");
        System.out.println("==========================================");

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("__________________________________________");

        /*
         * ======================================================================
         * CAPTURA DO TIPO DE OPERAÇÃO
         * ======================================================================
         */

        System.out.println("Escolha a opção acima:");
        int num0 = scanner.nextInt();

        if (num0 >= 1 && num0 <= 4) {
            System.out.println("voce escolheu: " + num0);

            /*
             * ======================================================================
             * OUTUPT DOS NUMEROS
             * ======================================================================
             */

            switch (num0) {
                case 1:
                    System.out.println("O resultado da soma é: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("O resultado da subtração é: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("O resultado da divisão é: " + (num1 / num2));
                    break;
                case 4:
                    System.out.println("O resultado da multiplicação é: " + (num1 * num2));
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("numero deve ser entre 1 e 4");
        }
        scanner.close();
    }
}
