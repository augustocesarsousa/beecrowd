package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1151 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int a = 0, b = 1, c;
    System.out.print(a + " " + b);
    for (int i = 2; i < N; i++) {
      c = a + b;
      System.out.print(" " + c);
      a = b;
      b = c;
    }
    System.out.println("");
    scanner.close();
  }
}
