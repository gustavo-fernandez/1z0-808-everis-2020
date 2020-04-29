public class References {
  
  public static void main(String[] args) {
    Student pepito = new Student("Pepito");
    Student claudia = new Student("Claudia");
    System.out.println(pepito);
    System.out.println(claudia);
    Student claudia2 = Student.copyFrom    (claudia);

    Student claudia3 = claudia2;

    Student claudia4 = new Student(claudia);
    claudia4.diTuNombre();
    System.out.println("Mi nombre es" + claudia4.getNombre());
  }

}

class Student {
  String name;
  Student(String name) {
    this.name = name;
  }

  Student(Student student) {
    this.name = student.name;
  }

  static Student copyFrom(Student student) {
    Student newStudent = new Student(student.name);
    return newStudent;
  }
  void diTuNombre() {
    System.out.println("Hola, soy " + name);
    //return;
  }
  String getNombre() {
    int a = (100);
    if (((((((((a > 10))))))))) {
      return name;
    } else if (a <= 10) {
      return name;
    } else {
      return     ("default");
    }
  }
}