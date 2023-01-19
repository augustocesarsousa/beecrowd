package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1157 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    for (int i = 1; i <= N; i++) {
      if (N % i == 0) {
        System.out.println(i);
      }
    }

    scanner.close();
  }
}
