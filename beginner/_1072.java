package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1072 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int x = 0;
    int in = 0;
    int out = 0;

    for (int i = 0; i < n; i++) {
      x = scanner.nextInt();
      if (x >= 10 && x <= 20) {
        in++;
      } else {
        out++;
      }
    }

    System.out.println(in + " in");
    System.out.println(out + " out");
    scanner.close();
  }
}
