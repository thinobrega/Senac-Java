import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entre com sua idade");
        int idade = scanner.nextInt();
        
        /**    
        System.out.println("entre com seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Ola" + nome + " a sua idade es de : " + idade);
        */
      scanner.close();
        
        
        if ( idade >= 16 && idade <=65   ) {
            System.out.println( "sua idade es  " + idade );
            System.out.println(" es uma idade valida ");
        }else{
            System.out.println("");

            System.out.println( " sua idade " + idade + " nao e valida. " );
            System.out.println(" deve ser entre 16 e 65. ");

        }
        


    }
}
