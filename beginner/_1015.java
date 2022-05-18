package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1015 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();
    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();

    double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));

    System.out.println(String.format("%.4f", distance));

    scanner.close();
  }
}
