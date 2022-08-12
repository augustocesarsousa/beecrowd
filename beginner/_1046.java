package beginner;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * _1046
 */
public class _1046 {

  public static void main(String[] args) throws IOException, ParseException {
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");

    String[] hour = scanner.nextLine().split(" ");

    Date date1 = simpleDateFormat.parse(hour[0]);
    Date date2 = simpleDateFormat.parse(hour[1]);

    if (date2.before(date1) || date1.equals(date2)) {
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(date2);
      calendar.add(Calendar.DAY_OF_MONTH, 1);
      date2 = calendar.getTime();
    }

    long diffInMilliseconds = Math.abs(date2.getTime() - date1.getTime());
    long diffInHours = (diffInMilliseconds / (60 * 60 * 1000));

    System.out.println("O JOGO DUROU " + diffInHours + " HORA(S)");

    scanner.close();
  }
}
