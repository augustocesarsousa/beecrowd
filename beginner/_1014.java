package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1014 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int kms = scanner.nextInt();
    double liters = scanner.nextDouble();

    double kmPerLiter = kms / liters;

    System.out.println(String.format("%.3f", kmPerLiter) + " km/l");

    scanner.close();
  }
}
