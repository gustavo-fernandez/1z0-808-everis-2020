public class ObjectMethods {
  public final static void main(String... arguments) {
    Person p1 = new Person("12345678");
    Person p2 = new Person("12345678");
    System.out.println(p1); // Person@1u72u12u1
    System.out.println(p2); // Person@1u72u12u1
    System.out.println(p1 == p2); // false
    System.out.println(p1.equals(p2)); // true
    System.out.println(p1.equals(null)); // false
    System.out.println(p1.equals("12345678")); // false
  }
}
class Person {
  private final String dni;
  public Person(String dni) {
    this.dni = dni;
  }
  public String getDni() {
    return this.dni;
  }
  @Override
  public boolean equals(Object person) {
    if (this == person) return true;
    if (person instanceof Person) {
      Person p = (Person) person;
      return this.dni.equals(p.dni);
    } else {
      return false;
    }
  }
  @Override
  public String toString() {
    return "Person[" + this.dni + "]";
  }
}