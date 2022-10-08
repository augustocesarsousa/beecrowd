package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1079 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    double[] results = new double[count];
    double n1, n2, n3;

    for (int i = 0; i < count; i++) {
      n1 = scanner.nextDouble();
      n2 = scanner.nextDouble();
      n3 = scanner.nextDouble();
      results[i] = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
    }

    for (double r : results) {
      System.out.println(String.format("%.1f", r));
    }

    scanner.close();
  }
}
