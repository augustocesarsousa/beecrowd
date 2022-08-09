package beginner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * _1042
 */
public class _1042 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    List<Integer> arrayOfNumbers = new ArrayList<>();
    List<Integer> arrayOfNumbers2 = new ArrayList<>();

    arrayOfNumbers.add(scanner.nextInt());
    arrayOfNumbers.add(scanner.nextInt());
    arrayOfNumbers.add(scanner.nextInt());

    arrayOfNumbers2.addAll(arrayOfNumbers);

    arrayOfNumbers.sort((Integer a, Integer b) -> a < b ? -1 : 1);
    arrayOfNumbers.forEach(System.out::println);
    System.out.println("");
    arrayOfNumbers2.forEach(System.out::println);

    scanner.close();
  }
}
