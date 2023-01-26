package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1164 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int X, sum;

    for (int i = 0; i < N; i++) {
      X = scanner.nextInt();
      sum = 0;

      for (int j = 1; j < X; j++) {
        if (X % j == 0) {
          sum += j;
        }
      }

      if (sum == X) {
        System.out.println(X + " eh perfeito");
      } else {
        System.out.println(X + " nao eh perfeito");
      }
    }
    scanner.close();
  }
}
