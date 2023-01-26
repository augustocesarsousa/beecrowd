package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1160 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    int PA, PB, years;
    double G1, G2;

    while (T > 0) {
      years = 0;
      T--;
      PA = scanner.nextInt();
      PB = scanner.nextInt();
      G1 = scanner.nextDouble();
      G2 = scanner.nextDouble();

      while (PA <= PB) {
        PA += (PA * G1) / 100;
        PB += (PB * G2) / 100;
        years++;

        if (years > 100) {
          System.out.println("Mais de 1 seculo.");
          break;
        }
      }

      if (years <= 100) {
        System.out.println(years + " anos.");
      }
    }
    scanner.close();
  }
}
