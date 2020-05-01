import static java.lang.System.out;

public class MethodOverloading03 {

  static void sum(short i, short j) { out.println("sum(short, short)"); }
  
  static void sum(byte i, long j, byte k) { out.println("sum(byt, short, byte)"); }
  static void sum(byte i, short j, short k) { out.println("sum(byte, byte, short)"); }

  public static void main(String... args) {
    byte b1 = 1;
    byte b2 = 2;
    byte b3 = 3;
    sum(b1, b2, b3);
  }

}