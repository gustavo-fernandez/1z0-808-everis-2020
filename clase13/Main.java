public class Main {

  public int i;

  public static void main(String... args) { // Contexto estatico
    // new Main(1), new Main(2), new Main(3)
    // i = 1; // No puedo acceder a miembros de instancia
    counter = 1;
  }

  private static int counter;

  public void print() { // Contexto de instancia
    counter = 1; // Si puedo a miembros static
  }

}