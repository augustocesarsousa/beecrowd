package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * _1044
 */
public class _1044 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int result = A < B ? B % A : A % B;

    if (result == 0) {
      System.out.println("Sao Multiplos");
    } else {
      System.out.println("Nao sao Multiplos");
    }

    scanner.close();
  }
}
