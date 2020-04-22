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

public class Promotions {
  public static void main(String... args) {
    double d = 1.2;
    float f = 1.2f;
    long l = 1; // 1  o   1L
    int i = 3;
    char c = 69;
    short s = 2;
    byte b = 127;
    // Promotions
    d = f; d = l; d = b; d = c; // doubles
    //f = d; // No compila
    f = l; f = i; f = c; f = s; f = b;
    // l = f; // No compila
    l = i; l = c; l = b;
    // i = l; i = f; // No compilan
    i = c; i = s; i = b;
    // c = b; // No compila a menos que b sea final y tenga un valor positivo
    s = b;
    // b = s; // No compila

    // System.out.println(c);
  }
}