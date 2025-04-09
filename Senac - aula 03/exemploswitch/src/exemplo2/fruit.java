package exemplo2;

import java.util.Scanner;

public class fruit {
  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);

    System.out.println("quantas frutas você come durante a semana ? escolha um numero entre 0 a 10");
    int numero = scanner.nextInt();
    
    if (numero<0 || numero > 10 ){
      System.out.println("número é inválido. Digite um número entre 0 e 10");
      return;
    }
    
    String conceito = "";
    if (numero >=9){
      conceito = "A";
     // System.out.println("seu conceito é : " + conceito);
    }else if (numero >=7){
      conceito = "B";
      //System.out.println("seu conceito é:  " + conceito);
    
  }else if(numero >=5){
    conceito = "C";
    //System.out.println("seu conceito é:  " + conceito);
  }else{
    conceito= "D";
   // System.out.println("sua escala é: " + conceito);
  }


    //System.out.println("ente com o conceito do aluno: ");
    //String conceito = scanner.nextLine().toUpperCase();


    switch (conceito.toUpperCase()) {
      case "A":
        System.out.println("Sua saúde está Exceçelente!");
        break;
      case "B":
        System.out.println("Sua saúde está Boa");
        break;
      case "C":
        System.out.println("Sua saúde está Boa, mas pode melhorar");
        break;
      case "D":
        System.out.println("Precisa comer mais frutas");
        break;
      default:
        System.out.println("numero invalido, digite apenas A, B, C ou D");
        break;
    }
    scanner.close();

  }
  }


