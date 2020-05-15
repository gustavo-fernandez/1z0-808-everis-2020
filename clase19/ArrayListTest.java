import java.util.ArrayList;
// import java.util.List;

import java.time.Period;

public class ArrayListTest {

  final public static void main(final String... args) {
    
    /*ArrayList objList = new ArrayList();
    objList.add(1);
    objList.add(2);
    ArrayList<String> arrayList = objList;
    for (String s : arrayList);*/
    
    // ArrayList<String> arrayList = new ArrayList<>();
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("A");
    arrayList.add("A");
    arrayList.add(0, "B");
    arrayList.add(2, "$");
    arrayList.add(null);
    arrayList.add(" ");
    System.out.println(arrayList);

    String obj = arrayList.remove(2);
    System.out.println("Se elimino: " + obj);
    System.out.println(arrayList);

    boolean deleted = arrayList.remove("A");
    System.out.println("A fue Eliminado? " + deleted);
    System.out.println(arrayList);

    deleted = arrayList.remove("A");
    System.out.println("A fue Eliminado? " + deleted);
    System.out.println(arrayList);

    String elementAtZero = arrayList.get(0);
    System.out.println(elementAtZero);

    boolean containsB = arrayList.contains("B");
    System.out.println("Contains B? " + containsB);

    boolean containsNull = arrayList.contains(null);
    System.out.println("Contains Null? " + containsNull);

    boolean nullRemoved = arrayList.remove(null);
    System.out.println("was Null removed? " + nullRemoved);
    System.out.println(arrayList);

    boolean containsBlank = arrayList.contains(" ");
    System.out.println("Contains blank? " + containsBlank);

    Period p = Period.parse("p-1w");
    System.out.println(p);
  }

}