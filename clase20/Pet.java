public abstract class Pet /* extends Object */{
  private String name;
  protected String getName() { return name; }
  protected void setName(String name) { this.name = name; }
  public String toString() { return "Pet[" + name + "]"; }
  public abstract void doSomething();
}
// Cuando sobreescribes solo puedes usar modificadores de acceso más permisivos