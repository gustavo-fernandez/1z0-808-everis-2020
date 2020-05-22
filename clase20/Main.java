public class Main {

  public static void main(String args[]) {
    /*Dog dog = new Dog();
    dog.setName("Hulk");
    dog.doSomething();
    System.out.println(dog.toString());

    Cat cat = new Cat();
    cat.setName("Xavi");
    cat.aranar();
    System.out.println("deja de arañar!!!");
    cat.aranar(3);
    System.out.println(cat.toString());*/

    Object obj = new String();
    // Tipo del objeto debe ser el mismo o un tipo compatible (hijo) con el tipo de la referencia
    // String obj = new Object(); No compila!
    Number i = new Integer(1);

    // Polimorfismo: Un mismo objeto se comporta de distintas maneras en distintos momentos
    // TipoDeReferencia nombreVariable = new TipoDeObjeto();
    // TipoDeObjeto is a TipoDeReferencia
    Pet xavi = new Cat(); // Cat is a Pet
    ((Cat) xavi).aranar();
    // Cat xavi2 = (Cat) new Dog(); // Compile time error
    // Cat xavi2 = (Cat) (Pet) new Dog(); // Compila, En runtime ClassCastException extends RuntimeException
    Pet hulk = new Dog();
    // ((Cat) hulk).aranar(); // ClassCastException!

    // Tipo de la referencia define que métodos serán visibles en tiempo de compilación
    Pet x = getPet(1);
    x.doSomething();
    if (x instanceof Cat)
      ((Cat) x).aranar();

    System.out.println(x instanceof Pet); // dog(Pet) is a Pet
    System.out.println(x instanceof Cat); // dog(Pet) is a Cat
    System.out.println(x instanceof Dog); // dog(Pet) is a Dog
    System.out.println(x instanceof Object); // dog(Pet) is a Object
    // System.out.println(x instanceof String); // dog(Pet) is a String // No compila
    Cat c = new Cat();
    System.out.println(c instanceof Pet); // cat(Cat) is a Pet // true
    // System.out.println(c instanceof Dog); // cat(Cat) is a Dog // compile time error!
    c = null;
    System.out.println(c instanceof Pet); // cuando evaluamos con instanceof toda referencia null retorna false

    x = getPet(2);
    x.doSomething();
    if (x instanceof Cat) {
      ((Cat) x).aranar();
    }
  }

  private static Pet getPet(int i) {
    if (i == 1) return new Dog();
    else return new Cat();
  }

}




