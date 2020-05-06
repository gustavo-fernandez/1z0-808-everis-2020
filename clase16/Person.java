public class Person {

  public Integer getId() {
    return this.id;
  }
  public String getName() {
    return this.name;
  }
  Person(int id, String name) {
    System.out.println("Constructor");
    this.id = id;
    this.name = name;
  }
  {
    this.name = buildName("Instance Initialization block 1");
  }
  private Integer id;
  private String name = buildName("Initialization");
  {
    this.name = buildName("Instance Initialization block 2");
  }

  private String buildName(String str) {
    System.out.println(str);
    return "Hola";
  }

  public static void main(String... args) {
    Person p = new Person(2, "Manuel");
    System.out.println(p.getId());
    System.out.println(p.getName());
  }

}