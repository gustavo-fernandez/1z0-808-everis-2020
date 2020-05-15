import static java.lang.System.out;

public class TernaryOperator {

  final public static void main(String... args) {
    int variable = 1;
    // boolean-expression ? value-if-true : value-if-false
    //String result = (variable == 2)
    //                  ? ("Ok")
    //                  : ((1 == 2) ? ("True") : ("False"));
    CharSequence result = variable == 2 ? "01" : 1 == 2 ? "02" : new StringBuilder("03");
    out.println("Result: " + result);
    String s = String.valueOf(1);
    // Double d = 2.3f; // No compila
    String s2 = 1 == 2 ? getValue("True") : getValue("False");

    String s3 = evaluate() ? getValue("True") : getValue("False");
  }

  private static final String getValue(String s) {
    out.println("Returning " + s);
    return s;
  }
  private static final boolean evaluate() {
    out.println("Evaluating...");
    if (true) throw new RuntimeException();
    return true;
  }

}