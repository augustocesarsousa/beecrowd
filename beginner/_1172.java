package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1172 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int[] vector = new int[10];

    for (int i = 0; i < vector.length; i++) {
      vector[i] = scanner.nextInt();
    }

    for (int i = 0; i < vector.length; i++) {
      if (vector[i] < 1) {
        vector[i] = 1;
      }
      System.out.println("X[" + i + "] = " + vector[i]);
    }
    scanner.close();
  }
}
