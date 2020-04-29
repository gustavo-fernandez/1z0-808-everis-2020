public class ReferenceByValue {

  public static void main(String arguments[]) {
    Holder h = new Holder();
    System.out.println(h.value); // 0
    changeIt(h);
    System.out.println(h.value); // 1
  }

  private static void changeIt(Holder param) {
    param.value = param.value + 1;
  }

}

class Holder {
  public int value; // default value: 0
}