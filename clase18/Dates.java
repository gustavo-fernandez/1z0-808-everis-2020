import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Dates {

  public static void main(String args[]) {
    LocalDate date = LocalDate.of(2020, 4, 1);
    System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy-MMMM-dd")));
    System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("'Today is: 'yyyy-MMMM-dd")));

    LocalDate date2 = LocalDate.parse("2020-1-10", DateTimeFormatter.ofPattern("yyyy-M-dd"));
    System.out.println(date2);

    LocalDate today = LocalDate.now();
    System.out.println(today);
    LocalDate tomorrow = today.plusDays(1);
    System.out.println(tomorrow);

    LocalDate birthday = LocalDate.parse("1992-09-27");
    System.out.println(birthday.getDayOfWeek());
    System.out.println(birthday.getDayOfYear());

    System.out.println(tomorrow.isAfter(today));
    System.out.println(today.isBefore(tomorrow));

    System.out.println(tomorrow.minus(Period.ofDays(1)));
  }

}