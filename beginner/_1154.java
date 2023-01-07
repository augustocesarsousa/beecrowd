package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1154 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
    int sum = 0;
    double count = 0d;

    while (age >= 0) {
      sum += age;
      count++;
      age = scanner.nextInt();
    }

    System.out.printf("%.2f\n",sum / count);
    scanner.close();
  }
}
