package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1115 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int x = 0;
    int y = 0;

    while ((x = scanner.nextInt()) != 0 && (y = scanner.nextInt()) != 0) {
      if (x > 0 && y > 0) {
        System.out.println("primeiro");
      }
      if (x < 0 && y > 0) {
        System.out.println("segundo");
      }
      if (x < 0 && y < 0) {
        System.out.println("terceiro");
      }
      if (x > 0 && y < 0) {
        System.out.println("quarto");
      }
    }

    scanner.close();
  }
}
