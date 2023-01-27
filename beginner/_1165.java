package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1165 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int X;
    boolean isPrimeNumber;

    for (int i = 0; i < N; i++) {
      X = scanner.nextInt();
      isPrimeNumber = true;

      for (int j = 2; j < X; j++) {
        if (X % j == 0) {
          isPrimeNumber = false;
        }
      }

      if (isPrimeNumber) {
        System.out.println(X + " eh primo");
      } else {
        System.out.println(X + " nao eh primo");
      }
    }
    scanner.close();
  }
}
