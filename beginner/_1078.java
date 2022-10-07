package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1078 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " x " + n + " = " + i * n);
    }

    scanner.close();
  }
}
