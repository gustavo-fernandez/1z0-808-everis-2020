public class Integrals {

  public static void main(String[] args) {
    byte b = 127;
    byte b1 = -128;
    short s = 32767;
    int i = 2_147_483_647;
    long l1 = 2_147_483_648l;
    long l = 9_223_372_036_854_775_807L;
    char c = 'A';
    int intChar = c;
    int intChar02 = 'C';

    byte byteChar = 'E'; // 69

    // Compilador lo acepta porque es final y sabe que nadie lo modificará
    final char letraE = 'E'; // 69
    byte letraEByte = letraE;

    // Compilador no se la juega // No compila!
    // char letraE2 = 'E'; // 69
    // byte letraEByte2 = letraE2;

    // short x = '\u7FFF';

    final char charShortGrande = '\u7FFF';
    short miShortFromChar = charShortGrande;

    // byte byteChar = 'É'; // 201 No entra en un byte

    char a = 69;
    System.out.println(a);
    int a2 = 'E';
    System.out.println(a2);
    char octalChar = '\105';
    System.out.println(octalChar);

    final int finalVar = 1;
    // finalVar = 2; // No se puede porque a es final

    int[] array = new int[5];
    // array.length = 5; // No se puede el length es un final field que tiene todo array
  }

}