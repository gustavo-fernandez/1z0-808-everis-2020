public class Encapsulation { // Top level class

  public static void main(String... args) {
    Person p = new Person(new StringBuilder("12345678"));
    p.setAge(16);
    p.state();

    p.setAge(19);
    p.state();

    System.out.println("El DNI es: " + p.getDni());
  }

}

// El DNI nunca puede ser distinto de 8
// Quiero que el DNI pueda ser leído desde cualquier clase
/* public */ class Person {
  Person(StringBuilder dni) {
    if (dni.length() != 8) {
      throw new RuntimeException("DNI no es correcto");
    }
    this.dni = dni;
  }
  private final StringBuilder dni;
  private String name;
  private int age;

  public String getDni() {
    return this.dni.toString();
  }
  void setAge(int age) {
    this.age = age;
  }
  public int getAge() {
    return this.age;
  }
  public void state() {
    System.out.println(age >= 18 ? "Mayor de edad" : "Menor de edad");
  }
}