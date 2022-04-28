package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1001 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int A, B, X;

    A = scanner.nextInt();
    B = scanner.nextInt();
    X = A + B;

    System.out.println("X = " + X);

    scanner.close();
  }
}
