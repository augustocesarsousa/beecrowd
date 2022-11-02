package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1118 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int count = 0;
    double grade = 0d;
    double sum = 0d;
    int again = 1;

    do {
      while (count < 2) {
        grade = scanner.nextDouble();
        if (grade >= 0 && grade <= 10) {
          sum += grade;
          count++;
        } else {
          System.out.println("nota invalida");
        }
      }

      System.out.println("media = " + String.format("%.2f", sum / 2));

      count = 0;
      sum = 0d;

      do {
        System.out.println("novo calculo (1-sim 2-nao)");
        again = scanner.nextInt();
      } while (again < 1 || again > 2);
    } while (again == 1);

    scanner.close();
  }
}
