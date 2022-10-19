package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1099 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int x = 0;
    int y = 0;
    int sum = 0;

    for (int i = 0; i < n; i++) {
      x = scanner.nextInt();
      y = scanner.nextInt();

      if (x > y) {
        int temp = x;
        x = y;
        y = temp;
      }

      for (int j = x + 1; j < y; j++) {
        if (j % 2 != 0 && j < y) {
          sum += j;
        }
      }

      System.out.println(sum);
      sum = 0;
    }

    scanner.close();
  }
}
