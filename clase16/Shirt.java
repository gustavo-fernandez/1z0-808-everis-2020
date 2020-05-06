public class Shirt extends Object {

  // Red: 1, Green: 2, Blue: 3
  private int color;

  public Shirt() {
    this("Red"); // this debe lo primero en el constructor
  }
  public String(int color) {
    super(); // super debe ser lo primero en el constructor
    setColor(color);
  }
  public String(String color) {
    // super();
    setColor(color);
  }

  public void setColor(int color) {
    if (color > 0 && color < 4) {
      this.color = color;
      return;
    }
    throw new IllegalArgumentException("Invalid color");
  }

  public void setColor(String color) {
    if ("Red".equals(color)) {
      this.color = 1;
    } else if ("Green".equals(color)) {
      this.color = 2;
    } else if ("Blue".equals(color)) {
      this.color = 3;
    }
    throw new IllegalArgumentException("Invalid color");
  }

  public String getColor() {
    return this.color;
  }

  public static void main(String[] args) {
    Shirt shirt = new Shirt();
    shirt.setColor("Rojo");

    Shirt shirt = new Shirt();
    shirt.setColor(1);
  }

}