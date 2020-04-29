public class BooleanTest {

  public static void main(String... args) {
    boolean b = Boolean.parseBoolean("ddd");
    System.out.println(b);
    b = Boolean.parseBoolean("false");
    System.out.println(b);
    b = Boolean.parseBoolean("fAlSe");
    System.out.println(b);
    b = Boolean.parseBoolean("FALSE");
    System.out.println(b);
    b = Boolean.parseBoolean("");
    System.out.println(b);
    b = Boolean.parseBoolean("1");
    System.out.println("1 > " + b);
    b = Boolean.parseBoolean(null);
    System.out.println("null > " + b);

    b = Boolean.parseBoolean("true");
    System.out.println(b);
    b = Boolean.parseBoolean("TRUE");
    System.out.println(b);
    b = Boolean.parseBoolean("tRuE");
    System.out.println(b);
  }

}