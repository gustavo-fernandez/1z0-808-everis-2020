public class Undescore {
  //static String _ = "Hola";

  public static void main(String... args) {
    int a[][] = new int[2][];
    a[0] = new int[6];
    a[1] = new int[2];

    int b[][][] = new int[2][][];
    b[0] = new int[6];
    b[1] = new int[2];

    b[0][5] = new int[2];
  }
}

/*
private             Clase
(package-private)   Package
protected           Package   Inherintance
public              All
*/