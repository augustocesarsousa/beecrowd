package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1133 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int x = scanner.nextInt();
    int y = scanner.nextInt();

    if (x > y) {
      int temp = x;
      x = y;
      y = temp;
    }

    for (int i = (x + 1); i < y; i++) {
      if (i % 5 == 2 || i % 5 == 3)
        System.out.println(i);
    }

    scanner.close();
  }
}
