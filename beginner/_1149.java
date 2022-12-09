package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1149 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int N = scanner.nextInt();
    int result = 0;

    while (N <= 0) {
      N = scanner.nextInt();
    }

    for (int i = 0; i < N; i++) {
      result += A;
      A++;
    }

    System.out.println(result);
    scanner.close();
  }
}
