public class LabelLoops {

  public static void main(String... args) {
    int[] array01 = { 1, 2 };
    int[] array02 = { 10, 11 };

    d: for (int i = 0; i < 2; i++) {
      //
    }

    e:
    int i = 0;

    main: for (int item01 : array01) {
      System.out.println("Array01: " + item01);
      s:
      for (int item02 : array02) {
        System.out.println("Array02: " + item02);
        if (item02 == 10) {
          continue main;
        }
      }
      System.out.println("Acabo el for 'main'");
    }
  }

}