// Primitivos Numéricos
// long     64 bits
// short    16 bits
// int      32 bits
// double   64 bits
// byte     8 bits
// float    32 bits
// char     16 bits   (2 bytes)

// [                  double                    ] // mala precision
//      [             float                  ] // mala precision
//           [        long              ]
//             [      int             ]
//                    [char*          ]
//                [    short   ]
//                  [  byte ]
public class Casting {
  public static void main(String... args) {
    double d = 1.2;
    float f = 1.2f;
    long l = 3_000_000_000L; // 1  o   1L
    int i = 1;
    char c = 69;
    short s = 2;
    byte b = 127;
    // Casting
    f = (float) d;
    i = (int) l;
    // System.out.println(l);
    // System.out.println(i);

    // Rango de valores del byte: desde -128 hasta el 127
    short s1 = 129;
    byte b1 = (byte) s1;
    System.out.println(b1);

    // byte -> -128          127
    //         -128                   +1
    //         -127                   +2
    //         -126                   +3

    int i1 = 69;
    char c1 = (char) i1;
    System.out.println(c1);
    System.out.println(i1);
    System.out.println((int) c1);
    System.out.println((char) i1);

    byte b2 = 'a';
    byte b3 = (byte) ('a' + 1);
    System.out.println((char) b3);

    byte x = '5';
    System.out.println(x);
    // A) No imprime 5 en consola
  }
}