public class StringBuilder02 {

  public static void main(String... args) {
    StringBuilder sb = new StringBuilder();

    System.out.println("Capacity: " + sb.capacity() + ", Length: " + sb.length());
    sb.ensureCapacity(18); // Asegura un mínimo de capacidad
    System.out.println("Capacity: " + sb.capacity() + ", Length: " + sb.length());
    /*for (int i = 0; i < 10_000: i++) {
      sb.append("A");
    }*/

    //printStringBuilder(sb);
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