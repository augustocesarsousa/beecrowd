package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1142 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] vect = new int[3];

    vect[0] = 1;
    vect[1] = 2;
    vect[2] = 3;

    for (int i = 0; i < n; i++) {
      System.out.println(vect[0] + " " + vect[1] + " " + vect[2] + " PUM");
      vect[0] += 4;
      vect[1] += 4;
      vect[2] += 4;
    }

    scanner.close();
  }
}
