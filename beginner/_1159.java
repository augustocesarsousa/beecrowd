package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1159 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int sum = 0;
    int i = 0;

    while (x != 0) {
      while (i < 5) {
        if (x % 2 == 0) {
          sum += x;
          i++;
        }
        x++;
      }
      System.out.println(sum);
      x = scanner.nextInt();
      sum = 0;
      i = 0;
    }
    scanner.close();
  }
}
