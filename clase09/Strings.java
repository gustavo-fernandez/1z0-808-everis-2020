public class Strings {

  public static void main(String[] args) {
    String a = "Hola";
    System.out.println(a);

    String b = new String("Hola");
    System.out.println(b);

    // char charArray[] = new char[]{'H', 'o', 'l', 'a'};
    char charArray[] = {'H', 'o', 'l', 'a'};
    String c = new String(charArray);
    System.out.println(c);

    // String d = new String({'H', 'o', 'l', 'a'}); // NO
    String d = new String(new char[]{'H', 'o', 'l', 'a'});
    System.out.println(d);

    // Hola-> (0)H (1)o (2)l (3)a
    char eChar = d.charAt(2);
    System.out.println(eChar);
  }

}