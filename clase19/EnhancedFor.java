import java.util.ArrayList;
import java.util.Iterator;

public class EnhancedFor {

  public final static void main(String... args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(Integer.valueOf(1));
    arrayList.add(2);
    arrayList.add(2, new Integer(3));
    for (Integer a : arrayList) {
      //System.out.println(a);
    }

    ArrayList<int[]> x = null;

    // for (Integer val : new MyArray()) {}

    do {;;;;;;;;} while (false);

    for (int i = 1; i <= 5; i++) {
      if (i == 4) continue;
      System.out.println(i);
    }
    /*for (int i = 1; i <= 5;) {
      if (i == 4) continue;
      System.out.println(i);
      i++;
    }*/
    hola: {
      break hola;
    }
    hola: for (;;) {
      hola1: for(;;) {
        hola2: for(;;) {
          break hola;
        }
      }
    }
  }

}

class MyArray implements Iterable<Integer> {

  public Iterator<Integer> iterator() {
    return null;
  }

}