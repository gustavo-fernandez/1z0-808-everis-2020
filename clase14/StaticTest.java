import java.util.List; // Importa clases
import com.everis.World;
// import static com.everis.World.*; // Importamos miembros static de una clase
import static com.everis.World.QUANTITY;
import static com.everis.World.saludar;

public class StaticTest {

  static final int EDAD_MINIMA = 18;

  public static void main(String... args) {
    System.out.println(StaticTest.EDAD_MINIMA);
    System.out.println(StaticTest.EDAD_MINIMA);

    System.out.println(Peruvian.peruvianNum);
    System.out.println(World.QUANTITY);
    System.out.println(QUANTITY);
    
    saludar();

    if (true) return;

    Peruvian.peruvianNum = 31_000_000;
    System.out.println(Peruvian.peruvianNum);

    Peruvian jorge = new Peruvian();
    jorge.name = "Jorge";
    jorge.peruvianNum = 30_000_000; // No es la forma correcta, sin embargo compila
    //Peruvian.peruvianNum = 30_000_000;

    Peruvian julio = new Peruvian();
    julio.name = "Julio";
    julio.peruvianNum = 20_000_000;

    System.out.println(jorge.peruvianNum);
    System.out.println(Peruvian.peruvianNum);
  }

}

class Peruvian {
  static int peruvianNum;
  String name;
}