public class AssignmentsOperators {
  
  public static void main(String... args) {
    int a = 1;
    a += 2; // a = a + 2
    System.out.println(a); // 3

    int b = 2;
    b *= a; // b = b * a
    System.out.println(b); // 6

    int c = 4;
    c += (c = 3) + c++ + ++c + 1;
    // c = [4 +] (c = 3) + c++ + ++c + 1;
    // c = [4 +] 3 + c++ + ++c + 1; // c => 3
    // c = [4 +] 3 + 3 + ++c + 1; // c => 4
    // c = [4 +] 6 + ++c + 1; // c => 4
    // c = [4 +] 6 + 5 + 1; // c => 5
    // c = [4 +] 11 + 1; // c => 5
    // c = [4 +] 12; // c => 5
    // c = 16; // c => 5
    System.out.println(c);
  }
  // Postfix   a++ a--
  // Prefix    ++a --a
  // Infix     a + b

}