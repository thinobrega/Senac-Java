public class App {
    public static void main(String[] args) throws Exception {

        Celular c1 = new Celular();
        Celular c2 = new Celular();

        c1.sistemaOperacional = "IOS";
        c1.modelo = "Iphone X";
        c1.appsPermitidos = "Apenas apps IOS";

        c2.sistemaOperacional = "Android";
        c2.modelo = "Galaxy X";
        c2.appsPermitidos = "Apenas apps Android";

        c1.status();
        c1.ligar();
        c1.conectarInternet();

        c2.status();
        c2.desligar();
        c2.conectarInternet();

    }
}
