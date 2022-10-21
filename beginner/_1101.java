package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1101 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    int n = scanner.nextInt();
    int sum = 0;

    while (m > 0 && n > 0) {
      if (m > n) {
        int temp = m;
        m = n;
        n = temp;
      }

      for (int i = m; i <= n; i++) {
        System.out.print(i + " ");
        sum += i;
      }

      System.out.println("Sum=" + sum);

      m = scanner.nextInt();
      n = scanner.nextInt();
      sum = 0;
    }

    scanner.close();
  }
}
