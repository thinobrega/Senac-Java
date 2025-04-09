package exemplo;

import java.util.Scanner;

public class SwitchComString {

  public static void main(String[] args) throws Exception {


    Scanner scanner = new Scanner(System.in);

    System.out.println("digite a nota no aluno (0 a 10)");
    double nota = scanner.nextDouble();
    
    if (nota<0 || nota > 10 ){
      System.out.println("nota é inválida. digite valores entre 0 e 10");
      return;
    }
    
    String conceito = "";
    if (nota >=9){
      conceito = "A";
     // System.out.println("seu conceito é : " + conceito);
    }else if (nota >=7){
      conceito = "B";
      //System.out.println("seu conceito é:  " + conceito);
    
  }else if(nota >=5){
    conceito = "C";
    //System.out.println("seu conceito é:  " + conceito);
  }else{
    conceito= "D";
    System.out.println("seu conceito é: " + conceito);
  }


    //System.out.println("ente com o conceito do aluno: ");
    //String conceito = scanner.nextLine().toUpperCase();


    switch (conceito.toUpperCase()) {
      case "A":
        System.out.println("Exceçelente");
        break;
      case "B":
        System.out.println("Bom");
        break;
      case "C":
        System.out.println("Bom, mas pode melhorar");
        break;
      case "D":
        System.out.println("Precisa se esforçar mais ");
        break;
      default:
        System.out.println("Conceito invalido, digite apenas A, B, C ou D");
        break;
    }
    scanner.close();

  }
}
