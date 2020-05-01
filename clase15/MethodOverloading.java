public class MethodOverloading {

  public static String getName() { // getName()
    return "Nombre";
  }

  private static void getName(String id) { // getName(String)
    System.out.println("getName(String id)");
  }

  //void getName(String string) {} // getName(String) // No permitido

  private final int getName(int id) { // getName(int)
    return id + 1;
  }

  void getName(int a, float f) {} // getName(int, float)
  void getName(float a, int f) {} // getName(float, int)

  public static void main(String... args) {
    System.out.println(getName());
    getName("ID");
    System.out.println(new MethodOverloading().getName(1));

    //String s = String.valueOf(null); // char[]
    String s2 = String.valueOf((Object) null);
    System.out.println(s2);
  }

}