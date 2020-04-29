public class ConvertingValues {

  // valueOf(xxx) -> static method
  // xxxValue() -> Instance methods
  public static void main(String... args) {
    Byte b = new Byte((byte) 1);
    Byte c = Byte.valueOf((byte) 1);
    Byte d = 1; // Byte d = Byte.valueOf((byte) 1);
    byte e = c; // byte e = c.byteValue();

    Integer i = 1;
    System.out.println(Integer.valueOf("1")); // retorna un wrapper
    System.out.println(Integer.parseInt("1")); // retorna un int

    int i2 = Integer.valueOf("1"); // int i2 = Integer.valueOf("1").intValue();
    int i3 = Integer.parseInt("1");

    Integer i4 = new Integer(4);
    byte f = i4.byteValue();
  }

}
// Byte, Short, Integer, Long, Double, Float > abstract Number
/*
byte      Byte
short     Short
int       Integer
long      Long
char      Character
float     Float
double    Double
boolean   Booean
*/