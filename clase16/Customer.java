public class Customer {

  private String name;
  private int age;
  private boolean married;
  private Boolean flag;

  // Java Bean Specification
  public void setName(String newName) {
    this.name = newName;
  }
  public String getName() {
    return name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public int getAge() {
    return this.age;
  }
  public void setMarried(boolean married) {
    this.married = married;
  }
  public boolean isMarried() {
    return this.married;
  }
  // Boolean Wrapper
  public Boolean getFlag() {
    return this.married;
  }

}