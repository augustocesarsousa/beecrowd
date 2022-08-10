package beginner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * _1045
 */
public class _1045 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    List<Double> arrayOfNumbers = new ArrayList<>();

    arrayOfNumbers.add(scanner.nextDouble());
    arrayOfNumbers.add(scanner.nextDouble());
    arrayOfNumbers.add(scanner.nextDouble());

    arrayOfNumbers.sort((Double a, Double b) -> a > b ? -1 : 1);

    double a = arrayOfNumbers.get(0);
    double b = arrayOfNumbers.get(1);
    double c = arrayOfNumbers.get(2);

    if (a >= (b + c)) {
      System.out.println("NAO FORMA TRIANGULO");
      System.exit(0);
    }

    if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
      System.out.println("TRIANGULO RETANGULO");
    }

    if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
      System.out.println("TRIANGULO OBTUSANGULO");
    }

    if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
      System.out.println("TRIANGULO ACUTANGULO");
    }

    if (a == b && b == c) {
      System.out.println("TRIANGULO EQUILATERO");
    }

    if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a)) {
      System.out.println("TRIANGULO ISOSCELES");
    }

    scanner.close();
  }
}
