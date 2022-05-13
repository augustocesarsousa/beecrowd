package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1013 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    int biggerAB = (a + b + Math.abs(a - b)) / 2;
    int biggerABC = (biggerAB + c + Math.abs(biggerAB - c)) / 2;

    System.out.println(biggerABC + " eh o maior");

    scanner.close();
  }
}
