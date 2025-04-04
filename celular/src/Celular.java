public class Celular {

  // atributos
  String sistemaOperacional; // ios ou android
  String modelo; // modelo do cel
  boolean bateria;
  String appsPermitidos;

  // metodos

  void status() {
    System.out.println("======================== Info ======================== ");
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Sistema Operacional: " + this.sistemaOperacional);
    System.out.println("Está Carregado: " + this.bateria);
    System.out.println("Apps Permitidos: " + this.appsPermitidos);
    System.out.println("====================================================== ");

  }

  void ligar() {
    // só liga se tiver bateria
    this.bateria = true;
    System.out.println("Celular Ligado");

  }

  void desligar() {
    this.bateria = false;
    System.out.println("Celular Desligado");

  }

  void conectarInternet() {

    if (this.bateria == false) {
      System.out.println("Não é possível conectar a internet um celular desligado.");
    } else {
      System.out.println("Celular Conectado a Internet ! ");
    }

  }

  void baixarAppsAndroid() {
  }

  void baixarAppsIOS() {
  }

}
