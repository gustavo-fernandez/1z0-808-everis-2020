public class IncrementAndDecrementOperators {

  public static void main(String... args) {
    int a = 0;
    System.out.println(a); // 0
    a = a + 1;
    System.out.println(a); // 1
    a -= 1;
    System.out.println(a); // 2
    a++;
    System.out.println(a); // 3
    ++a;
    System.out.println(a); // 4

    System.out.println(++a); // 5
    System.out.println(a++); // 5

    int x = 1;
    int y = 2;
    /*
    calcula la suma 'x' y 'y', luego incrementa el valor de 'x' en 1
    muestra en consola el valor de ambas variables (suma, x)
    */
    int suma = ++x + y;
    System.out.println("Suma: " + suma + ", X: " + x);
  }

}