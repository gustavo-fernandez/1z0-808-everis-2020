public class StringBuilderModifyMethods {
  
  public static void main(String... args) {
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World"); // Anade una cadena al final
    sb.append(true); // Anade la cadena 'true' al final
    sb.append(new char[] { '!' }); // Anade la cadena 'true' al final
    sb.append(2019); // Anade la cadena 'true' al final
    // sb.append(null); // Ambiguo, no sabe que sobrecarga tomar append(CharSequence) o append(char[])  (Compile Time)
    // sb.append((char[]) null); // Ojo, NullPointerException
    // sb.append((CharSequence) null); // Anade la cadena 'null' al final
    CharSequence cs = null; sb.append(cs); // Anade la cadena 'null' al final
    String str = null; sb.append(str); // Anade la cadena 'null' al final
    sb.insert(11, " ");
    // sb.insert(1, "E***");
    System.out.println("'" + sb.toString() + "'");
    sb.insert(sb.length(), "+"); // Insert al final de la cadena
    System.out.println("'" + sb.toString() + "'");

    StringBuilder message = new StringBuilder("Hola");
    message.insert(4, "!");
    message.insert(0, new char[] { '-', '+' });
    message.insert(0, new char[] { '*', '$' }, 1 /* desde que posicion */, 1 /* Que cantidad */);
    message.deleteCharAt(0);
    message.deleteCharAt(message.length() - 1);
    // message.deleteCharAt(message.length()); // StringIndexOutOfBoundsException
    message.delete(0 /* Inclusivo */, 2 /* Exclusivo */); // Logica de parametros similar a la del substring
    System.out.println(message);

    System.out.println(message.charAt(3));
  }

}