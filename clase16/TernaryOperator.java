public class TernaryOperator {

  static final public void main(String... args) {
    // Establecer el valor de la variable 'value' a 1 si flag es true o a 0 si flag es false
    int value = getBoolean(false) ? getInt(1) : (byte) 1;
    // condicion booleana ? valor si es verdadero : valor si es falso
    // if (flag) { value = 1; } else { value = 0; }
    System.out.println(value);

    char a1 = (int) 69;

    // Double d = true ? 3 : new Integer(1);
    int a = true ? (int) 69 : '1';
    char b = true ? 65 : '1';

    Object obj = true ? new Boolean(true) : new String("dd");

    // true ? new Boolean(true) : new String("dd");

    String str = "Hola" + new Object();

    System.out.println("1 > " + (true ? 1 : 1.0));
    System.out.println("2 > " + (true ? (int) 69 : '1'));
    System.out.println("2 > " + (true ? 3 : "1"));

    resolve(true ? "Mi String" : "1");
  }

  private static void resolve(String value) {}

  private static int getInt(int integer) {
    System.out.println("getInt(" + integer + ')');
    return integer;
  }
  private static boolean getBoolean(boolean bool) {
    System.out.println("getBoolean(" + bool + ')');
    return bool;
  }

}