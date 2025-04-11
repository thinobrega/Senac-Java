import java.util.Scanner;

public class tabuada {

public static void main(String[] args) {

  
  Scanner scanner = new Scanner(System.in);

  System.out.println("entre com o numero da tabuada");
 
  int tabuada = scanner.nextInt();



  for (int i = 1; i <11; i++) 
  { System.out.println(tabuada +  " X " + i + " = " + tabuada * i ); 
  }




}

}
