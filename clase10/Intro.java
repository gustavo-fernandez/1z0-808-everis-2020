public class Intro {

  public static void main(String... args) {
    String x = "*"; // 1 // Thread Safe
    x = x.concat("Hola"); // Hola (2) | *Hola (3)
    x = x.concat(" Mundo"); //  Mundo (4) | *Hola Mundo (5)
    x = x.concat(String.valueOf(1)); // "1" (6) | *Hola Mundo 1 (7)
    System.out.println(x);

    StringBuilder sb = new StringBuilder(); // SB (1) // No Thread Safe
    sb.append("*"); // * (2)
    sb.append("Hola"); // Hola (3)
    sb.append(" Mundo"); // Mundo (4)
    sb.append(1);
    sb.reverse();
    System.out.println(sb);
    // StringBuffer // Thread Safe
  }

}