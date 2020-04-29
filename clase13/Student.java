public class Student {
  // Class field (static)
  static int anoActual = 2020;
  // Instance fields
  String name;
  String dni;
  int age;
  Student(String name, String dni, int age) {
    this.name = name; this.dni = dni; this.age = age;
  }
  void sayName() { // De instancia
    System.out.println("My name is " + name);
  }
  static void sayAnoActual() { // Compartido
    System.out.println("Este año es " + anoActual);
  }
}
class Main {
  public static void main(String... jjj) {
    /*Student pepito = new Student("Pepito", "10101010", 12);
    pepito.sayName();
    pepito.sayAnoActual();*/
    Student.sayAnoActual();
    /*Student claudita = new Student("Claudita", "80808080", 15);
    claudita.sayName();
    claudita.sayAnoActual();*/
    //Student.sayAnoActual();
  }
}