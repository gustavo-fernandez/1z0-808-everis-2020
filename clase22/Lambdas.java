public class Lambdas {
  public static void main(String... args) {
    Saludar diAlgo = (mensaje) -> System.out.println(mensaje);
    diAlgo.saluda("Hello");
    diAlgo.saludame();
  }
}
// Para usar una lambda tienes que tener una FunctionalInterface
// FunctionalInterface: Una interfaz con un solo metodo abstract
interface Saludar {
  void saluda(String mensaje);
  default void saludame() { System.out.println("metodo saludame"); }
}
/*class SaludarEnEspanol implements Saludar {
  public void saluda() {
    System.out.println("Hola");
  }
}*/