public class Exercise {

  public static void main(String... args) {
    int a = 1 * 2 > 1 ? 1 : 0;
    int b = 0;
    b = 1 * 2 > 1 ? (b+=2) : (b+=1);

    System.out.println(1.67);
    System.out.println((int) 1.67);

    // long l = 1234567890;
    float f1 = 1234567890;
    float f2 = 1234567890 + 1;
    // long l = (long) f;
    System.out.println(f1 == f1 + 1);
    System.out.println(f2);

    int var = 1;
    String s;
    if (var == 1) {
      s = "1";
    } else if (var == 2) {
      s = "2";
    } else if (var == 3) {
      s = "3";
    } else s = "";
    System.out.println("Result: " + s);

    { int i = 1; }
    { int i = 2; }

    var = 3;
    s = "";
    switch (var) {
      case 1:
        s += "1";
        //break;
      case 2:
        s += "2";
        //break;
      default:
        s += "*";
        //break;
      case 3:
        s += "$";
        {
          s += "3";
          s += "3.1";
          s += "3.2";
          {{{{{{{{{{}}}}}}}}}}
          break;
        }
      case 4: case 5: case 6:
        s += "456";
        //break;
    }
    System.out.println("Result with switch: " + s);

    final char caseX = 'A';
    char c = 1;
    switch(c = 2) {
      case 1 * 1:
      case (char) -2:
      // case -3:
      case caseX:
    }
  }

}