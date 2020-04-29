public class Constructors {
  
  public static void main(String... args) {
    Animal animal = new Animal();
    System.out.println(animal.toString());

    Store store = new Store();
    System.out.println(store.Store());

    Person pepito = new Person("Pepito", 22);
    System.out.println(pepito.name + " | " + pepito.age + " | " + pepito.toString());
    Person otroPepito = new Person(pepito);
    System.out.println(otroPepito.name + " | " + otroPepito.age + " | " + otroPepito/*.toString()*/);
    Person tercerPepito = pepito;
    System.out.println(tercerPepito.name + " | " + tercerPepito.age + " | " + tercerPepito/*.toString()*/);

    pepito.name = "Yo era el primer pepito";
    otroPepito.name = "Yo era el otro pepito";
    tercerPepito.name = "Yo fui el último Pepito :(";
    System.out.println(pepito.name + " | " + pepito.age + " | " + pepito.toString());
    System.out.println(otroPepito.name + " | " + otroPepito.age + " | " + otroPepito/*.toString()*/);
    System.out.println(tercerPepito.name + " | " + tercerPepito.age + " | " + tercerPepito/*.toString()*/);

    Person claudita = new Person("Claudita");
    System.out.println(claudita.name + " | " + claudita.age);
  }

}

class Animal /*extends Object*/ {
  // Animal() { super(); }
}
/*
Object
  ^
Animal
*/
class Store {
  Store Store() { // Esto no es un constructor, es un método
    System.out.println("eres un constructor?");
    return null;
  }
  Store() { // Puede tener cualquier modificador de acceso
    // return null; // No puedo retornar valores en un constructor
    return;
  }
  // No puede ser static, final, abstract, solo puedo tener el modificador de acceso al lado
  Store(int i) {
    i++;
  }
  Store(Store store) {
  }
}

class Person {
  String name;
  int age;
  Person(String name) {
    // this.name = name; this.age = 0;
    this(name, 0);
  }
  Person(String name, int ageParam) {
    super();
    this.name = name;
    age = ageParam;
  }
  Person(Person personParam) {
    // this = new Person(); // this es final
    // this = this; // Tampoco
    this.name = personParam.name;
    this.age = personParam.age;
  }
}
class X {
  X() {
    this(1);
  }
  X(String name) {
    this(name.length());
  }
  X(int y) {
    // this(); // No es posible hacer llamadas recursivas entre constructores
  }
}
class Book {
  Book() {
    this("Unkwnown Author");
  }
  Book(String author) {
    this(author, 0);
  }
  Book(String author, int numPages) {
    this.author = author;
    this.numPages = numPages;
  }
  String author;
  int numPages;
}