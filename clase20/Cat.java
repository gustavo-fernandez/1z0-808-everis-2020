public class Cat extends Pet {

  public void doSomething() {
    System.out.println("Te araño!");
  }

  public void aranar() {
    this.doSomething();
  }

  public void aranar(int veces) {
    for (int i = 0; i < veces; i++) 
      this.doSomething();
  }

}