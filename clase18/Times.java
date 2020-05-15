import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static java.lang.System.out;

public class Times {

  public static void main(String... args) {
    LocalDateTime now = LocalDateTime.now();
    out.println(now);
    out.println(now.format(
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH")));
    out.println(now.format(
      DateTimeFormatter.ofPattern("yyyy-mm-dd'T'hh")));
    out.println(now.format(
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS")));
  }

}