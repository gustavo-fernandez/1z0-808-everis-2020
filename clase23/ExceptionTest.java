public class ExceptionTest {
  public static void main(String... args) {
    throw new MyException();
  }
}
class MyException extends RuntimeException {}

// Checked
- Throwable
- Exception // Excepciones que están fuera de tu control
- Hijos de Exception que no sean RuntimeException

// Unchecked
- Error y sus Hijos
- RuntimeException y sus hijos