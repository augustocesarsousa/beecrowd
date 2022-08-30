package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * _1051
 */
public class _1051 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    double salary = scanner.nextDouble();

    if (salary <= 2000d) {
      System.out.println("Isento");
    } else if (salary <= 3000d) {
      System.out.printf("R$ %.2f\n", ((salary - 2000d) * 0.08));
    } else if (salary <= 4500d) {
      System.out.printf("R$ %.2f\n", ((salary - 3000d) * 0.18) + 80);
    } else {
      System.out.printf("R$ %.2f\n", ((salary - 4500d) * 0.28) + 350);
    }

    scanner.close();
  }
}
