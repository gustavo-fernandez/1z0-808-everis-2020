import java.time.LocalDate;

public class Dates {

  public final static void main(String... args) {
    LocalDate tomorrow = LocalDate.of(2020, 5, 8);
    System.out.println(tomorrow); // yyyy-MM-dd

    LocalDate today = LocalDate.now();
    System.out.println(today);

    LocalDate date = LocalDate.parse("2018-01-29"); // Formato ISO
    System.out.println(date);

    java.time.LocalTime time = java.time.LocalTime.now();
    System.out.println(time);
  }

}