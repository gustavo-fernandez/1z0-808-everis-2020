public class Objects01 {

  public static void main(String... args) {
    String x = null;
    String y = null;
    x = "c1";
    y = x;
    String z = "c2";
    y = z;
    x = y;
    new Object();
    new String("c3");
  }

}