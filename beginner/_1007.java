package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1007 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int a, b, c, d, diff;

    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();
    d = scanner.nextInt();
    diff = a * b - c * d;

    System.out.println("DIFERENCA = " + diff);

    scanner.close();
  }
}
