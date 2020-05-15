import static java.lang.System.out;

public class For {

  public static void main(String... args) {
    /*
      classic for
      ===========
      for (
          inicilizacion/sentencias
          ;
          expresion booleana
          ;
          sentencias despues de cada interacion
          ) sentencia o bloque
    */
    // for (;;); Infinite for
    for (int i = 0, j = 1, h = 2; i < 5; i++) {
      System.out.print(i);
    } System.out.println();

    for (int i = 5; i >= 1; i--) {
      System.out.print(i);
    } System.out.println();

    int i = 0;
    for (;i < 5; i++) {
      System.out.print(i);
    } System.out.println();

    i = 0;
    for (;i < 5;) {
      System.out.print(i);
      i++;
    } System.out.println();

    i = 0;
    for (out.println("Iniciando..."), out.println(" :)");i < 5;
        out.println("Terminando la iteración " + i)
    ) {
      System.out.print(i);
      i++;
    } System.out.println();
  }

}