import java.util.Arrays;

public class Arrays01 {

  public static void main(String... arguments) {
    String[] array = { "01", "02", "03" };
    array[1] = "Dos";
    // System.out.println(array);
    System.out.println(Arrays.toString(array));
    System.out.println("Tamano del array: " + array.length);
    // array.length = 4; // No se puede modificar al ser "final"

    String array2[] = new String[]{ "01", "02", "03" };
    System.out.println(Arrays.toString(array2));

    // No compila!
    // String[] array3 = new String[3]{ "01", "02", "03" };

    char[] charArray = { '1', '2', '3' };
    System.out.println(charArray);

    String[] strArray = new String[3]; // El 3 es el tamano del array
    strArray[0] = "Hola"; // El 0 es el indice
    strArray[2] = "Java8";
    // strArray[3] = ""; // java.lang.ArrayIndexOutOfBoundsException
    System.out.println(Arrays.toString(strArray));

    int[] intArray = new int[2];
    System.out.println(Arrays.toString(intArray));

    boolean[] boolArray = new boolean[4];
    System.out.println(Arrays.toString(boolArray));

    String
          arrayDeStrings[] = {"Uno", "Dos"},
          arrayDeStrings2[] = {"Uno", "Dos", "Tres"},
          miString = "Algun String";
    System.out.println(Arrays.toString(arrayDeStrings));
    System.out.println(Arrays.toString(arrayDeStrings2));
    System.out.println(miString);
  }

}