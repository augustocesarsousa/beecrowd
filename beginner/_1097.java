package beginner;

import java.io.IOException;

public class _1097 {

  public static void main(String[] args) throws IOException {
    int i = 1;
    int x = 7;
    while (i <= 9) {
      for (int j = x; j > x - 3; j--) {
        System.out.println("I=" + i + " J=" + j);
      }
      i += 2;
      x += 2;
    }
  }
}
