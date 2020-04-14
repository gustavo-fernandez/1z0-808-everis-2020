public class ConditionalOperators {

  public final static void main(String[] args) {
    System.out.println("==== AND ====");
    // AND
    // true and true   = true
    // true and false  = false
    // false and true  = false
    // false and false = false

    // And cortocircuito
    boolean exp3 = false && getBoolean("AND Cortocircuito");
    System.out.println(exp3);
    // And
    boolean exp4 = false & getBoolean("AND Tontito");
    System.out.println(exp4);

    System.out.println("==== OR ====");
    /* OR
       true  or true  = true
       true  or false = true
       false or true  = true
       false or false = false
    */

    // Or cortocircuito
    boolean exp5 = true || getBoolean("OR Cortocircuito");
    System.out.println(exp5);
    boolean exp6 = true | getBoolean("OR Tontito");
    System.out.println(exp6);
  }

  private static boolean getBoolean(String indicador) {
    System.out.println("metodo getBoolean en " + indicador);
    return true;
  }

}