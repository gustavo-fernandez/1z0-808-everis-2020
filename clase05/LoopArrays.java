public class LoopArrays {

  public static void main(String... args) {
    String[] strings = new String[3];
    strings[0] = "Primero";
    strings[2] = "Tercero";

    // for-each or enhanced for
    for (String string : strings) {
      System.out.println(string);
    }
    for (int i = 0; i < strings.length; i++) {
      System.out.println(strings[i]);
    }
  }

}