public abstract class Animal {
  private String name;
  /* [access modifier] */ Animal(String name) {
    if (name == null) {
      throw new IllegalArgumentException("Name can't be null");
    }
    this.name = name;
  }
  public String getName() { return this.name; }
  protected abstract double getWeight();
  public Object getObject() {
    return null;
  }
  static void foo() {}
}
class Dog extends Animal {
  Dog() {
    super("Perrito");
  }
  protected double getWeight() {
    return 40.0;
  }
}
abstract class Cat extends Animal {
  Cat(String name) {
    super(name);
  }
  abstract public double getWeight();
  abstract public String toString();
}
class Angora extends Cat {
  Angora(String name) {
    super(name);
  }
  public double getWeight() {
    return 7.0;
  }
  public StringBuilder getObject() {
    return new StringBuilder("Gatito").append("!");
  }
  public String toString() {
    return "Este es el toString de Angora";
  }
}
abstract class X {
  abstract void foo(); // No puede ser private ni static ni final
}
class Main {
  public static void main(String... args) {
    // Animal dog = new Animal("Hola"); // No puedo instancia
    Animal dog = new Dog();
    Animal angora = new Angora("Angorita");

    System.out.println(dog.getWeight());
    System.out.println(dog.getName());
    System.out.println(dog);

    System.out.println(angora.getWeight());
    System.out.println(angora.getName());
    System.out.println(angora);
  }
}