package beginner;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * _1048
 */
public class _1048 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    double salary = scanner.nextDouble();
    double newSalary = 0d;
    double readjustment = 0d;
    int percent = 0;

    if (salary <= 400d) {
      percent = 15;
      readjustment = (salary / 100) * percent;
    } else if (salary <= 800d) {
      percent = 12;
      readjustment = (salary / 100) * percent;
    } else if (salary <= 1200d) {
      percent = 10;
      readjustment = (salary / 100) * percent;
    } else if (salary <= 2000d) {
      percent = 7;
      readjustment = (salary / 100) * percent;
    } else if (salary > 2000d) {
      percent = 4;
      readjustment = (salary / 100) * percent;
    }

    newSalary = salary + readjustment;

    System.out.println("Novo salario: " + df.format(newSalary));
    System.out.println("Reajuste ganho: " + df.format(readjustment));
    System.out.println("Em percentual: " + percent + " %");

    scanner.close();
  }
}
