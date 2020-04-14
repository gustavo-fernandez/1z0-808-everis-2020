public class InitializationTest {

  // Fields
  private static String name;
  private static int age;
  static private double salary;
  static private boolean flag;

  static public final void main(String args[]) {
    // Las variables locales no se inicializan por defecto
    String lastname = null;
    System.out.println(lastname);
    System.out.println(name);
    System.out.println(age);
    System.out.println(salary);
    System.out.println(flag);
  }

}