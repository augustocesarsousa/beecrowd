package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1008 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int employeeNumber, hoursWorked;
    double valuePerHour, salary;

    employeeNumber = scanner.nextInt();
    hoursWorked = scanner.nextInt();
    valuePerHour = scanner.nextDouble();
    salary = hoursWorked * valuePerHour;

    System.out.println("NUMBER = " + employeeNumber);
    System.out.println("SALARY = U$ " + String.format("%.2f", salary));

    scanner.close();
  }
}
