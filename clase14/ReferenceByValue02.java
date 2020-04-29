public class ReferenceByValue02 {

  public static void main(String... args) {
    Holder h = new Holder();
    System.out.println(h.value); // 0
    changeIt(h);
    System.out.println(h.value); // 0
  }

  private static void changeIt(Holder param) {
    param = new Holder();
    param.value = 5;
    System.out.println(param.value);
  }

}
// class Holder { int value; /* Incializa a 0 */ }