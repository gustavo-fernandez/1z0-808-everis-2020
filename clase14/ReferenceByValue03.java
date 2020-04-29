public class ReferenceByValue03 {

  public final static void main(String args[]) {
    Holder h = new Holder();
    System.out.println(h.value); // 0
    h = changeIt(h);
    System.out.println(h.value); // 5
  } 

  private static Holder changeIt(Holder param) {
    param = new Holder();
    param.value = 5;
    return param;
  }

}

// class Holder { int value; /* Incializa a 0 */ }