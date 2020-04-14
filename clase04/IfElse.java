public class IfElse {

  byte b; // 0
  short s; // 0
  int i; // 0
  static long l; // 0
  char c; // 0 \u0000
  float f; // 0.0
  double d; // 0.0
  static boolean bool; // false

  public static void main(String... args) {
    // Variables locales no se inicializan por defecto
    int attendes = 4;

    boolean largeVenue;

    if (attendes >= 5) {
      largeVenue = true;
    } else {
      // largeVenue = false;
    }

    // largeVenue = attendes >= 5;

    System.out.println(largeVenue);
  }

}