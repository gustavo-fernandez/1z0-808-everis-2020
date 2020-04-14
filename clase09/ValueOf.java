import java.util.Arrays;

public class ValueOf {

  public static void main(String[] args) {
    Object a = null;
    String string = String.valueOf(a); // "null"
    System.out.println(string.toString());

    int integer = 123;
    String intString = String.valueOf(integer);
    String[] arrayString = intString.split("");
    System.out.println(Arrays.toString(arrayString));

    char[] x = null;
    String.valueOf(x); // NullPointerException
  }

}