package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1113 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int x, y;

    while ((x = scanner.nextInt()) != (y = scanner.nextInt())) {
      if (x > y) {
        System.out.println("Decrescente");
      } else {
        System.out.println("Crescente");
      }
    }

    scanner.close();
  }
}
