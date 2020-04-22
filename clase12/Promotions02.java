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

public class Promotions02 {
  public static void main(String... args) {
    System.out.println(5 / 2); // -> int / int -> [int]
    System.out.println(5 / 2.0); // -> int / double -> double / double -> [double] -> 5.0 / 2.0
    System.out.println(5 / (int) 2.0); // int + int -> [int]
    int b = 2_147_483_647;
    System.out.println(b + 1); // int + int -> [int]
    System.out.println(b + 1L); // int + long -> long + long -> [long]
    System.out.println(b + 1.0); // int + double -> double + double -> [double]

    int num1 = 7;
    int num2 = 2;
    double d = num1 / num2; // int / int -> [int] -> 3 // double d = 3; // d = 3.0

    System.out.println((int) 56.7);
    System.out.println((int) 56.2);
  }
}