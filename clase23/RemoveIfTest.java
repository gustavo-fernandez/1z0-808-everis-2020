import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfTest {
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(2);
    integers.add(3);
    integers.add(4);
    integers.add(5);
    System.out.println(integers);
    integers.removeIf(i -> i % 2 != 0);
    System.out.println(integers);

    List<String> strings = new ArrayList<>(Arrays.asList("A", "", "B", "", null, "", "C"));
    // Quiero eliminar todos los vacios o nulos
    strings.removeIf(s -> s == null || s.isEmpty());
    System.out.println(strings);
    // Heredamos: Miembros de instancia
    // Sobreescribimos: Métodos de instancia no privados y no final
    // ReferenceType variableName = ObjectType;
    // ReferenceType padre de ObjectType
    CharSequence ch01 = new String("Hola");
    CharSequence ch02 = new StringBuilder("Hola");
    System.out.println(ch01 == ch02);
    System.out.println(ch01.equals(ch02));
  }
}
/*
public interface Predicate<T> {
  public abstract boolean test(T t);
}
*/