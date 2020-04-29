public class PrimitiveByValue {

  public static void main(String ...args) {
    int a = 0;
    changeIt(a);
    System.out.println(a);
  }

  static void changeIt(int param) {
    param = param + 1;
  }

}