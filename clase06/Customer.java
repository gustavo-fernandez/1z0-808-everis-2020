public class Customer {

  private int id;
  private Cart cart;

  Customer() {
    id = 0;
    cart = new Cart();
  }

  public static void main(String... args) {
    Customer c01 = new Customer();
    new Customer();
  }

}
class Cart {
  private double total;
}