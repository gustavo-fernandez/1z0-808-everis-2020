import java.time.Period;

public class Periods {

  final public static void main(String args[]) {
    Period period0 = Period.ofDays(1);
    System.out.println(period0);

    Period period1 = Period.of(1, 2, 3);
    System.out.println(period1);

    Period period2 = Period.of(1, 2, 31);
    System.out.println(period2);

    Period period3 = Period.of(1, 13, 60);
    System.out.println(period3);

    Period period4 = period3.normalized();
    System.out.println(period4);

    Period period5 = Period.of(0, 1, 2);
    System.out.println(period5);

    Period period6 = Period.of(1, 0, 2);
    System.out.println(period6);

    // Cuidado!!!
    Period period7 = Period.ofYears(1).ofDays(2);
    System.out.println(period7);

    System.out.println(period3.getDays());
  }

}