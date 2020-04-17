public class Modulus {

  public static void main(String ... args) {
    int result = 5 / 7;
    System.out.println("5 / 7 -> " + result);

    // result = 2 / 0; // java.lang.ArithmeticException (Siempre que sea una operacion entre enteros division entre cero)
    // System.out.println("0 / 0 : " + result);

    result = 5 % 7;
    System.out.println("5 % 7 -> " + result);

    double doubleResult = 0.0 % 0;
    System.out.println("0.0 % 0 -> " + doubleResult);

    doubleResult = 1.0 % 0;
    System.out.println("1.0 % 0 -> " + doubleResult);

    result = 1 / 2;
    System.out.println("1 / 2 -> " + result);

    result = 3 / 2;
    System.out.println("3 / 2 -> " + result);

    result = 3 % 2;
    System.out.println("3 % 2 -> " + result);


    // En simple el resultado toma el signo del numero del operando de la izquierda
    result = -3 % 2;
    System.out.println("-3 % 2 -> " + result);

    result = 3 % -2;
    System.out.println("3 % -2 -> " + result);

    result = -3 % -2;
    System.out.println("-3 % 2 -> " + result);

    result = -2 % 5;
    System.out.println("-2 % 5 -> " + result);
  }

}