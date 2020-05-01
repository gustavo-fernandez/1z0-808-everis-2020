import static java.lang.System.out;

public class Varargs {

  public static void main(String... args) {
    int result = sum(new int[]{1, 2, 3, 4});
    result = sum(1, 2, 3, 4);
    System.out.println(result);

    foo(1, 2);
  }

  private static void foo(int... ints) { out.println("varargs"); }
  private static void foo(int i, int j) { out.println("int, int"); } // En caso de ambiguedad se prefieren los parámetros fijos

  // private void foo(int... i, String... a) {} // No compila
  // private void foo(String... a, int x) {} // No compila -> Siempre los varargs deben ser 1 y el ultimo de los parámetros

  public static int sum(int... nums) {
    int tempSum = 0;
    for (int i : nums) {
      tempSum += i;
    }
    return tempSum;
  }

}