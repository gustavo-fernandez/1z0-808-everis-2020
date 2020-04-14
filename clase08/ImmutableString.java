public class ImmutableString {

  public static void main(String[] args) {
    String first = "Hola";
    first = "Chau";

    String message = first.concat(" Mundo");
    // "Chau".concat(" Mundo") -> "Chau Mundo"

    String upperCase = first.toUpperCase();

    first = first.toUpperCase();

    System.out.println(message);
    System.out.println(first);
  }

}