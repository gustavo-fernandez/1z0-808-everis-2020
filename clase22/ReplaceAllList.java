import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.*;

public class ReplaceAllList {

  public static void main(String... args) {
    List<Integer> elements = new ArrayList<>(Arrays.asList(1, 2));

    // void replaceAll(UnaryOperator<E> operator);
    elements.replaceAll(integer -> integer + 1);

    System.out.println(elements);
  }

}
class Sumar1 implements UnaryOperator<Integer> {
  // T apply(T t);
  public Integer apply(Integer integer) {
    return integer + 1;
  }
}