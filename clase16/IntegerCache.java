public class IntegerCache {

  public static void main(String... args) {
    Integer a1 = new Integer(1);
    Integer b1 = new Integer(1);
    System.out.println(a1 == b1);

    Integer a2 = Integer.valueOf(new Integer(1).intValue());
    Integer b2 = new Integer(1).intValue();
    System.out.println(a2 == b2);
  }

}