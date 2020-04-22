public class IntOperations {
  public static void main(String... args) {
    // Toda operacion entre enteros (byte, short, char e int) produce un int
    byte a = 127;
    byte b = 3;
    byte c = (byte) (a + b); // byte + byte -> [int]
    System.out.println(c);
    byte d = 1 + 2;
    byte x;
    x = 1;
    System.out.println(d);
  }
}