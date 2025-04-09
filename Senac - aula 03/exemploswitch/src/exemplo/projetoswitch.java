package exemplo;

import java.util.Scanner;

public class projetoswitch {

  public class App {
    public static void main(String[] args) throws Exception {

      Scanner scanner = new Scanner(System.in);

      
      
      System.out.println("Digite um valor entre 2 e 6");
      System.out.println("Type a number between 2 and 6");
      System.out.println("Geben sie zahlen zwischen 2 und 5 ein");
      System.out.println("Tapez des valeurs entre 2 et 5");
      int dia = scanner.nextInt();

      if(dia<2 || dia >6 ){
        System.out.println("numero invalido, digite valor entre 2 e 5");
        System.out.println("invalid number, please type numbers between 2 and 5");
        System.out.println("ungultige nummer, bitte geben sie zahlen zwischen 2 und 5 ein");
        System.out.println("numéro invalide, tapez des valeurs entre 2 et 5");
        return;
      }

      switch (dia) {
        case 1:
          System.out.println("hoje é segunda feira,");
          System.out.println("today is monday");
          System.out.println("heute is montag");
          System.out.println("aujourd'hui c'est lundi");
          break;
        case 2:
          System.out.println("hoje é terça,");
          System.out.println("today is tuesday");
          System.out.println("heute is diesntag");
          System.out.println("aujourd'hui c'est mardi");
          break;
        case 3:
          System.out.println("hoje é quarta feira,");
          System.out.println("today is wednesday");
          System.out.println("heute is mittwoch");
          System.out.println("aujourd'hui c'est mercredi");
          break;
        case 4:
          System.out.println("hoje é quinta feira,");
          System.out.println("today is thursday");
          System.out.println("heute is donnerstag");
          System.out.println("aujourd'hui c'est jeudi");
          break;
        case 5:
          System.out.println("hoje é sexta feira,");
          System.out.println("today is friday");
          System.out.println("heute is freitag");
          System.out.println("aujourd'hui c'est vendreri");
          break;
        default:
          System.out.println("numero invalido, digite valor entre 2 e 5");
          System.out.println("invalid number, please type numbers between 2 and 5");
          System.out.println("ungultige nummer, bitte geben sie zahlen zwischen 2 und 5 ein");
          System.out.println("numéro invalide, tapez des valeurs entre 2 et 5");
          break;
      }
      scanner.close();
    }
  }
}
