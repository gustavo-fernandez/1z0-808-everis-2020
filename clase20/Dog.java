public class Dog extends Pet {

  @Override
  protected void setName(String name) {
    System.out.println("Estableciendo el nombre desde Dog");
    super.setName(name);
  }

  public String toString() {
    return "Dog[" + this.getName() +  "]";
  }

  public void doSomething() {
    System.out.println("Te ladro!");
  }

}
// private, [package-private], protected, public