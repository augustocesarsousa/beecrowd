package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1153 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    for (int i = N-1; i > 0; i--) {
      N *= i;
    }
    System.out.println(N);
    scanner.close();
  }
}
