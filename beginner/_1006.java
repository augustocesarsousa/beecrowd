package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1006 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    final double p1 = 2;
    final double p2 = 3;
    final double p3 = 5;
    double a, b, c, avg;

    a = scanner.nextDouble();
    b = scanner.nextDouble();
    c = scanner.nextDouble();
    avg = (a * p1 + b * p2 + c * p3) / (p1 + p2 + p3);

    System.out.println("MEDIA = " + String.format("%.1f", avg));

    scanner.close();
  }
}
