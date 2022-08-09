package beginner;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * _1043
 */
public class _1043 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0");

    List<Double> arrayOfNumbers = new ArrayList<>();
    List<Double> arrayOfNumbers2 = new ArrayList<>();
    Double perimetro;
    Double area;

    arrayOfNumbers.add(scanner.nextDouble());
    arrayOfNumbers.add(scanner.nextDouble());
    arrayOfNumbers.add(scanner.nextDouble());

    arrayOfNumbers2.addAll(arrayOfNumbers);

    arrayOfNumbers.sort((Double a, Double b) -> a < b ? -1 : 1);

    if (
      (arrayOfNumbers.get(0) + arrayOfNumbers.get(1)) > arrayOfNumbers.get(2)
    ) {
      perimetro =
        arrayOfNumbers.get(0) + arrayOfNumbers.get(1) + arrayOfNumbers.get(2);
      System.out.println("Perimetro = " + df.format(perimetro));
    } else {
      area =
        (arrayOfNumbers2.get(0) + arrayOfNumbers2.get(1)) *
        arrayOfNumbers2.get(2) /
        2;
      System.out.println("Area = " + df.format(area));
    }

    scanner.close();
  }
}
