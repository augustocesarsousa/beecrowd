package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1132 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int sum = 0;

    if (x > y) {
      int temp = x;
      x = y;
      y = temp;
    }

    for (x = x; x <= y; x++) {
      if (x % 13 != 0) sum += x;
    }

    System.out.println(sum);

    scanner.close();
  }
}
