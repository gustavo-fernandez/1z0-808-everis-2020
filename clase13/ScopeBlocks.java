public class ScopeBlocks {
  {
    // Este es un bloque de instancia
  }
  
  static {
    // Este es un bloque de clase
  }

  public void draw(int numberParam) {
    for (int i = 0; i < 1; i++) {
      //System.out.println(i);
    }
    int i = 6;
    //for (int i = 0; i < 1; i++) {
    //  System.out.println(i);
    //}
    {
      int a = 0;
    }
    {
      int a = 0;
    }
    hola:{ hola1:{{{{{{{{{{{{{}}}}}}}}}}}}}}
    hola: {
      int number = 1;
      System.out.println(++number);
      System.out.println(++number);
      if (number == 3) {
        break hola;
      }
      System.out.println(++number);
      System.out.println(++number);
    }
  }
  public void setColor() {
    color = "Red";
  }

  public static void main(String... args) {
    new ScopeBlocks().draw(1);
  }
  String color;
}