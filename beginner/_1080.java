package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1080 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int value = 0;
    int valueTemp = 0;
    int position = 0;

    for (int i = 1; i <= 100; i++) {
      valueTemp = scanner.nextInt();
      if (valueTemp > value) {
        value = valueTemp;
        position = i;
      }
    }

    System.out.println(value);
    System.out.println(position);

    scanner.close();
  }
}
