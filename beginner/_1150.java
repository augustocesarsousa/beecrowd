package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1150 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int temp = A;
    int Z = scanner.nextInt();
    int sum = 1;

    while (Z <= A)
      Z = scanner.nextInt();

    while (temp <= Z) {
      A++;
      temp += A;
      sum++;
    }

    System.out.println(sum);
    scanner.close();
  }
}
