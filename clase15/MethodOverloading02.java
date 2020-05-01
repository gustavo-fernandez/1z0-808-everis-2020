import static java.lang.System.out;

public class MethodOverloading02 {

  static int sum(int i, int j) { out.println("sum(int, int)"); return i + j; } // sum(int, int)
  static float sum(short i, float j) { out.println("sum(int, int)"); return i + j; } // sum(int, int)
  // static int sum(byte i, int j) { out.println("sum(byte, int)"); return i + j; } // sum(byte, int)
  //static double sum(short i, int j) { out.println("sum(short, int)"); return i + j; } // sum(short, int)
  //static double sum(double i, short j) { out.println("sum(int, short)"); return i + j; } // sum(int, short)
  static float sum(float i, float j) { out.println("sum(float, float)"); return i + j; } // sum(float, float)
  static int sum(char i, char j) { out.println("sum(char, char)"); return i + j; } // sum(char, char)
  static byte sum(byte i, byte j) { out.println("sum(byte, byte)"); return (byte) (i + j); } // sum(byte, byte)
  //static int sum(short i, short j) { out.println("sum(short, short)"); return i + j; } // sum(short, short)
  //static long sum(long i, long j) { out.println("sum(long, long)"); return i + j; } // sum(long, long)
  static double sum(double i, double j) { out.println("sum(double, double)"); return i + j; } // sum(double, double)

  public static void main(String []args) {
    //sum(1, 1);
    //sum((byte) 1, 200);
    sum((short) 1, (short) 2_000_000); // sum(double,short) | sum(long,long)
    //char c1 = 1;
    //char c2 = 2;
    //sum(c1, c2);
  }

}