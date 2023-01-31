package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1173 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int[] vector = new int[10];
    int n = scanner.nextInt();

    vector[0] = n;

    for (int i = 1; i < vector.length; i++) {
      vector[i] = vector[i - 1] * 2;
    }

    for (int i = 0; i < vector.length; i++) {
      System.out.println("N[" + i + "] = " + vector[i]);
    }
    scanner.close();
  }
}
