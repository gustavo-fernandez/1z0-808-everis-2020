public class StringBuilder01 {

  public static void main(String... args) {
    // new StringBuilder() -> Capacity: 16, length: 0
    // new StringBuilder(1_000) -> Capacity: 1000, length: 0
    StringBuilder sb = new StringBuilder("Hola Mundo"); // Internamente almacena un array de bytes (caracteres)
    System.out.println("'" + sb.toString() + "'");
    System.out.println("Capacity: " + sb.capacity() + ", Length: " + sb.length());
    sb.append("1234567812345678");
    System.out.println("Capacity: " + sb.capacity() + ", Length: " + sb.length());
    // Si necesita mas espacio: crecer
    // nuevaCapacidad = capacidadActual * 2 + 2
    // nuevaCapacidad > capacidadRequerida
    //sb.append("11234567891234567891234567890****");
    sb.append("1 ");
    //sb.trimToSize();
    System.out.println("Capacity: " + sb.capacity() + ", Length: " + sb.length());
    printStringBuilder(sb);
  }

  private static void printStringBuilder(StringBuilder sb) {
    class Repeat {
      private String str;
      private Repeat(String str) {
        this.str = str;
      }
      private String times(int times) {
        return new String(new char[times]).replace("\u0000", str);
      }
    }
    char[] array = sb.toString().toCharArray();
    String indexes = "|";
    for (int i = 0; i < sb.capacity(); i++) {
      indexes += i + "|";
    }
    String values = "|";
    for (int i = 0; i < sb.capacity(); i++) {
      int numOfDigits = i == 0 ? 1 : (int) Math.log10(i) + 1;
      values += (i < array.length ? array[i] : "\u02C4") + new Repeat(" ").times(numOfDigits - 1) + "|";
    }
    System.out.println(new Repeat("\u02CD").times(indexes.length()));
    System.out.println(indexes);
    System.out.println(values);
    System.out.println(new Repeat("\u02C9").times(values.length()));
  }

}