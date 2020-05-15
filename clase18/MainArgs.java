import java.util.Arrays;
import static java.lang.System.out;

public class MainArgs {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(args));
    out.println(sum(args));
    // sum(new int[]{1, 2});
  }

  public static int sum(String... ints) {
    int total = 0;
    for (String i : ints) {
      // total += Integer.valueOf(i); // java.lang.Integer
      total += Integer.parseInt(i); // int
    }
    return total;
  }

}