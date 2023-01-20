package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1158 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int X = 0;
    int Y = 0;
    int count = 0;

    while (N > 0) {
      X = scanner.nextInt();
      Y = scanner.nextInt();
      while (Y > 0) {
        if (X % 2 != 0) {
          count += X;
          Y--;
        }
        X++;
      }
      System.out.println(count);
      count = 0;
      N--;
    }
    scanner.close();
  }
}
