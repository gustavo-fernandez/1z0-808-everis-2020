public class Ejercicio {
  public static void main(String[] args) {

	boolean outOfStock;

	int quantity = 0;


	if  (quantity > 0)
		outOfStock = true;
  else
		outOfStock = false;

	if (outOfStock)
		System.out.println("Stock ok");	
  else
		System.out.println("Item is unavailable");
  }
}