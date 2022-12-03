package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1146 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int x;

    while ((x = scanner.nextInt()) != 0) {
      for (int i = 1; i <= x; i++) {
        if (i == x)
          System.out.println(i + "");
        else
          System.out.print(i + " ");
      }
    }

    scanner.close();
  }
}
