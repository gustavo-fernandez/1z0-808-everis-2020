public class WhileVsDoWhile {

  public static final void main(String... arguments) {
    int i = 0;
    while (++i < 2) {
      System.out.println(i);
    }
    System.out.println("===");
    int x = 0;
    do {
      System.out.println(x);
    } while (++x < 2);
  }

}
