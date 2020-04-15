public class UpdateStringBuilder {

  public static void main(String... args) {
    StringBuilder sb = new StringBuilder();
    // StringBuilder sb02 = sb.append("Hola");
    // System.out.println(sb == sb02);
    StringBuilder sb02 = sb.append("hola")
      .append(" ")
      .append("Mundo")
      .append("!")
      .deleteCharAt(0)
      .insert(0, "H");
      //.reverse();
    System.out.println(sb);
    System.out.println(sb == sb02);
  }

}