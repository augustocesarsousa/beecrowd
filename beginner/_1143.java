package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1143 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println(
        i + " " + ((int) Math.pow(i, 2)) + " " + ((int) Math.pow(i, 3))
      );
    }

    scanner.close();
  }
}
