import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ListTest {
  public static void main(String... args) {
    List<String> arrayList = new ArrayList(); // java.util.ArrayList
    List<Integer> list = Arrays.asList(1, 2, 3); // java.util.Arrays.ArrayList
    // list.add(4); // java.lang.UnsupportedOperationException
    list.set(2, 4);
    // list.clear(); // java.lang.UnsupportedOperationException
    System.out.println(list);
    // array > length
    // String > length()
    // StringBuilder > length()
    // List > size()
    /*
    new ArrayList();
      .size()
      .clear()
      .add()
      Object .remove(int index)
      boolean .remove(Object object)
      .set(int, E)
      .isEmpty()
      .removeIf(Predicate<E>)
      .addAll(Collection)
      new ArrayList(Collection)
      new ArrayList(int)
    */

  }
}