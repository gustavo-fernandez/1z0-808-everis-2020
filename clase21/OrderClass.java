class Super {
  private int i = getValue("i initialization");
  { System.out.println("instance block 1"); }
  Super() {
    System.out.println("Super.constructor");
  }
  { System.out.println("instance block 2"); }
  private static int getValue(String message) {
    System.out.println(message);
    return 1;
  }
  static {
    System.out.println("static block");
  }
  private int x = getValue("x initialization");
}
class Sub extends Super {
  Sub() {
    /* super(); */
    System.out.println("Sub.constructor");
  }
  public static void main(String... args) {
    new Sub();
    new Sub();
  }
}