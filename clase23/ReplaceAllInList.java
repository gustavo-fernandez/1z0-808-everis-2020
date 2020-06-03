import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;
import java.util.function.UnaryOperator;

public class ReplaceAllInList {
  public static void main(String... args) {
    List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    out.println(numeros);
    // numeros.replaceAll(i -> i + 1);
    // numeros.replaceAll((Integer i) -> i + 1);
    // UnaryOperator<Integer> plusOne = (Integer i) -> { return i + 1; };
    // UnaryOperator<Integer> plusOne = new PlusOne();
    numeros.replaceAll(source -> source + 1);
    out.println(numeros);
  }
}
/*class PlusOne implements UnaryOperator<Integer> {
  public Integer apply(Integer source) {
    return source + 1;
  }
}*/